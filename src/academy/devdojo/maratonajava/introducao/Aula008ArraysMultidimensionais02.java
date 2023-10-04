package academy.devdojo.maratonajava.introducao;

public class Aula008ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // Só é necessário inicializar o array base, os outros não precisam
        int[][] arrayInt = new int[3][];

        int[] array = {1, 2, 3,};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        // Também é possível inicializar dessa forma
        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrBase : arrayInt) {
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
            System.out.println("\n----");
        }
    }
}
