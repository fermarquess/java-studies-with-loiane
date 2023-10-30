package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer18 {

    //unsolved

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma data no seguinte formato dd/mm/aaaa: ");

        String data = scan.next();


        if (data == "dd/MM/yyyy"){
            System.out.println("data válida: " + data);
        } else {
            System.out.println("data inválida.");
        }

    }
}
