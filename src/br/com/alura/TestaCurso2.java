package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by felipe on 22/04/17.
 */
public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleçoes", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayLists", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleçoes", 10));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);




    }
}
