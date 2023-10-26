package training.exercicios.aulas11a13;

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado: ");

        double ladoQuadrado = scan.nextDouble();

        // area = lado * lado
        // poderia ser resolvido dessa forma também:
        // double areaQuadrado = ladoQuadrado * ladoQuadrado;

        double areaQuadrado = Math.pow(ladoQuadrado, 2);

        System.out.println("Esta é a área do quadrado: " + areaQuadrado);


        System.out.println("O dobro da área do quadrado é: " + (areaQuadrado * 2));


    }
}
