package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        // Instância do professor
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");

        // Inserindo o professor em um array de professores
        Professor[] professores = {professor1, professor2};

        // Instância da escola com o array de professores passados no construtor
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
