import java.util.Scanner;
public class exTeste {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mes;
		System.out.println("Qual o numero mês?");
		mes = in.nextInt();	
		switch(mes) {
		case 1:
			System.out.println("O mês de Janeiro tem 31 dias");
			break;
		case 2:
			System.out.println("O mês de Fevereiro tem 28 dias");
			break;
		case 3:
			System.out.println("O mês de Março tem 31 dias");
			break;
		case 4:
			System.out.println("O mês de Abril tem 30 dias");
			break;
		case 5:
			System.out.println("O mês de Maio tem 31 dias");
			break;
		case 6:
			System.out.println("O mês de Junho tem 30 dias");
			break;
		case 7:
			System.out.println("O mês de Julho tem 31 dias");
			break;
		case 8:
			System.out.println("O mês de Agosto tem 31 dias");
			break;
		case 9:
			System.out.println("O mês de Setembro tem 30 dias");
			break;
		case 10:
			System.out.println("O mês de Outubro tem 31 dias");
			break;
		case 11:
			System.out.println("O mês de Novembro tem 30 dias");
			break;
		case 12:
			System.out.println("O mês de Dezembro tem 31 dias");
			break;
		default:
			System.out.println("Mês Invalido");
		}
	}
}
