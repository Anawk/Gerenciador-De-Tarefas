package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Categoria;
import gte.br.gte3.Model.Disciplina;
import gte.br.gte3.Model.Tarefa;
import gte.br.gte3.Model.Usuario;
import gte.br.gte3.Services.TarefaService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class ListaControler implements Initializable {

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


    TarefaService tabelsService = new TarefaService();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mostrarTarefas();
    }

    public void mostrarTarefas() {
        tableview.setItems(FXCollections.observableArrayList());
        ObservableList<Tarefa> list = getTarefas();
        tableview.setItems(list);
        colTitulo.setCellValueFactory(new PropertyValueFactory<Tarefa, String>("Titulo"));
        colDescricao.setCellValueFactory(new PropertyValueFactory<Tarefa, String>("Descricao"));
        colStatus.setCellValueFactory(new PropertyValueFactory<Tarefa, String>("Status"));
        colDataInicio.setCellValueFactory(new PropertyValueFactory<Tarefa, Date>("DataInicio"));
        colDataVencimento.setCellValueFactory(new PropertyValueFactory<Tarefa, Date>("DataVencimento"));
       colCategoria.setCellValueFactory(new PropertyValueFactory<Tarefa, Categoria>("categoria"));
     colDisciplina.setCellValueFactory(new PropertyValueFactory<Tarefa, Disciplina>("disciplina"));
    }

        public ObservableList<Tarefa> getTarefas(){
        ObservableList<Tarefa> consults = FXCollections.observableArrayList();
        consults.addAll(TarefaService.listaTarefa());
        return consults;
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
    void getData(MouseEvent event) {
    }

    @FXML
    void clickadd(ActionEvent event) {
       HelloApplication.mudaeTela5("adicionar");

    }

}
