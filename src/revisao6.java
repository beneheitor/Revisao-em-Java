import java.util.Scanner;

public class revisao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------PLANOS DE INTERNET----------");
        System.out.println("|---ESCOLHA SEU PLANO: ");
        String menu = """
                1 - PLANO MUITO TOP
                2 - PLANO TOP
                3 - PLANO MÉDIO
                4 - SAIR
                """;
        System.out.println(menu);
        byte opcao = scanner.nextByte();

        switch (opcao){
            case 1:
                System.out.println("VOCÊ TEM DIREITO A 3TB!");
                break;
            case 2:
                System.out.println("VOCÊ TEM DIREITO A 900MB!");
                break;
            case 3:
                System.out.println("VOCê TEM DIREITO A 500MB!");
            case 4:
                System.out.println("ENCERRANDO...");
                break;
        }
    }
}
