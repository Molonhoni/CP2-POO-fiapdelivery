package model;

/**
 * Representa uma moto de entrega.
 */
public class Moto extends Veiculo {

    private boolean possuiBau;

    public Moto(String placa, double capacidadeCarga, boolean possuiBau) {
        super(placa, capacidadeCarga);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }

    @Override
    public String exibirTipo() {
        return "Moto";
    }
}