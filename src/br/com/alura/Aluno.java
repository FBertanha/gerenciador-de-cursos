package br.com.alura;

/**
 * Created by felipe on 22/04/17.
 */
public class Aluno {
    private String nome;
    private Integer numeroMatricula;

    public Aluno(String nome, Integer numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " +getNome() + ", matricula: " + getNumeroMatricula() + "]";
    }
}
