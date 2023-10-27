import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int codigo;
		System.out.print("Informe o código: ");
		codigo = in.nextInt();
		switch(codigo) {
		case 1:
			System.out.println("Cachorro Quente Valor R$8,00");
			break;
		case 2: 
			System.out.println("Cheesburger Valor R$12,00");
			break;
		case 3:
			System.out.println("X-salada Valor R$15,00");
			break;
		case 4:
			System.out.println("Misto Quente Valor R$11,00");
			break;
		case 5:
			System.out.println("Pão na chapa Valor R$6,00");
			break;
		default:
			System.out.println("Informação Invalida");
		}
		
	}
}
