package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //verificação e cálculo sobre população A x popolução B

        boolean valido = false;

        double paisA;

        double paisB;

        double taxaA;

        double taxaB;

        do {

            System.out.println("Informe a população A: ");
            paisA = scan.nextDouble();

            if (paisA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");
            }
        }while (!valido);


        valido = false;

        do{

            System.out.println("Informe a população B: ");
            paisB = scan.nextDouble();

            if (paisB > 0) {
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0.");
            }
        }while (!valido);


        valido = false;

        do {

            System.out.println("Informe a taxa de crescimento da população A: ");
            taxaA = scan.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("A taxa de crescimento da população A precisa ser maior que 0.");
            }
        }while (!valido);


        valido = false;

        do{

            System.out.println("Informe a taxa de crescimento da população B: ");
            taxaB = scan.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("A taxa de crescimento da população B precisa ser maior que 0.");
            }
        }while (!valido);

        int contador = 0;

        while (paisA < paisB){

            paisA += (paisA * taxaA) / 100;
            paisB += (paisA * taxaB) / 100;
            contador++;
        }

        System.out.println("População país A: " + paisA);
        System.out.println("População país B: " + paisB);
        System.out.println("Quantidade de anos: " + contador);


    }

    }