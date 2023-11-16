package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
        String user = usuario.getText();
        String password = senha.getText();
        Usuario u = verificarUsuarioNoBanco(user, password);

        if (u != null) {
            usuarioLogado = u; // Armazena o usuário logado na variável estática
            System.out.println("Login realizado com sucesso");
            HelloApplication.mudartela2("lista");

        } else {
            aviso.setText("Login inválido!");
        }
    }
    private Usuario verificarUsuarioNoBanco(String user, String password) {
        if (user.equals("igor") && password.equals("123")) {
            return new Usuario("igor", "123", "njdjjydtyj", "ana", "hrrjt"); // Supondo que Usuario tenha um construtor apropriado
        }

        return null;
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



