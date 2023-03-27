package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto

        int idade = 12;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        //possível também fazer um operador ternário -> não recomendado se a complexidade for alta
//        categoria = idade < 15 ? "Categoria Infantil" : idade < 18 ? "Categoria Juvenil" : "Categoria adulto";

        System.out.println(categoria);
    }
}
