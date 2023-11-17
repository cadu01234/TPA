import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        int temp;

        
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
            a[i] = in.nextInt();
            b[i] = a[i];
        }
        int n = b.length;
        for (int j = 0; j < n - 1; j++) {
            for (int k = 0; k < n - j - 1; k++) {
                if (b[k] > b[k + 1]) {
                    temp = b[k];
                    b[k] = b[k + 1];
                    b[k + 1] = temp;
                }
            }
        }
        System.out.println("Vetor B (em ordem crescente):");
        for (int i = 0; i < TAM; i++) {
            System.out.print(b[i] + " ");
    }
}
}
