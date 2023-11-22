package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Usuario;
import gte.br.gte3.Util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class CadastroControler {

    @FXML
    private TextField usuario;

    @FXML
    private Label aviso;

    @FXML
    private PasswordField Senha;

    private static Usuario usuarioLogado;

    @FXML
    void clickCadastrar(ActionEvent event) {
        HelloApplication.mudaeTela("login");

    }


    @FXML
    void clickEntrar(ActionEvent event) {
        String user = usuario.getText();
        String password = Senha.getText();
        System.out.println("Usuario" + user + "Senha" + password);
        Usuario u = verificarUsuarioNoBanco(user, password);

        if (u != null) {
            usuarioLogado = u;
            System.out.println("Login realizado com sucesso");
            HelloApplication.mudartela2("lista");
        } else {
            aviso.setText("Login inválido!");
       }
    }

    private Usuario verificarUsuarioNoBanco(String user1, String senha1) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "FROM Usuario WHERE Username = :user AND Password = :senha";
            Query<Usuario> query = session.createQuery(hql, Usuario.class);
            query.setParameter("user", user1);
            query.setParameter("senha", senha1);

            Usuario usuario = query.getSingleResult();

            return usuario;
        } catch (HibernateException e) {
            e.printStackTrace();
            aviso.setText("Erro ao verificar usuário no banco de dados.");
            return null;
        }
    }
}




