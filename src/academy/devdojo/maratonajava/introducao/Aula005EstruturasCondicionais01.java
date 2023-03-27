package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("NÃO autorizado a comprar bebida alcólica");
        }
    }
}
