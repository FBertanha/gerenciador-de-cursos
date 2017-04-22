package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by felipe on 22/04/17.
 */
public class TestaPerformance {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 50000 * 2; i++) {
            numeros.add(i);
        }

        long fimPreenchimento = System.currentTimeMillis();

        System.out.println("Tempo gasto preenchendo Lista: " + (fimPreenchimento - inicio));

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fimBusca = System.currentTimeMillis();

        System.out.println("Tempo gasto procurando na Lista: " + (fimBusca - fimPreenchimento));

        long fim = System.currentTimeMillis();

        long tempoExecucao = fim - inicio;

        System.out.println("TOTAL Tempo gasto: " + tempoExecucao);
    }
}
