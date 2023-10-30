package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro lado do triângulo: ");

        int primeiroLado = scan.nextInt();

        System.out.println("Informe o segundo lado do triângulo: ");

        int segundoLado = scan.nextInt();

        System.out.println("Informe o terceiro lado do triângulo: ");

        int terceiroLado = scan.nextInt();

        if (((primeiroLado + segundoLado) > terceiroLado) ||
                ((primeiroLado + terceiroLado) > segundoLado) ||
                ((segundoLado + terceiroLado) > primeiroLado)){


            if (primeiroLado == segundoLado && primeiroLado == terceiroLado && segundoLado == terceiroLado){
                System.out.println("É um triângulo equilátero.");
            } else if (primeiroLado != segundoLado && primeiroLado != terceiroLado && terceiroLado != segundoLado){
                System.out.println("É um triângulo escaleno.");
            } else if (primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
                System.out.println("É um triângulo isóceles.");
            }
            {

            }
        } else {

            System.out.println("Não é um triângulo.");

        }
    }}
