package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Usuario;
import jakarta.persistence.Query;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.hibernate.Session;
public class CadastroControler {
    @FXML
    private TextField senha;

    @FXML
    private TextField usuario;

    @FXML
    private Label aviso;

    private static Usuario usuarioLogado;

    @FXML
    void clickCadastrar(ActionEvent event) {
        HelloApplication.mudaeTela("login");

    }


    @FXML
    void clickEntrar(ActionEvent event) {
        String username = usuario.getText();
        String password = senha.getText();
        Usuario u = verificarUsuarioNoBanco(username, password);

        if (u != null) {
            usuarioLogado = u; // Armazena o usuário logado na variável estática
            System.out.println("Login realizado com sucesso");
            HelloApplication.mudartela2("lista");

        } else {
            aviso.setText("Login inválido!");
        }
    }

    private Session session;
    public Usuario verificarUsuarioNoBanco(String username, String password) {
        String hql = "FROM Usuario u WHERE u.user = :user AND u.password = :password ";
        Query query = session.createQuery(hql);
        query.setParameter("user",username);
        query.setParameter("password",password);
        Usuario usuario = (Usuario) query.getResultList().get(0);

        return usuario;
    }

}

    // if(user.equals("igor") && password.equals("123"))
          //  System.out.println("Login realizado com sucesso");
        //else
          //  aviso.setText("Login inválido!");

//        Usuario u = session.createQuery("select * from usuario where user = "+user+" and senha = "+ password);
//
//        if (u == null)
//            //mostrar ususario n encontado
//        else
//            //reALIZAR O LOGIN
//        System.out.println(user);
//        System.out.println(password);
//        //HelloApplication.mudaeTela("lista");



