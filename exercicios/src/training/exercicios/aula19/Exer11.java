package training.exercicios.aula19;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){

            System.out.println("Informe o valor para a posição: " + i);

            vetorA[i] = scan.nextInt();

        }

        System.out.println("Imprimindo os valores pares do vetorA ");

        for (int i = 0; i < vetorA.length; i++){

            if (vetorA[i] % 2 == 0){
                System.out.print(vetorA[i] + "  ");
            }
        }
    }
}
