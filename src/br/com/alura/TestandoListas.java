package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by felipe on 22/04/17.
 */
public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe br.com.alura.Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println(aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("br.com.alura.Aula: " + aulas.get(i));
        }

        System.out.println("Tamanho da lista: " + aulas.size());

        aulas.forEach(aula -> {
            System.out.println("Percorrendo");
            System.out.println("br.com.alura.Aula: " + aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println("Depois de ordenado: " + aulas);

    }
}
