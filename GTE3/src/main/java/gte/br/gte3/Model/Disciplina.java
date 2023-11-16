package gte.br.gte3.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
@Table
@Entity
public class Disciplina {

    //Esta classe é responsavel por representar uma disciplina escolar
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Chave identificadora do usuario
    @Column
    private String nome; //Nome da Disciplina
//    @OneToMany
//    @JoinColumn(name = "Disciplina")
//    private ArrayList<Tarefa> tarefas; //Usuário terá uma lista de tarefas que precisará ser feita


    //construtor
    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina(){
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

//    public ArrayList<Tarefa> getTarefas() {
//        return tarefas;
//    }
//
//    public void setTarefas(ArrayList<Tarefa> tarefas) {
//        this.tarefas = tarefas;
//    }

    @Override
    public String toString() {
        return  nome;
    }
}