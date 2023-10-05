package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(10, 20);

        double divisao = calc.divideDoisNumeros(10, 20);
        System.out.println(divisao);
        System.out.println(calc.divideDoisNumeros(10, 0));

        System.out.println("Finalizando CalculadoraTest01");
    }
}
