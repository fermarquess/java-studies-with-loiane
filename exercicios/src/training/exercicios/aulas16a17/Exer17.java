package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer17 {

    public static void main(String[] args) {
        // calculando o fatorial de um número
        // como o segundo exemplo Ex.: 5!=5.4.3.2.1=120
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");

        int num = scan.nextInt();

        System.out.println(num + "! = " + num + " * ");

        int fatorial = 1;

        for (int i = num; i >0; i--){
            fatorial *= i;

            System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);
    }
}
