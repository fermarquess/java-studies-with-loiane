package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {

        // solicitando dois números inteiros e imprimindo a soma entre o intervalo deles.

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");

        int num01 = scan.nextInt();

        System.out.println("Informe outro número: ");

        int num02 = scan.nextInt();

        int soma = 0;

        for (int i = num01; i <= num02; i++){
            soma += i;
        }

        System.out.println("A soma entre o intervalo dos números é igual a: " + soma);

    }
}
