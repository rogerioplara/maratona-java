package academy.devdojo.maratonajava.introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 100000000L;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65; // traduz para a tabela ASCII
        char caractere2 = '\u0041'; // traduz para a tabela UNICODE

        // tipos primitivos, com exceção do boolean, são numéricos
        // o caractere também é numérico;

        String nome = "Goku";

        // palavra reservada VAR
        var nome2 = "Vegeta";

        System.out.println("A idade é " + idade + " anos");
        System.out.printf("A idade é %d anos%n", idade);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(caractere2);
        System.out.println("Oi, meu nome é " + nome);
    }
}
