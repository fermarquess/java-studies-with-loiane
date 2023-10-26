package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra do alfabeto: ");

        String letra = scanner.next();

/**          if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("Essa é uma vogal.");
        } else {
            System.out.println("Essa é uma consoante.");
        }
    }}
 */

    //adicionando um if e else para dar uma mensagem de erro caso seja inserido mais de uma letra

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            switch (letra){
                case "a", "A", "e", "E", "i", "I", "o", "O", "u", "U":
                    System.out.println("Essa é uma vogal!");
                    break;
                default:
                    System.out.println("Essa é uma consoante!");
                    break;
            }
        }
    }
}
