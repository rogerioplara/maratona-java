package academy.devdojo.maratonajava.introducao;

public class Aula004Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        //operações entre valores inteiros sempre resultarão em números inteiros;
        System.out.println(numero02 - numero01);
        System.out.println(numero01 + numero02);
        System.out.println(numero01 * numero02);
        System.out.println(numero01 / (double) numero02);

        // % (mod) -> sempre retorna valor numérico
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == != -> sempre retornam valor booleano
        //convenção: quando utilizar valores booleanos, sempre começar o nome da variávem com is
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // operadores lógicos
        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        double salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        double valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
        System.out.println();

        // = += -= *= /= %= -> operadores de atribuição
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.printf("bonus = %.2f%n", bonus);

        int contador = 0;
        contador += 1;
        contador ++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0;
        System.out.println(contador2++); //incrementa depois de imprimir
        System.out.println(++contador2); //incrementa antes de imprimir
    }
}
