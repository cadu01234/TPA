import java.util.Scanner;
public class ex2 {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		int i = 1;
		char sex;
		double alt;
		int respo;
		double peso_ideal;
		double peso_idealm;
	        do {
		     i = i + 1;
		     System.out.println("Digite seu sexo (f para feminino ou m para masculino)");
			 char sexo = in.next().charAt(0);
			
			 System.out.println("Digite sua altura");
			 alt = in.nextDouble(); 
		     if (sexo=='f'){
		    		peso_ideal = 52 + (0.67*(alt-152.4));
		    	System.out.println("Seu peso ideal é: "+peso_ideal+"");
		    	         }else if (sexo=='m'){
		    		peso_idealm = 52 + (0.75*(alt-152.4));
		    		System.out.println("Seu peso ideal é: "+peso_idealm+"");
		    	         }
		    	System.out.println("Deseja continuar a execução ? (1-sim ou 2-não)");
		    	respo = in.nextInt();
	       } while (respo==1);
	      
	    }
	}
