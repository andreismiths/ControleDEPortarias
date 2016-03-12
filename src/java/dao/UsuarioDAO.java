package br.com.usuario.dao;

import br.com.usuario.entity.Usuario;
import br.com.usuario.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Jean
 */
public class UsuarioDAO {

    private Session sessao; // classes do hibernate
    private Transaction trans;

    public void addUsuario(Usuario u) {
        try {
            //pegando getSessionfactory do HiberteneUtil, abrindo uma sessão e iniciando um transação;
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            Usuario umUsuario = new Usuario();

            umUsuario.setSiapeUsuario(u.getSiapeUsuario());
            umUsuario.setCpfUsuario(u.getCpfUsuario());
            umUsuario.setSenhaUsuario(u.getSenhaUsuario());
            umUsuario.setRgUsuario(u.getRgUsuario());
            umUsuario.setNomeUsuario(u.getNomeUsuario());
            umUsuario.setSexoUsuario(u.getSexoUsuario());
            umUsuario.setDataNascimUsuario(u.getDataNascimUsuario());
            umUsuario.setEmailUsuario(u.getEmailUsuario());

            sessao.save(umUsuario);
            trans.commit(); // confirma que foi salvo no banco

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
    }

    //remoção
    public void removeUsuario(Usuario u) {

        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(u);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
    }
}
