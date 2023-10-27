import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		System.out.println("Qual sua idade?");
		idade = in.nextInt();
		switch(idade) {
		case 6:
			System.out.println("Sua categoria é Dente de Leite");
			break;
		case 7:
			System.out.println("Sua categoria é Junior");
			break;
		case 8:
			System.out.println("Sua categoria é Junior Max");
			break;
		case 9:
			System.out.println("Sua categoria é Junior Master");
			break;
		case 10:
			System.out.println("Sua categoria é Master");
			break;
		default:
			System.out.println("Informção Invalida");
		}
	}
}
