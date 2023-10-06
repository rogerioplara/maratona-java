package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    /*
    Acoplamento: Quanto uma classe "conhece" da outra - quanto está acoplada
    O código não deve ter ou ter o mínimo de acoplamento possível
    */
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome); // Não precisa do this
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

}
