package br.com.alura;

import java.util.Comparator;

/**
 * Created by felipe on 23/04/17.
 */
public class OrdenaPorIdade implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }

}
