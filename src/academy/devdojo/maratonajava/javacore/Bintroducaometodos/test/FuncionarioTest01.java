package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.Locale;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Funcionario func = new Funcionario();

        func.setNome("Ichigo");
        func.setIdade(18);
        // O código está propenso a erros, caso não passe os salários gera erro pois existe interação com um valor que não existe
        // gera nullpointerexception
        func.setSalarios(new double[]{1823.77, 2377.12, 3333.33});

        System.out.println("----------");
        System.out.println(func);
        System.out.println("----------");
        for (double salario : func.getSalarios()) {
            System.out.printf("R$%.2f\n", salario);
        }
        System.out.println("----------");
        func.mediaSalarios();
        System.out.println("----------");
        System.out.printf("Média: R$%.2f\n", func.getMedia());
        System.out.println("----------");
        System.out.println(func);
    }
}
