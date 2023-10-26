package training.exercicios.aulas11a13;

import java.util.Scanner;

public class Exe11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int num01 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");

        int num02 = scan.nextInt();

        System.out.println("Agora digite um número real: ");

        double numReal = scan.nextDouble();

        int resultado1 = (num01*2) * (num02/2);

        System.out.println("O produto é " + resultado1);

        double resultado2 = (num01 * 3) + numReal;

        System.out.println("A soma é : " + resultado2);

        double resultado3 = Math.pow(numReal, 3);

        System.out.println("O ao cubo é: " + resultado3);


    }
}
