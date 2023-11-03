package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de turmas:");

        int qtdTurmas = scan.nextInt();

        int numAlunos;
        int soma = 0;
        boolean invalido = true;

        for (int i = 1; i <= qtdTurmas; i++ ){

           do {

               System.out.println("Informe a quantidade de alunos de cada turma:");
               numAlunos = scan.nextInt();

               if (numAlunos <= 40) {
                   invalido = false;
               } else {
                   System.out.println("Número de alunos inválido. Digite novamente: ");
               }

           }while (invalido) ;

           soma += numAlunos;

           }

        double mediaAlunosPorTurma = soma / qtdTurmas;

        System.out.println("A média é de: " + mediaAlunosPorTurma + " alunos por turma.");

           }
        }