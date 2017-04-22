package br.com.alura;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felipe on 22/04/17.
 */
public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void adiciona(Aula aula) {
        aulas.add(aula);
    }
    
    public int getTempoTotal() {
        return aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso: " + getNome()
                + ", Instrutor: " + getInstrutor() +
                ", Aulas:" + getAulas();
    }
}
