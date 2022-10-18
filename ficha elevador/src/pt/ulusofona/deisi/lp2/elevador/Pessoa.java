package pt.ulusofona.deisi.lp2.elevador;

public class Pessoa {
    String nome;
    int peso;


    public Pessoa(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    String obterNome() {
        return nome;
    }

    int obterPeso() {
        return peso;
    }

}
