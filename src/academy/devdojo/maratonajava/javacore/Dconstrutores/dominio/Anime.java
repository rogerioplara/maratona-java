package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    /*
    Construtores NÃO tem tipo, sempre vai ser somente o nome da classe
    Caso tenha algum, será um método e não um construtor
     */
    public Anime() {
        System.out.println("# Dentro do construtor sem argumentos #");
    }

    // O construtor é sempre inicializado antes dos outros métodos
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(String nome, String tipo, int episodios, String genero) {
        this(); // É possível referenciar um construtor dentro de outros construtores
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        // É possível referenciar um construtor dentro de outros construtores
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
        System.out.println("-------------");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
