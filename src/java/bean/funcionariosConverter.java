/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;
import entity.Funcionario;


/**
 *
 * @author andreismiths
 */
@Named
@RequestScoped
@FacesConverter(value = "funcionariosConverter")
public class funcionariosConverter implements Converter {


@Override
public Object getAsObject(FacesContext ctx, UIComponent component, String value) {
    if (value != null) {
      return this.getAttributesFrom(component).get(value);
}
    return null;
    }


@Override
public String getAsString(FacesContext ctx, UIComponent component, Object value) {
    if (value != null && !"".equals(value)) {
        Funcionario entity = (Funcionario) value;

    if (entity.getSiapeUsuario() != null) {
        this.addAttribute(component, entity);

    if (entity.getSiapeUsuario() != null) {
        return String.valueOf(entity.getSiapeUsuario());
    }
        return (String) value;
    }
    }
        return "";

}


private void addAttribute(UIComponent component, Funcionario o) {
    this.getAttributesFrom(component).put(o.getSiapeUsuario(), o);
}

private Map<String, Object> getAttributesFrom(UIComponent component) {
    return component.getAttributes();
}

}