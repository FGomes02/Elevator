package pt.ulusofona.deisi.lp2.elevador;

public class Porta {

    boolean aberta;

    public Porta(boolean aberta) {
        this.aberta = aberta;
    }

    boolean estaAberta() {
        return aberta;
    }

    void abrir() {
        aberta = true;
    }

    void fechar() {
        aberta = false;
    }


}
