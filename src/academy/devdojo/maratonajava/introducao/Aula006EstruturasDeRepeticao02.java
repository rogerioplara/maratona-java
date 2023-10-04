package academy.devdojo.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000 (era 1.000.000 mas bugava o terminal)
        int count = 0;
        while(count <= 1000) {
            if (count % 2 == 0){
                System.out.println(count);
            }
            count++;
        }

//        for (int i = 0; i <= 1000000; i++) {
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//        }
    }
}
