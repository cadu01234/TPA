import java.util.Scanner;
public class exC{
  public static void main(String[] args) {
  double passa, custoTotal = 0.0; int NaVolumes = 0, NaAssentos = 0; 
  String despacho, assento;
  
  Scanner in = new Scanner(System.in);
  System.out.print("Digite o preço da passagem: ");
    passa= in.nextDouble();
  System.out.print ("Vai despachar bagagem? (Sim ou Não): "); 
    despacho= in.next();
   
if (despacho.equalsIgnoreCase("Sim")) {
  System.out.print ("Quantidade de volumes: "); 
  NaVolumes = in.nextInt();
}
  System.out.print ("Quer marcar o assento? (Sim ou Não): ");
  assento= in.next();
if (assento.equalsIgnoreCase("Sim")) {
  System.out.print ("Quantidade de assentos: ");
  NaAssentos = in.nextInt();
}
  custoTotal = passa+NaVolumes 90.0+NaAssentos 60.0; 
System.out.println("Custo total da viagem: +custoTotal);
  }
}
