package training.exercicios.aulas11a13;

import java.util.Scanner;

public class NotasBimestrais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");

        double primeiraNota = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");

        double segundaNota = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");

        double terceiraNota = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");

        double quartaNota = scanner.nextDouble();

        double somaDasNotas = primeiraNota + segundaNota + terceiraNota + quartaNota;

        double mediaDasNotas = somaDasNotas / 4;

        System.out.println("A média entre as notas é: " + mediaDasNotas);


    }
}
