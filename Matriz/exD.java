import java.util.Random;
public class exD {
 
    public static void main(String[] args) {
        int[][] cartela = new int[4][4];
        int linhaEncontrada = -1, colunaEncontrada = -1, rodadas = 0, bingo = 0;
        Random random = new Random();
 
        for (int i = 1; i <= 16; i++) {
            int linha, coluna;
            do {
                linha = random.nextInt(4);
                coluna = random.nextInt(4);
            } while (cartela[linha][coluna] != 0);
 
            cartela[linha][coluna] = i;
        }
 
        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(cartela[i][j] + "\t");
            }
            System.out.println();
        }
 
        while (bingo < 16) {
            rodadas++;
            int numeroCantado = random.nextInt(16) + 1;
            System.out.println("\nNúmero Cantado: " + numeroCantado);
 
            linhaEncontrada = -1;
            colunaEncontrada = -1;
 
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (cartela[i][j] == numeroCantado) {
                        cartela[i][j] = -1;
                        bingo++;
                        linhaEncontrada = i;
                        colunaEncontrada = j;
                        break;
                    }
                }
                if (linhaEncontrada != -1) {
                    break;
                }
            }
 
            System.out.println("\nCartela Atualizada:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(cartela[i][j] + "\t");
                }
                System.out.println();
            }
 
            if (linhaEncontrada != -1) {
                System.out.println("Você tem este número na cartela!");
            } else {
                System.out.println("Você não tem esse número na cartela.");
            }
 
            if (bingo == 16) {
                System.out.println("\nBINGO! Você acertou todas as 16 dezenas em " + rodadas + " rodadas!");
            }
        }
    }
}
