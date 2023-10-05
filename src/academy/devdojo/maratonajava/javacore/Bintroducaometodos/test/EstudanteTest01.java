package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante est1 = new Estudante();
        Estudante est2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        est1.nome = "Midoriya";
        est1.idade = 15;
        est1.sexo = 'M';

        est2.nome = "Sakura";
        est2.idade = 16;
        est2.sexo = 'F';

        impressora.imprime(est1);
        impressora.imprime(est2);
        System.out.println("##################");
        impressora.imprime(est1);
        impressora.imprime(est2);
    }
}
