package matriz;
import java.util.Random;
public class exExemplo {
	public static void main(String[] args) {
		int v[][] = new int[3][3];
		int i, j;
		Random in = new Random();
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				v[i][j] = in.nextInt()%50;
			}
		}
		for(i=0; i<3; i++) {
			System.out.println();
			for(j=0; j<3; j++) {
				System.out.print("[ "+v[i][j]+" ]");
			}
		}
	}
}
