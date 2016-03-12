package br.com.usuario.bean;

import br.com.usuario.dao.UsuarioDAO;
import br.com.usuario.entity.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jean
 */
@Named(value = "usuarioJSFManagedBean")
@SessionScoped
public class UsuarioJSFManagedBean implements Serializable {

    /**
     * Creates a new instance of UsuarioJSFManagedBean
     */
    //nessario impotar a calsse Pojo qu eé usuario;
    //necesario importar usuarioDAO;
    private Usuario usuario = new Usuario();// instancindo uma variavel do tipo usuario
    private UsuarioDAO userDAO = new UsuarioDAO();// instanciando uma variavel do tio usuarioDAO

    public UsuarioJSFManagedBean() {
    }

    //metodo que irá se comunicar com a interface;
    public String adcionarUsuario() {// adciona um usuario e envia, impreme a mensagme de sucesso;
        userDAO.addUsuario(usuario);
        usuario.setSiapeUsuario(null);//aqui depois que for insrido os campos no banco de dadso não aparecer os dados d ussuario na tela
        usuario.setSenhaUsuario(null);
        return "index";

    }

    //remove usuario
    public String removeUsuario() {
        userDAO.removeUsuario(usuario);
        return "removido com Sucesso!";

    }

    //necessitmos utilizar apenas os get e set da classe usuario para podermos trabalhar como  a interface;
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // equals e hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioJSFManagedBean other = (UsuarioJSFManagedBean) obj;
        return Objects.equals(this.usuario, other.usuario);
    }

}
