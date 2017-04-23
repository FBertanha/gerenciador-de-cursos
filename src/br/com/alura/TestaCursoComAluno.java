package br.com.alura;

import java.util.Iterator;
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

        System.out.println("Todos alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O aluno " + a1 + "está matriculado ?");
        System.out.println(javaColecoes.estaMatriculado(a1));


        Aluno turini = new Aluno("Rodrigo Turini", 3129);
        System.out.println("E esse Turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é equals ao Turini");
        System.out.println(a1.equals(turini));

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();

        while (iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

    }
}
