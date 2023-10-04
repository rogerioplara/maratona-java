package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou fim de semana
        // Considerando 1 como Domingo

        byte diaDaSemana = 10;

        switch (diaDaSemana){
            case 1:
            case 7:
                System.out.println("FInal de Semana 😁");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil 😢");
                break;
            default:
                System.out.println("Digite um número de 1 a 7");
                break;
        }
    }
}
