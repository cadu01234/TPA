import java.util.Random;
public class exC {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];

        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[i].length - 1; j++) {
                soma += matriz[i][j];
            }
            matriz[i][matriz[i].length - 1] = soma;
        }

        System.out.println("Matriz com a soma de cada linha na última coluna:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
