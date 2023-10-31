package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {

        // solicitando dois números inteiros e imprimindo os números entre seus intervalos.

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");

        int num01 = scan.nextInt();

        System.out.println("Informe outro número: ");

        int num02 = scan.nextInt();

        for (int i = num01; i <= num02; i++){
            System.out.println(i);
        }

    }
}
