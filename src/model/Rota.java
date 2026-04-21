package model;

/**
 * Representa a rota de entrega de um pacote usando qualquer tipo de veículo.
 */
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        setPacote(pacote);
        setVeiculo(veiculo);
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        if (pacote == null) {
            throw new IllegalArgumentException("O pacote não pode ser nulo.");
        }
        this.pacote = pacote;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }

        if (pacote != null && pacote.getPeso() > veiculo.getCapacidadeCarga()) {
            throw new IllegalArgumentException("O peso do pacote excede a capacidade do veículo.");
        }

        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {
        System.out.println("Levando pacote " + pacote.getCodigo() +
                " no veículo " + veiculo.getPlaca() +
                " (" + veiculo.exibirTipo() + ")");
    }
}