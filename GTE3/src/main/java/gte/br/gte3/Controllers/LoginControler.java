package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import gte.br.gte3.Model.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class LoginControler {

    @FXML
    private TextField username;

    @FXML
    private TextField email;

    @FXML
    private TextField nome;

    @FXML
    private TextField sobrenome;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField confirmPassword;

    private void cadastrarUsuario(String username, String password, String email, String nome, String sobrenome) {

        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(password);
        usuario.setEmail(email);
        usuario.setNome(nome);
        usuario.setSobrenome(sobrenome);


        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(usuario);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void clickLogin(ActionEvent event) {
        String usernameText = username.getText();
        String passwordText = password.getText();
        String confirmPasswordText = confirmPassword.getText();
        String emailText = email.getText();
        String nomeText = nome.getText();
        String sobrenomeText = sobrenome.getText();

        if (!passwordText.equals(confirmPasswordText)) {
            System.out.println("Erro: As senhas são diferentes.");
            return;
        }
        cadastrarUsuario(usernameText, passwordText, emailText, nomeText, sobrenomeText);
        HelloApplication.mudaeTela7("lista");
    }



}