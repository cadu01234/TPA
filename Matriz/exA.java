public class exA {
    public static void main(String[] args) {
        int tamanho = 4;
        int[][] matriz = new int[tamanho][tamanho];

        int valor = 2;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = valor;
                valor *= 2;  
            }
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
