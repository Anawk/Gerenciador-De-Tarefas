package gte.br.gte3.Controllers;

import gte.br.gte3.Model.Tarefa;
import gte.br.gte3.Model.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.List;

public class ListaControler {

    @FXML
    private TableView<Tarefa> tableview;

    public void atualizarTabelaTarefas(){
        List<Tarefa>listadetarefas = Usuario.getTarefas();
        ObservableList<Tarefa> tarefasObservaveis = FXCollections.observableArrayList(listadetarefas);
        tableview.setItems(tarefasObservaveis);


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
