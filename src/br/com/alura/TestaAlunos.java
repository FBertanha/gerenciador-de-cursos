package br.com.alura;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Created by felipe on 22/04/17.
 */
public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sérgio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Alberto Souza");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno :
                alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

    }
}
