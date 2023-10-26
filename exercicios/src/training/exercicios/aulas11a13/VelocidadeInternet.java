package training.exercicios.aulas11a13;

import java.util.Scanner;

public class VelocidadeInternet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo em MB: ");

        double arquivo = scan.nextDouble();

        System.out.println("Qual a velocidade do link em Mbps? ");

        double velocidade = scan.nextDouble();

        double tempoDownload = arquivo / velocidade;

        System.out.println("O tempo aproximado para download é de: " + tempoDownload);


    }
}
