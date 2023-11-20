package training.exercicios.aula19;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++){

            System.out.println("Informe o valor para a posição: " + i);
            vetorA[i] = scan.nextInt();

        }

        int soma = 0;
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++){

            if (vetorA[i] % 2 != 0){
                soma += vetorA[i];
                impar++;

            }

        }

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Soma: " + soma);

        System.out.println();

        System.out.print("Média: " + (soma/impar));

    }
}
