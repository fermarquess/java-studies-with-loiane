package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean senhaValida = false;

        do {

            System.out.println("Digite seu nome de usuário: ");

            String nomeUsuario = scan.next();

            System.out.println("Digite sua senha: ");

            String senha = scan.next();

            if (senha.equalsIgnoreCase(nomeUsuario)){
                senhaValida = false;
                System.out.println("A senha não pode ser igual ao nome de usuário. ");
                System.out.println("Digite uma nova senha. ");
            } else {
                senhaValida = true;
                System.out.println("Seu acesso foi concluído com sucesso.");
            }

        } while (!senhaValida);
    }
}
