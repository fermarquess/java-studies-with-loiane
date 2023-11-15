package training.exercicios.aula19;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){

            System.out.println("Informe o valor do vetorA para a posição: " + i);
            vetorA[i] = scan.nextInt();

        }

        for (int i = 0; i < vetorB.length; i++){

            vetorB[i] = vetorA[i] % 2;

        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){

            System.out.print(vetorA[i] + " ");

        }

        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++){

            System.out.print(vetorB[i] + " ");

        }

        }
    }


