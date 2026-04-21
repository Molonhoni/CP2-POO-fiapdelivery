package main;

import model.Caminhao;
import model.Moto;
import model.Pacote;
import model.Rota;

public class Principal {
    public static void main(String[] args) {

        try {
            Caminhao caminhao = new Caminhao("ABC1234", 500.0, 6);
            Pacote pacote1 = new Pacote("BR999", 10.5, "Pendente");

            Rota rota1 = new Rota(pacote1, caminhao);
            rota1.iniciarEntrega();

            Moto moto = new Moto("XYZ9876", 20.0, true);
            Pacote pacote2 = new Pacote("SP101", 5.0, "Pendente");

            Rota rota2 = new Rota(pacote2, moto);
            rota2.iniciarEntrega();

            pacote1.alterarStatus("Em transporte");
            System.out.println("Novo status do pacote " + pacote1.getCodigo() + ": " + pacote1.getStatus());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro no sistema: " + e.getMessage());
        }
    }
}