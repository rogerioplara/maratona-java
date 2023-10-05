package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.nome = "Mestre Kame";
        p.idade = 140;
        p.sexo = 'M';

        System.out.println("Nome: " + p.nome + ", idade: " + p.idade + ", sexo: " + p.sexo);

    }
}
