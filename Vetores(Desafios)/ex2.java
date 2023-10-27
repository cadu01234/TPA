import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		int a[], i, j, res;
		a = new int [TAM];
		
		for (i =0; i<TAM; i++) {
			System.out.println("Digite o "+ (i+1) +"° valor do Vetor A");
			a[i] = in.nextInt();
			
		}
		for (i=0; i<TAM; i++) {
		for ( j = 0; j <= 10; j++) {
            res = a[i] * j;
            System.out.println(a[i] + " x " + j + " = " + res);
		}
	}
}
}
