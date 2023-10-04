package academy.devdojo.maratonajava.introducao;

public class Aula007Arrays02 {
    public static void main(String[] args) {
        /*
        Valores padrão para tipos primitivos
        byte, short, int, long, float e double = 0
        char '\u0000'
        boolean false
        String null
        */

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Luffy";

        // foreach ou enhanced for
        // for(tipo alias : array){
        //      ...código
        // }
        for(String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
