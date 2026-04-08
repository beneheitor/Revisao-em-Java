import java.util.Scanner;

public class revisao7 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o numero que quer ver a tabuada: ");
        int numero = scanner.nextInt();

        while (contador < 10){
            contador++;
            int resultado = contador * numero;
            System.out.println(numero + "X" + contador + "= " + resultado);
        }

        System.out.println("Esse é a tabuada do " + numero);
    }
}
