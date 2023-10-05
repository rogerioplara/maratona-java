package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Chevrolet", "Astra", 2006, "Azul");
        Carro c2 = new Carro("Peugeot", "307", 2008, "Prata");

        System.out.println(c1);
        System.out.println(c2);

        // Alteração da referência do objeto, perdendo a primeira informação
        // Só pode ser feito com objetos do mesmo tipo
        c1 = c2;

        System.out.println(c1);
        System.out.println(c2);
    }
}
