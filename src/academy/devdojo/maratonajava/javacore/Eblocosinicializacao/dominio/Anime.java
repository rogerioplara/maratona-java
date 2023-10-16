package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    /*
     * 1 - Alocado espaço em memória pro objeto: cada atributi é criado e
     * inicializado
     * 2 - valores default ou o que for passado por parâmetro
     * 3 - Bloco de inicialização é executado
     * 4 - Construtor é executado
     */

    // Bloco de inicialização de instância - executado todas as vezes que esse
    // objeto é executado/criado
    // A regra é que é executado antes do construtor
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        System.out.println(episodios);
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
