package training.exercicios.aulas11a13;

import java.util.Scanner;

public class SomaDosNumeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero01 = scan.nextInt();

        System.out.println("Digite outro número: ");

        int numero02 = scan.nextInt();

        int soma = numero01 + numero02;

        System.out.println("A soma dos números é " + soma);


    }
}
