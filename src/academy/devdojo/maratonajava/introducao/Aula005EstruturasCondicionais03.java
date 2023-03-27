package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operador ternário
        double salario = 5000;
        String mensagemDoar = "Eu vou doar R$500 pro DevDojo!";
        String mensagemNaoDoar = "Ainda não tenho condições :(";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; // pode ser colocado dentro de um println -> não recomendado;

        System.out.println(resultado);
    }
}
