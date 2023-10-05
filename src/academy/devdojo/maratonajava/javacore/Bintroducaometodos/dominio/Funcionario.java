package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void getSalario() {
        for (double salario : salarios) {
            System.out.printf("R$%.2f\n", salario);
        }
    }

    public double mediaSalarios() {
        double media = 0;
        for (double salario : salarios) {
            media += salario / salarios.length;
        }
        return media;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salarios=" + Arrays.toString(salarios) +
                '}';
    }
}
