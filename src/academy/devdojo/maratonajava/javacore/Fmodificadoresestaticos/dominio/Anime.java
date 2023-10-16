package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    /*
     * 0 - Bloco de inicialização é executado quando a JVM carregar a classe
     * 1 - Alocado espaço em memória pro objeto: cada atributi é criado e
     * inicializado
     * 2 - valores default ou o que for passado por parâmetro
     * 3 - Bloco de inicialização é executado
     * 4 - Construtor é executado
     */

    // Bloco de inicialização estático é inicializado apenas uma vez na jvm
    // Isso ocorre para todos os atributos e métodos estáticos
    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    // Se houver múltiplos blocos de inicialização estáticos, serão iniciados em ordem
    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
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
