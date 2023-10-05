package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }
}
