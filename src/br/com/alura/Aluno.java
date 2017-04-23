package br.com.alura;

/**
 * Created by felipe on 22/04/17.
 */
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Integer numeroMatricula;

    public Aluno(String nome, Integer numeroMatricula) {
        if (nome == null) throw new NullPointerException("Nome não pode ser Nulo");
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

    @Override
    public boolean equals(Object obj) {
       Aluno outroAluno = (Aluno) obj;
       return getNome().equals(outroAluno.getNome());
    }

    @Override
    public int hashCode() {
        return this.getNome().hashCode();
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return getNome().compareTo(outroAluno.getNome());
    }
}
