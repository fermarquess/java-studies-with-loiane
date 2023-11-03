package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");

        int num = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                primo = false;
                System.out.println("Não é um número primo. - divisível por: " + i);
            }
        }
        if (primo) {
            System.out.println("É um número primo.");
        }
    }

}
