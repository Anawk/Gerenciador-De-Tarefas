package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Categoria;
import gte.br.gte3.Model.Disciplina;
import gte.br.gte3.Model.Tarefa;
import gte.br.gte3.Model.Usuario;
import gte.br.gte3.Services.TarefaService;
import gte.br.gte3.Util.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.net.URL;
import java.util.*;

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

    public void atualizarTabelaTarefas() {
        List<Tarefa> listaDeTarefas = carregarTarefasDoBanco();

        if (listaDeTarefas != null) {
            ObservableList<Tarefa> tarefasObservaveis = FXCollections.observableArrayList(listaDeTarefas);
            tableview.setItems(tarefasObservaveis);
        } else {
            // A lista de tarefas é null, trate conforme necessário
            System.out.println("A lista de tarefas é null");
            // Você pode lançar uma exceção ou realizar outra ação apropriada
        }
    }

    private List<Tarefa> carregarTarefasDoBanco() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Tarefa> query = session.createQuery("FROM Tarefa", Tarefa.class);
            return query.list();
        } catch (HibernateException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
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
        atualizarTabelaTarefas();
    }

}
