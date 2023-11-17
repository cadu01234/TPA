import java.util.Scanner;
public class ex8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], i, j, comp;
		a = new int[TAM];
		for(i=0;i<TAM; i++) {
			System.out.println("Forneça o " +(i+1)+ "° valor do vetor A");
			a[i] = in.nextInt();
		}
		System.out.println("Qual número deseja buscar");
		comp = in.nextInt();
		for (j=0; j<TAM; j++) {
		if (comp==a[j]) {
			System.out.println("O número que você buscou esta em: A[" + j + "] = " + a[j]);
		}else {
			System.out.println("Número não encontrado");
		}
		
	}
	}
}
