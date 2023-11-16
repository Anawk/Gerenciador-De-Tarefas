package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Categoria;
import gte.br.gte3.Model.Disciplina;
import gte.br.gte3.Model.Tarefa;
import gte.br.gte3.Model.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class ListaControler {

    @FXML
    private TableColumn<Tarefa, String> colTitulo;

    @FXML
    private TableColumn<Tarefa, Categoria> colCategoria;

    @FXML
    private TableColumn<Tarefa, Date> colDataInicio;

    @FXML
    private TableColumn<Tarefa, Date> colDataVencimento;

    @FXML
    private TableColumn<Tarefa, String> colDescricao;

    @FXML
    private TableColumn<Tarefa, Disciplina> colDisciplina;

    @FXML
    private TableColumn<Tarefa, String> colStatus;


    TabelaService tabelsService = new TabelaService();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mostrarTarefas();
    }


    @FXML
    private TableView<Tarefa> tableview;

    public void atualizarTabelaTarefas(){
        List<Tarefa>listadetarefas = Usuario.getTarefas();
        ObservableList<Tarefa> tarefasObservaveis = FXCollections.observableArrayList(listadetarefas);
        tableview.setItems(tarefasObservaveis);


    }

    @FXML
    void clickCategorizacao(ActionEvent event) {
        HelloApplication.mudaeTela3("categorizacao");
    }


    @FXML
    void clickEditar(ActionEvent event) {

    }

    @FXML
    void clickExcluir(ActionEvent event) {

    }

    @FXML
    void clickadd(ActionEvent event) {
//        Tarefa tarefa = new Tarefa("Título","Descrição","Status","DataInicio","DataVencimento","Discliplina", "Categoria","DataConclusão");
//        listadetarefas.add(novaTarefa); // Adicione a nova tarefa à lista
//        tableview.getItems().setAll(listadetarefas); // Atualize a TableView
    }

}
