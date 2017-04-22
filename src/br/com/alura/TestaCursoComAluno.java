package br.com.alura;

import java.util.Set;

/**
 * Created by felipe on 22/04/17.
 */
public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleçoes", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayLists", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleçoes", 10));

        Aluno a1 = new Aluno("Rodrigo Turini", 35672);
        Aluno a2 = new Aluno("Guilherme Silveira", 2138);
        Aluno a3 = new Aluno("Mauricio Aniche", 309124);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        //System.out.println("Todos alunos matriculados: " + javaColecoes.getAlunos());
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        Set<Aluno> alunos = javaColecoes.getAlunos();
        alunos.add(new Aluno("Felipe Bertanha", 23091));

        System.out.println(alunos);

    }
}
