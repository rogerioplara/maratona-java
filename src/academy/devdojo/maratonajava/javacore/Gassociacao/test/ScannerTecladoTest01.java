package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class ScannerTecladoTest01 {
    public static void main(String[] args) {
        // Instância da classe Scanner
        Scanner sc = new Scanner(System.in);
        // next() lê somente a primeira palavra
        // é possível pegar cada índice dessa palavra como um array
        String next = sc.next();
        System.out.println(next);
    }
}
