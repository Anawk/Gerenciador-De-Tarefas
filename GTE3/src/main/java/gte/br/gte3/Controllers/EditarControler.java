package gte.br.gte3.Controllers;

import gte.br.gte3.Model.Categoria;
import gte.br.gte3.Model.Disciplina;
import gte.br.gte3.Model.Tarefa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EditarControler {

    @FXML
    private TextField categoria;

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
    void clickSalvar(ActionEvent event) {
//        // Criar uma nova instância de Tarefa com base nos campos editados
//        Tarefa tarefaEditada = new Tarefa();
//
//        // Configurar os valores da nova tarefa
//        tarefaEditada.setCategoria(new Categoria(categoria.getText()));
//        tarefaEditada.setTitulo(titulo.getText());
//        tarefaEditada.setDescricao(descrição.getText());
//        tarefaEditada.setStatus(status.getText());
//
//        // Converter as strings das datas para LocalDate
//        LocalDate dataInicio = LocalDate.parse(datadeinicio.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        LocalDate dataVencimento = LocalDate.parse(datadevencimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//
//        // Configurar as datas diretamente nos campos da tarefa
//        tarefaEditada.setDataInicio(dataInicio);
//        tarefaEditada.setDataVencimento(dataVencimento);
//
//        tarefaEditada.setDisciplina(new Disciplina(disciplina.getText()));
//
//        // Salvar a nova tarefa no banco de dados
//        Tarefa.salvarTarefa(tarefaEditada);
//
//        // Fechar a janela de edição
//        fecharJanela();
    }


    private void fecharJanela() {
        // Obtém o Stage (janela) atual e fecha
        Stage stage = (Stage) categoria.getScene().getWindow();
        stage.close();
    }
}
