package academy.devdojo.maratonajava.introducao;

import java.util.Locale;

public class Aula006EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes pode ser parcelado
        // Condição valorParcela >= 1000

        Locale.setDefault(Locale.US);

        double valorParcelas = 1050.0;
        double valorCarro = 50000.0;
        int qtdParcelas = 0;

        while(valorCarro > 0) {
            valorCarro -= valorParcelas;
            qtdParcelas++;
        }

        System.out.printf("Valor da parcela: R$%.2f\n", valorParcelas);
        System.out.printf("Quantidade de parcelas: %d\n\n", qtdParcelas);

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$"+valorParcela);
        }
    }
}
