package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.Locale;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Funcionario func = new Funcionario();

        func.nome = "Ichigo";
        func.idade = 18;
        func.salarios = new double[]{1823.77, 2377.12, 3333.33};

        System.out.println(func);
        func.getSalario();
        System.out.printf("Média: R$%.2f", func.mediaSalarios());
    }
}
