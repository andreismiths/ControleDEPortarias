/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

/**
 *
 * @author andreismiths
 */

import entity.Funcionario;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
 
@FacesConverter(value="funcionarioConverter")
public class FuncionarioConverter implements Converter {
 
    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        Funcionario funcionario = (Funcionario) context.getELContext().getELResolver().getValue(context.getELContext(), null, "Funcionario");
 
        return funcionario.PegaNomeUsuario(key);
    }
 
    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        return arg2.toString();
    }
}