package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    // Métodos
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    // Parâmetros de tipo primitivo
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    // Passando um array
    public void somaArray(int[] nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println(soma);
    }

    // VarArgs - transforma o parâmetro em um array - deve ser o último argumento
    public void somaVarArgs(int... nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println(soma);
    }
}
