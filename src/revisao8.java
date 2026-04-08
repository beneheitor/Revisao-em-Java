import java.util.Scanner;

public class revisao8 {
    public static void main(String[] args) {
        double notas[] = new double[4];
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno(a): ");
        String nome = scanner.nextLine();

        for (int i = 0; i < notas.length; i++){
            System.out.print("Qual a " + (i+1) + "º nota do aluno(a) " + nome + ": ");
            notas[i] = scanner.nextDouble();
        }
        media = (notas[0] + notas[1] + notas[2] + notas[3])/4;

        if (media >= 7){
            System.out.println("Sua média é: " + media + ". E você está aprovado");
        } else if (media < 5) {
            System.out.println("Sua média é: " + media + ". E você está reprovado");
        }
        else {
            System.out.println("Sua média é: " + media + ". E você está de recuperação");
        }
    }
}
