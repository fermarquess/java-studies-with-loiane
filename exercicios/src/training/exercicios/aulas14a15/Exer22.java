package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer22 {

    //O número é par ou impar?
    // para número par é necessário que seja divisível por 2 e igual a 0

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");

        int numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println("É um número par.");
        } else {
            System.out.println("É um número ímpar.");
        }
    }
}
