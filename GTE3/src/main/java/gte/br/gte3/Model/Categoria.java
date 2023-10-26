package gte.br.gte3.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
@Table
public class Categoria {

    //Esta classe é responsavel por categorizar tarefas de forma genérica
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Chave identificadora de Categoria
    @Column
    private String nome; //Nome da categoria
    @Column
    private ArrayList<Tarefa> tarefas; //Usuário terá uma lista de tarefas que precisará ser feita

    //construtor
    public Categoria(String nome) {
        this.nome = nome;
    }

    //getters e setters
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

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tarefas=" + tarefas +
                '}';
    }
}