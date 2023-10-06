package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Hayikyuu");
        anime.imprime();

        Anime anime2 = new Anime("Bleach", "TV", 400, "Shounen");
        anime2.imprime();

        Anime anime3 = new Anime();
        anime3.imprime();

        Anime anime4 = new Anime("Naruto", "TV", 800, "Shounen", "Milky");
        anime4.imprime();
    }
}
