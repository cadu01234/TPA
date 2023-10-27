import java.util.Scanner;
public class exC {
  public static void main(String args[]) { 
    Scanner in = new Scanner (System.in);

    int b, p=1, e, i=1;
    
  System.out.print("Entre com a base ");
   b = in.nextInt(); System.out.print("Entre com o expoente ");
   e= in.nextInt(); 
   while (i<=e) {
     p = p*b;
     i++;
  }

System.out.println("O resultado do calculo é "+p);

  }

}
