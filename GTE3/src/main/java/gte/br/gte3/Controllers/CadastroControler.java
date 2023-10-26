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

    @FXML
    void clickCadastro(ActionEvent event) {
        String user = usuario.getText();
        String password = senha.getText();

        if(user.equals("igor") && password.equals("123"))
            System.out.println("Login realizado com sucesso");
        else
            aviso.setText("Login inválido!");

//        Usuario u = session.createQuery("select * from usuario where user = "+user+" and senha = "+ password);
//
//        if (u == null)
//            //mostrar ususario n encontado
//        else
//            //reALIZAR O LOGIN
        System.out.println(user);
        System.out.println(password);
        //HelloApplication.mudaeTela("lista");
    }

}
