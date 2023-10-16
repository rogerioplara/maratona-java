package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        System.out.println(Carro.getVelocidadeLimite()); // 250.0
        // Ao mudar um atributo estático, muda de todos os objetos
        Carro.setVelocidadeLimite(180);
        System.out.println(Carro.getVelocidadeLimite()); // 180.0

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
