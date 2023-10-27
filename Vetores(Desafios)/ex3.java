public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[] = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            if (eprimo(a[i])) {
                System.out.println(a[i] + " é um número primo.");
            } else {
                System.out.println(a[i] + " não é um número primo.");
            }
        }
    }
    public static boolean eprimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int j = 5; j * j <= num; j += 6) {
            if (num % j == 0 || num % (j + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
