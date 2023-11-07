package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer32 {

    public static void main(String[] args) {

        // calculando o fatorial de um número
        // e mostrar como o exemplo Ex.: 5!=5.4.3.2.1=120
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");

        int num = scan.nextInt();

        System.out.println("Fatorial de: " + num);
        System.out.print(num + "! = ");

        int fatorial = 1;

        for (int i = num; i >1; i--){
            fatorial *= i;

            System.out.print(i + " . ");
        }
        System.out.print("1 = " + fatorial);
    }

}
