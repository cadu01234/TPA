import java.util.Scanner;
public class exTeste {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int placa;
		System.out.println("Entre com o numero final da placa");
		placa = in.nextInt();	
		switch(placa) {
		case 1:
		case 2:
			System.out.println("Não poderá circular Segunda-feira");
			break;
		case 3:
		case 4:
			System.out.println("Não poderá circular Terça-feira");
			break;
		case 5:
		case 6:
			System.out.println("Não poderá circular Quarta-feira");
			break;
		case 7:
		case 8:
			System.out.println("Não poderá circular Quinta-feira");
			break;
		case 9:
		case 0:
			System.out.println("Não poderá circular Sexta-feira");
			break;
		default:
			System.out.println("Dia inválido");
		}
		}
}
