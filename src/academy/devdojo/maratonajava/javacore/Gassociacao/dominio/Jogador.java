package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;

    // Associação unidirecional - o time não tem conhecimento do jogador
    // Um para muitos (um time para muitos jogadores)
    private Time time;

    public void imprime() {
        System.out.println(this.nome);
        // Esse if vai "tratar" um nullpointer caso execute o método antes de definir o time
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
