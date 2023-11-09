package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Usuario;
import gte.br.gte3.Util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoginControler {

    @FXML
    private TextField username;

    @FXML
    private TextField passsword;

    @FXML
    private TextField email;

    @FXML
    private TextField nome;

    @FXML
    private TextField sobrenome;

    @FXML
    void clickLogin(ActionEvent event) {
       Usuario usuario = new Usuario(username.getText(), passsword.getText(), email.getText(), nome.getText(), sobrenome.getText());
       SalvarUsuario(usuario);
        HelloApplication.mudaeTela5("lista");
    }
    private static final Session session = HibernateUtil.getSessionFactory().openSession();
    public void SalvarUsuario(Usuario u){

        Transaction transaction = session.beginTransaction();
        session.persist(u);
        transaction.commit();
    }
    public static Session getSession(){
        return session;
    }
}