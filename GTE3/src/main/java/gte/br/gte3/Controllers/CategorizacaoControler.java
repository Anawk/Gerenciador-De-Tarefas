package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Categoria;
import gte.br.gte3.Model.Disciplina;
import gte.br.gte3.Util.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CategorizacaoControler {

    @FXML
    private TableView<Disciplina> TableDisci;

    @FXML
    private TableColumn<Disciplina, String> nomeDis;

    @FXML
    private TableView<Categoria> Tablecat;

    @FXML
    private TableColumn<Categoria, String> nomeCat;


    @FXML
    void ClickAdicionarCategoria(ActionEvent event) {
        HelloApplication.mudaeTela9("adicionarcat");
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

    @FXML
    void clickVoltar(ActionEvent event) {

    }
}