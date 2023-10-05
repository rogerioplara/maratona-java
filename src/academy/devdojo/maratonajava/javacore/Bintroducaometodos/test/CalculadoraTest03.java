package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        calculadora.somaArray(numeros);

        // é possível passar um array
        calculadora.somaVarArgs(numeros);
        // também é possível passar n argumentos
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
