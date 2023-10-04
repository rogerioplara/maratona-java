package academy.devdojo.maratonajava.introducao;

public class Aula007Arrays01 {
    public static void main(String[] args) {
        // Criação e instância do array
        int [] idades = new int[3];
        // Variáveis de tipo primitivo não podem ser iniciadas como null, somente tipo referencia
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 18;
        for (int idade : idades) {
            System.out.printf("%d ", idade);
        }
    }
}
