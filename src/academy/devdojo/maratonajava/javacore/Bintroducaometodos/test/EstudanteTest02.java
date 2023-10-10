package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante est1 = new Estudante();
        Estudante est2 = new Estudante();

        est1.nome = "Midoriya";
        est1.idade = 15;
        est1.sexo = 'M';

        est2.nome = "Sakura";
        est2.idade = 16;
        est2.sexo = 'F';

        est1.imprime();
        est2.imprime();
    }
}
