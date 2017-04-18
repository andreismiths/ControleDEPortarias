/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author andreismiths
 */
@ManagedBean
public class LoginBean {
    String siape;
    String senha;
    
    
  public String login() {
        
        if(getSiape()!= null && getSiape().equals("admin") && getSenha() != null && getSenha().equals("admin")) {
            
            return "/Telas/PaginaInicial";
        } 
        if(getSiape()!= null && getSiape().equals("professor") && getSenha() != null && getSenha().equals("professor")) {
            
            return "/Telas/Funcionario/MinhasPortarias";
        } 
        else {
           
            return "";
        }
         
      
    }   

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
 
   
}

   