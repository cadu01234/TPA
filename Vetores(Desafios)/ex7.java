import java.util.Scanner;
public class ex7 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			final int TAM=10; 
			int i, j, l, a[], b[], diferentes=0, k=0;
			a = new int[TAM];
			b = new int[TAM];
		
			
			for(i=0; i<TAM; i++) {
				System.out.println("Digite o " +(i+1)+ "° valor do Vetor A");
				a[i] = in.nextInt();
				}
			
			for (i=0; i<TAM; i++) {
				System.out.println("Digite o " +(i+1)+ "° valor do Vetor B");
				b[i] = in.nextInt();
				}
			
			//contar quantos elementos são iguais
			for(i=0; i<TAM; i++) {
				for(j=0; j<TAM; j++) {
					if (a[i]==b[j]) {
					}else {
						diferentes++;
						break;
					}
				}
			}
			//criando o vetor c
			int c[] = new int[diferentes];
			
			//povoando o vetor C
			
			for(i=0; i<TAM; i++) {
				for(j=0; j<TAM; j++) {
					if (a[i]==b[j]) {
					} else {
						c[k] = a[i];
						k++;
						break;
					}
				}
			}
			for (i = 0; i < diferentes; i++) {
			 System.out.println("C[" + i + "] = " + c[i]);
			}
			
		}
	}
