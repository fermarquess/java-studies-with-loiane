package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas (idades) a turma possui?: ");

        int idades = scan.nextInt();

        int idade;
        double soma = 0;
        double media;

        for (int i = 0; i < idades; i++){

            System.out.println("Informe a idade de cada um - aluno " + (i + 1));
            idade = scan.nextInt();

            soma += idade;

        }

        media = soma / idades;

        System.out.println("A media de idade da turma é de: " + media + "anos");

        if (media > 0 && media <= 25){
            System.out.println("Turma Jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("Turma Adulta");
        } else if (media > 60) {
            System.out.println("Turma Idosa");

        }


    }
}
