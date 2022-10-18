package pt.ulusofona.deisi.lp2.elevador;

import java.util.ArrayList;

public class Elevador {

    Porta porta;
    ArrayList<Pessoa> ocupantes;
    SensorPeso sensorPeso;
    int pesoMaximo;
    int capacidade;

    public Elevador(int pesoMaximo, int capacidade) {
        this.porta = new Porta(false);
        this.ocupantes = new ArrayList<>();
        this.sensorPeso = new SensorPeso();
        this.pesoMaximo = pesoMaximo;
        this.capacidade = capacidade;
    }

    boolean entrar(Pessoa pessoa) {
        if (pessoa == null) {
            return false;
        }
        ocupantes.add(pessoa);
        return true;
    }

    void sair(Pessoa pessoa) {
        ocupantes.remove(pessoa);
    }

    void abrirPorta() {
        porta.abrir();
    }

    void fecharPorta() {
        porta.fechar();
    }

    String obterEstadoPorta() {
        if (porta.aberta) {
            return "Aberta";
        } else {
            return "Fechada";
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Peso Maximo: " + pesoMaximo + " (kg)\n" +
                "Capacidade Maxima: " + capacidade + " (pessoas)\n" +
                "Ocupantes:");

        if (ocupantes.isEmpty()) {
             str.append("\nO elevador encontra-se vazio");
        } else {
            for (Pessoa pessoa : ocupantes) {
                str.append("\n").append(pessoa.nome).append(" ").append(pessoa.peso);
            }
        }
        return str.toString();
    }
}
