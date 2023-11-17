import java.util.Random;
public class exB {
    public static void main(String[] args) {
        int v[][] = new int[3][3];
        int i, j;
        int maiorV = Integer.MIN_VALUE;
        int menorV = Integer.MAX_VALUE;
        int[] posicaoMaior = new int[2];
        int[] posicaoMenor = new int[2];
        Random in = new Random();
 
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                v[i][j] = in.nextInt() % 50;
 
  
                if (v[i][j] > maiorV) {
                    maiorV = v[i][j];
                    posicaoMaior[0] = i;
                    posicaoMaior[1] = j;
                }
 

                if (v[i][j] < menorV) {
                    menorV = v[i][j];
                    posicaoMenor[0] = i;
                    posicaoMenor[1] = j;
                }
            }
        }
 

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("[ " + v[i][j] + " ]");
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maiorV);
        System.out.println("Posição do maior valor: [" + posicaoMaior[0] + ", " + posicaoMaior[1] + "]");
        System.out.println("Menor valor: " + menorV);
        System.out.println("Posição do menor valor: [" + posicaoMenor[0] + ", " + posicaoMenor[1] + "]");
    }
}
