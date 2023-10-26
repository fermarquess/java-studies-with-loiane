package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite F ou M): ");

        String sexo = scan.next();

        //comparando Strings com o método equalsIgnoreCase

        if (sexo.equalsIgnoreCase("F")){

            System.out.println("Feminino");

        } else if (sexo.equalsIgnoreCase("M")) {

            System.out.println("Masculino");

        } else {

            System.out.println("Inválido");
        }


    }
}
