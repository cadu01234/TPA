import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int a[], b[], i, l, j=0, k=0, p=0, m=0, result;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i= 0; i < TAM; i++) {
			System.out.println("Digite o " + (i+1) + "° valor do vetor A");
			a[i] =in.nextInt();
			if (a[i] % 2 == 0) {
			    b[p] = a[i];
			    p++;
			 } else {
	                b[TAM - 1 - m] = a[i];
	                m++;
	         }
		
			
		
	}
		for (l = 0; l < TAM; l++) {
		    System.out.print(b[l] + " ");
		}
}
}
