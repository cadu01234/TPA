import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TAM = 15;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor do vetor A: 3");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            B[i] = cf(A[i]);
        }

        System.out.println("Vetor B");
        for (int i = 0; i < TAM; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }

    public static int cf(int n) {
        if (n == 0) {
            return 1;
        }
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
