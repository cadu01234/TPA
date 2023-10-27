import java.util.Scanner;
public class ex4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, anoA, anoN, id, velho, novo;
		System.out.println("Qual o ano atual?");
		anoA = in.nextInt();
		System.out.println("Qual o ano de nascimento?");
		anoN = in.nextInt();
		velho = anoA-anoN;
		novo = anoA-anoN;
		for (i=1; i<=10;i++)	{
			System.out.println("Qual o ano atual?");
			anoA = in.nextInt();
			System.out.println("Qual o ano de nascimento?");
			anoN = in.nextInt();
			id = anoA-anoN;
			if (id>velho) {
				velho = id;
			} else if(id<novo) {
				novo = id;
			}

		}
		System.out.println("O mais velho tem "+velho+" e o mais novo tem "+novo );

	}
}
