package javabasico.estudos;

import java.util.Scanner;

public class ExBreak {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número");

        int num = scan.nextInt();

        System.out.println("Informe um limite");

        int max = scan.nextInt();
        // utilizando o break, ao encontrar o primeiro número divisível por 7, ele encerra.
        // sem o break, ele mostraria todos os números divisíveis por 7 entre o num1 e o max.
        for (int i = num; i <= max; i++){
            System.out.println(i);
            if (i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }

        }

    }
}
