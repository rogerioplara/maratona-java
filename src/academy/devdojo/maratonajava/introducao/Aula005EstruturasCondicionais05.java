package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando o 1 como domingo
        byte inputUsuario = 3;

        switch (inputUsuario){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Digite um número de 1 a 7");
                break;
        }
    }
}
