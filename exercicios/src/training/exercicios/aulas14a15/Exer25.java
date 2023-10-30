package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? ");

        String seTelefonou = scan.next();

        System.out.println("Esteve no local do crime? ");

        String seEsteveNoLocal = scan.next();

        System.out.println("Mora perto da vítima? ");

        String moraPerto = scan.next();

        System.out.println("Devia para a vítima? ");

        String deviaParaVitima = scan.next();

        System.out.println("Já trabalhou com a vítima?");

        String trabalhouComVitima = scan.next();

        int cont = 0;

        if (seTelefonou.equalsIgnoreCase("S")){
            cont++;
        }
        if (seEsteveNoLocal.equalsIgnoreCase("S")){
            cont++;
        }
        if (moraPerto.equalsIgnoreCase("S")){
            cont++;
        }
        if (deviaParaVitima.equalsIgnoreCase("S")){
            cont++;
        }
        if (trabalhouComVitima.equalsIgnoreCase("S")){
            cont++;
        }

        if (cont == 2){
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        } else if (cont == 5) {
            System.out.println("Assasino");
        }else {
            System.out.println("Inocente");
        }


    }
}
