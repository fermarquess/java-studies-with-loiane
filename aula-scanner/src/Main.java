import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome  = scanner.next();

        System.out.println("Seu nome é: " + nome);

        System.out.println("Digite sua altura: ");

        double altura = scanner.nextDouble();

        System.out.println("Sua altura é : " + altura);

    }
}