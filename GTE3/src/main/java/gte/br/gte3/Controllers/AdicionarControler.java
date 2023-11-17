package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Categoria;
import gte.br.gte3.Model.Disciplina;
import gte.br.gte3.Model.Tarefa;
import gte.br.gte3.Util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class AdicionarControler {

    @FXML
    private TextField titulo;

    @FXML
    private TextField descricao;

    @FXML
    private TextField status;

    @FXML
    private DatePicker dataInicioPicker;

    @FXML
    private DatePicker dataVencimentoPicker;

    @FXML
    private TextField disciplinaTextField;

    @FXML
    private TextField categoriaTextField;

    @FXML
    private void initialize() {

        cbxCategoria.getItems().addAll(buscarCategoriasNoBancoDeDados());

        cbxDisciplina.getItems().addAll(buscarDisciplinasNoBancoDeDados());
    }

    @FXML
    void clickAdicionar(ActionEvent event) {
        String Titulo = titulo.getText();
        String Descricao = descricao.getText();
        String Status = status.getText();

        Date dataInicio = dataInicioPicker.getValue() != null ? Date.valueOf(dataInicioPicker.getValue()) : null;
        Date dataVencimento = dataVencimentoPicker.getValue() != null ? Date.valueOf(dataVencimentoPicker.getValue()) : null;

        Categoria categoriaSelecionada = cbxCategoria.getValue();
        Disciplina disciplinaSelecionada = cbxDisciplina.getValue();


        if (categoriaSelecionada != null && disciplinaSelecionada != null && dataInicio != null && dataVencimento != null) {
            Tarefa t = new Tarefa(Titulo, Descricao, Status, dataInicio, dataVencimento, disciplinaSelecionada, categoriaSelecionada);

            Session s = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = s.beginTransaction();
            s.persist(t);
            transaction.commit();
            s.close();
            HelloApplication.mudartela2("lista");

        } else {
            System.out.println("Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private ComboBox<Categoria> cbxCategoria;

    @FXML
    private ComboBox<Disciplina> cbxDisciplina;


    private List<Categoria> buscarCategoriasNoBancoDeDados() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Categoria> query = session.createQuery("FROM Categoria", Categoria.class);
            return query.list();
        } catch (HibernateException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private List<Disciplina> buscarDisciplinasNoBancoDeDados() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Disciplina> query = session.createQuery("FROM Disciplina", Disciplina.class);
            return query.list();
        } catch (HibernateException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}