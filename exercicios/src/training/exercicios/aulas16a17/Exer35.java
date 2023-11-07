package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer35 {

    public static void main(String[] args) {
        // gerando uma lista de números primos entre 1 e o n informado pelo usuário

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número");

        int num = scan.nextInt();

        boolean primo;

        for (int i = 1; i <=num; i++){

            primo = true;

            for (int j=2; j<i; j++){
            if (i % j == 0){
                primo = false;
            }
        }
            if (primo){
                System.out.println(i);
            }
        }
}}
