package academy.devdojo.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while e for
        int count = 0;
        while(count < 10){
            System.out.println("while " + ++count);
        }

        do {
            System.out.println("do-while " + ++count);
        } while (count < 20);

        for(int i = 1; i <= 10; i++){
            System.out.println("For " + i);
        }
    }
}
