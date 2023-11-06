package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class CategorizacaoControler {

    @FXML
    private TableView<?> TableDisci;

    @FXML
    private TableView<?> Tablecat;


    @FXML
    void clickVoltar(ActionEvent event) {
        HelloApplication.mudaeTela4("lista");

    }
    @FXML
    void ClickAdicionarCategoria(ActionEvent event) {

    }

    @FXML
    void ClickExcluirCategoria(ActionEvent event) {

    }

    @FXML
    void clickAdicionarDisciplina(ActionEvent event) {

    }

    @FXML
    void clickEditarCategoria(ActionEvent event) {

    }

    @FXML
    void clickEditarDisciplina(ActionEvent event) {

    }

    @FXML
    void clickExcluirDisciplina(ActionEvent event) {

    }

}
