import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int i, media=0, a[];
		a = new int[TAM];

		for (i=0; i<TAM; i++) {
			System.out.println("Entre com "+(i+1)+"° valor");
			a[i] = in.nextInt();
			media = a[i]+media;

		}
		media = (media/TAM);
		System.out.println("A media do vetor A é "+media);
	}
}
