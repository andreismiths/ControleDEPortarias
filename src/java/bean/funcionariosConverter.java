/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;
import entity.Funcionario;
import entity.Portaria;
import javax.faces.application.FacesMessage;
import javax.faces.convert.ConverterException;


/**
 *
 * @author andreismiths
 */
@Named
@RequestScoped
@FacesConverter(value = "funcionariosConverter")
public class funcionariosConverter implements Converter {

@Override
public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                Funcionario funcionario = (Funcionario) fc.getExternalContext().getApplicationMap().get("funcionario");
                return funcionario.getFuncionario().get(Integer.parseInt(value));
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Conversão", "Funcionário não válido"));
            }
        }
        else {
            return null;
        }
    }
 
@Override
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            return String.valueOf(((Funcionario) object).getSiapeUsuario());
        }
        else {
            return null;
        }
    }   

}