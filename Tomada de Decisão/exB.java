import java.util.scanner;
public class exB {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    double sala, imposto;
    System.out.println("Entre com o salário: "); sala = in.nextDouble();
    if (sala < 1903.99) {
    System.out.println("Não há impostos a serem pagos.");
    } else if (sala <= 2826.66) {
    imposto = (sala 0.075) - 142.80;
    System.out.println("Você irá pagar R$" + imposto +" em impostos.");
    } else if (sala <= 3751.05) {
    imposto = (sala 0.15) 354.80; System.out.println("Você irá pagar R$" + imposto em impostos."); 
    } else if (sala <= 4664.68) {
    imposto = (sala 0.225) - 636.13; System.out.println("Você irá pagar R$" + imposto + em impostos.");
    
    } else { imposto = (sala 0.275) - 869.36;
    
    System.out.println("Você irá pagar R$" + imposto em impostos."); }

    }
  }
}
