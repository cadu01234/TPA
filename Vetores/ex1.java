import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], b[], valor=01;
		a = new int[TAM];
		b = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o " +(i+1)+"° valor");
			a[i] = in.nextInt();
			b[i] = a[i]*a[i];
		}
		System.out.print("\nB =");
		for(i=0; i<TAM; i++) {
		System.out.println("O valor de a ao quadrado é"+b[i]+ "   ");
	}
	}
}
