package br.com.alura;

import java.util.List;

/**
 * Created by felipe on 22/04/17.
 */
public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleçoes", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayLists", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleçoes", 10));


        System.out.println(javaColecoes.getAulas());


    }
}
