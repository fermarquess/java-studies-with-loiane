package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer43 {

    public static void main(String[] args) {

        // cardápio de uma lanchonete
        // calculando o preço * quantidade conforme o código inserido

        Scanner scan = new Scanner(System.in);

        boolean naoTerminar = true;

        int cod, qtd;

        double total = 0;

        String saida = "";

        do {

            System.out.println("Digite o código e a quantidade. Digite 0 0 para sair.");
            cod = scan.nextInt();
            qtd = scan.nextInt();

            if (cod == 0 && qtd == 0) {
                naoTerminar = false;
                saida += "Total a pagar = " + total;
            } else {

                if (cod == 100) {
                    saida += "Cachorro quente -> 1,20 * " + qtd;
                    saida += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                } else if (cod == 101) {
                    saida += "Bauru simples -> 1,30 * " + qtd;
                    saida += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                } else if (cod == 102) {
                    saida += "Bauru com ovo -> 1,50 * " + qtd;
                    saida += " = " + (1.5 * qtd) + "\n";
                    total += 1.5 * qtd;
                } else if (cod == 103) {
                    saida += "Hambúrguer -> 1,20 * " + qtd;
                    saida += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                } else if (cod == 104) {
                    saida += "Cheeseburguer -> 1,30 * " + qtd;
                    saida += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                } else if (cod == 105) {
                    saida += "Refrigerante -> 1,00 * " + qtd;
                    saida += " = " + (1.0 * qtd) + "\n";
                    total += 1.0 * qtd;
                }

            }
        }while (naoTerminar) ;

            System.out.println(saida);
        }
    }