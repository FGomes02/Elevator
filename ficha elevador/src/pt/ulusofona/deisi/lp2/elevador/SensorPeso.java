package pt.ulusofona.deisi.lp2.elevador;

public class SensorPeso {

    int pesoAtual;

    public SensorPeso() {}

    int obterLeituraPesoAtual() {
        return pesoAtual;
    }

    void adicionarPeso(int peso) {
        pesoAtual += peso;
    }

    void removerPeso(int peso) {
        pesoAtual -= peso;
    }
}
