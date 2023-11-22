package gte.br.gte3.Model;

import jakarta.persistence.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.List;

@Entity
@Table
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Tarefa> disciplinas;


    private List<String> tarefas;


    public Categoria(String nome) {
        this.nome = nome;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tarefa> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Tarefa> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<String> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<String> tarefas) {
        this.tarefas = tarefas;
    }
}