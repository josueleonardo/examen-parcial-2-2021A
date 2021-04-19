package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.LinkedList;
import java.util.Iterator;

public class SongPlayer {

    public void play(Song song, Instrumento instrumento) {
        Instrument instrument = null;


        Iterator<Nota> notas = song.getSongIterator();
        /*
        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        Violin violin = new Violin();
        Flauta flauta = new Flauta();
        */

        while (notas.hasNext()) {
            Nota nota = notas.next();

            switch (instrumento) {
                case PIANO -> instrument.presionaTecla(nota);
                case FLAUTA -> instrument.sopla(nota);
                case VIOLIN -> instrument.toca(nota);
                case GUITARRA -> instrument.tocaCuerda(nota);
                default -> System.out.println("Instrumento no soportado");
            }
        }
    }

}
