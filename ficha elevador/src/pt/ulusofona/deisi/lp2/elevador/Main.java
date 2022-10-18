package pt.ulusofona.deisi.lp2.elevador;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    ArrayList<Elevador> elevadoresDoMeuPredio() {
        ArrayList<Elevador> elevadores = new ArrayList<>();
        Elevador elevador1 = new Elevador(350, 5);
        elevador1.porta.aberta = false;
        elevadores.add(elevador1);

        Elevador elevador2 = new Elevador(250, 3);
        elevador2.ocupantes.add(new Pessoa("Artolas", 75));
        elevador2.ocupantes.add(new Pessoa("Joaninha", 80));

        return elevadores;
    }


}
