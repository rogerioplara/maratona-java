package academy.devdojo.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um dado valor. Ex: 50
        int base = 600;

        for (int i = 0; i < base; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
