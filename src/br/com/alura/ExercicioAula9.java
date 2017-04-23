package br.com.alura;

import java.util.*;

/**
 * Created by felipe on 23/04/17.
 */
public class ExercicioAula9 {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Matos");
        pessoas.put(23, "Romulo Henrique");
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);


        //Pega Nome
        Set<String> chaves = nomesParaIdade.keySet();
        for (String nome : chaves) {
            System.out.println(nome);
        }

        //Pega Idade
        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }

        //Associação
        Set<Map.Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();

        for (Map.Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }


    }
}
