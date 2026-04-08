import java.util.Scanner;

public class revisao4 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno(a): ");
        String nome = scanner.nextLine();

        System.out.println("Informe a primeira nota do aluno(a) " + nome + ": ");
        nota1 = scanner.nextInt();
        System.out.println("Informe a segunda nota do aluno(a) " + nome + ": ");
        nota2 = scanner.nextInt();
        System.out.println("Informe a terceira nota do aluno(a) " + nome + ": ");
        nota3 = scanner.nextInt();
        System.out.println("Informe a quarta nota do aluno(a) " + nome + ": ");
        nota4 = scanner.nextInt();

       int media = (nota1 + nota2 + nota3 + nota4)/4;
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
