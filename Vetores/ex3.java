import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], i, j;
        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + " valor do vetor A");
            a[i] = in.nextInt();
        }

        for (j = TAM - 1; j >= 0; j--) {
            if (j >= 0) {
                b[j] = a[TAM - 1 - j];
            }
        }

        System.out.print("Vetor B: ");
        for (j = 0; j < TAM; j++) {
            System.out.print(b[j] + " ");
        }
    }
}
