package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        /*
        Acoplamento: não deve permitir o acesso direto aos atributos das classes
        Deve ser realizado via set/constructor
        pessoa.nome = "Jiraya";
        pessoa.idade = 70;
         */
        pessoa.setNome("Jiraya");
        pessoa.setIdade(-2);
        pessoa.imprime();
    }
}
