package training.exercicios.aulas11a13;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o raio do círculo: ");

        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.println("A área do círculo é " + area);
    }
}
