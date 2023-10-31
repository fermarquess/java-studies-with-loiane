package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //flag

        boolean infos = false;

        String nome;

        int idade;

        double salario;

        String sexo;

        String estadoCivil;

        do {

            System.out.println("Informe seu nome: ");

            nome = scan.next();

            if (nome.length() < 3) {
                infos = false;
                System.out.println("Seu nome deve ter pelo menos 3 caracteres. Digite novamente.");

            } else {
                infos = true;
                System.out.println("Olá, " + nome);
            }

        } while(!infos);

        infos = false;

        do {
            System.out.println("Informe sua idade: ");

            idade = scan.nextInt();

            if (idade > 0 && idade < 150) {
                infos = true;
                System.out.println("Sua idade é: " + idade + " anos.");
            } else {
                System.out.println("Idade inválida.");
            }
        } while (!infos);

        infos = false;

        do {

            System.out.println("Informe seu salário: ");

            salario = scan.nextDouble();

            if (salario > 0) {
                infos = true;
                System.out.println("Seu salário é de: " + salario);
            } else {
                System.out.println("Salário inválido");
            }
        } while (!infos);

        infos = false;

        do {

            System.out.println("Informe seu sexo (F ou M)");

            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infos = true;
                System.out.println("Sexo: " + sexo);
            } else {
                System.out.println("Inválido. Precisa ser 'f' ou 'm' ");
            }
        } while (!infos);


        infos = false;

        do {

            System.out.println("Informe seu estado civil: S, C, V, D");

            estadoCivil = scan.next();

            switch (estadoCivil){
                case "s", "S":
                    infos = true;
                    System.out.println("Solteiro");
                    break;
                case "c", "C":
                    infos = true;
                    System.out.println("Casado");
                    break;
                case "v", "V":
                    infos = true;
                    System.out.println("Viúvo");
                    break;
                case "d", "D":
                    infos = true;
                    System.out.println("Divorciado");
                    break;
                default:
                    System.out.println("Estado civil inválido. Precisa ser: s, c, v ou d.");
            }

        } while(!infos);
    }
}
