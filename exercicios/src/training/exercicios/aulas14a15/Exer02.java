package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor: ");

        int valor = scan.nextInt();

        if (valor >= 0 ){
            System.out.println("O número informado é positivo");
        } else {
            System.out.println("O número informado é negativo");
        }
    }
}
