import java.util.Scanner;
public class ex9 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[] a = {9,8,7,6,5,5,6,7,8,9};
		int posicaoI = 0;
		int posicaoF = a.length - 1;
		
		
		
		while (posicaoI < posicaoF){
			if(a[posicaoI] != a[posicaoF]) {
				System.out.println("O vetor não é um palindromo");
				return;
			}		
					
			posicaoI++;
            posicaoF--;
		}
			System.out.println("O vetor é um palíndromo");
	}
}
