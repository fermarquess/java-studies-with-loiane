package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // calculando e mostrando a qtd de números pares x impares entre 1 e 10.
        int num;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i<10; i++){

            System.out.println("Informe um número: ");
            num = scan.nextInt();

            if (num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números impares: " + impares);
    }
}
