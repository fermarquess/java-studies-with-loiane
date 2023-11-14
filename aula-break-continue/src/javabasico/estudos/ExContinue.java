package javabasico.estudos;

import java.util.Scanner;

public class ExContinue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número");

        int num = scan.nextInt();

        System.out.println("Informe um limite");

        int max = scan.nextInt();
        // utilizando o continue, ao encontrar os números divisíveis por 7, ele ignora e segue.
        // neste caso, ele não mostra nenhum dos números divisíveis por 7 entre o num1 e o max.
        for (int i = num; i <= max; i++){

            if (i % 7 == 0){
                continue;
            }

            System.out.println("O valor de i é: " + i);

        }

    }

}
