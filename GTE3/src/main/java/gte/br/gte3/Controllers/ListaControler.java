package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ListaControler {

    @FXML
    void clickadd(ActionEvent event) {
        System.out.println("Clicou em adicionar");
        HelloApplication.mudaeTela("cadastro");
    }

}
