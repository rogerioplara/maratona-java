package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        // Altera os valores somente na chamada dessa função -> localmente
        calc.alteraDoisNumeros(num1, num2);

        // Valore se mantêm
        // Tipos primitivos passados para um método não são passados por referência, mas sim por valor
        // Ou seja, as variáveis num1 e num2 se manterão e serão criadas cópias dessas variáveis no método
        System.out.println(num1);
        System.out.println(num2);
    }
}
