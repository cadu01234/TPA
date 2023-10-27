import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlunos, alunoMB=0, alunoB=0, alunoR=0, alunoI=0, i=0;
        double porcentagemMB, porcentagemB, porcentagemR, porcentagemI;       
        System.out.print("Digite o total de alunos: ");
        totalAlunos = scanner.nextInt();       
        while (i < totalAlunos) {
            System.out.print("Digite a nota do aluno "+i+": ");
            int nota = scanner.nextInt();
            switch (nota) {
                case 10:
                    alunoMB++;
                    break;
                case 9:
                case 8:
                    alunoB++;
                    break;
                case 7:
                case 6:
                    alunoR++;
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                    alunoI++;
                    break;
                default:
                    System.out.println("Informação inválida");
            }        
            i++;
        }
        porcentagemMB = ((double) alunoMB / totalAlunos) * 100;
        porcentagemB = ((double) alunoB / totalAlunos) * 100;
        porcentagemR = ((double) alunoR / totalAlunos) * 100;
        porcentagemI = ((double) alunoI / totalAlunos) * 100;      
        System.out.println("A porcentagem de alunos MB é de " + porcentagemMB + "%");
        System.out.println("A porcentagem de alunos B é de " + porcentagemB + "%");
        System.out.println("A porcentagem de alunos R é de " + porcentagemR + "%");
        System.out.println("A porcentagem de alunos I é de " + porcentagemI + "%");     
        scanner.close();
    }
}
