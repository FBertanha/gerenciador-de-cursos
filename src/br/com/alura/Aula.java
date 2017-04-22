package br.com.alura;

/**
 * Created by felipe on 22/04/17.
 */
public class Aula implements Comparable<Aula>{
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "[br.com.alura.Aula: " + getTitulo() + ", " + getTempo() + "minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.getTitulo().compareTo(outraAula.getTitulo());
    }
}
