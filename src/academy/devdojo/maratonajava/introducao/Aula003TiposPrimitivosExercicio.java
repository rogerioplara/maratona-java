package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, norando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula003TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Rogerio";
        String endereco = "Tv. Liberdade, 42";
        double salario = 3000.00;
        String dataRecebimento = "27/03/2023";

        System.out.printf("Eu %s, morando no endereço %s, confirmo que recebi o salário de R$%.2f, na data %s%n", nome, endereco, salario, dataRecebimento);
    }
}
