package gte.br.gte3.Controllers;

import gte.br.gte3.HelloApplication;
import gte.br.gte3.Model.Disciplina;
import gte.br.gte3.Model.Tarefa;
import gte.br.gte3.Model.Usuario;
import gte.br.gte3.Util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;


public class AdicionarControler {

    @FXML
    private TextField titulo;

    @FXML
    private TextField descrição;

    @FXML
    private TextField status;

    @FXML
    private TextField datadeinicio;

    @FXML
    private TextField datadevencimento;

    @FXML
    private TextField disciplina;

    @FXML
    private TextField categoria;

//    inicializer{
//        preecher os combos
//    }

    @FXML
    void clickAdicionar(ActionEvent event) {
        String Titulo = titulo.getText();
        String Descricao = descrição.getText();
        String Status = status.getText();
        Date DataInicio = new Date(datadeinicio.getText());
        Date DataVencimento = new Date(datadevencimento.getText());
        // Disciplina disciplina = new Disciplina(disciplina.setNome();)// passar por id de disciplina

        Tarefa t = Tarefa(Titulo, Descricao, Status, DataInicio, DataVencimento, cbxDisciplina.getValue(), categoria);

        if (t != null) {
            Session s = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = s.beginTransaction();
            s.persist(t);
            transaction.commit();
            s.close();
            HelloApplication.mudartela2("lista");

        } else {
            HelloApplication.mudaeTela6("lista");
        }
    }
}
