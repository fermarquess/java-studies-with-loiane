package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");

        int num01 = scan.nextInt();

        System.out.println("Informe um outro número: ");

        int num02 = scan.nextInt();

        if (num01 > num02) {
            System.out.println("O número 1 é maior: " + num01);
        } else {
            System.out.println("O número 2 é maior: " + num02);
        }
    }
}
