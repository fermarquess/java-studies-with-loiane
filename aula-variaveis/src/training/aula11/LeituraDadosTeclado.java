package training.aula11;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			/** System.out.println("Digite seu nome completo: ");
			
			String nomeCompleto = scan.nextLine();
			
			System.out.println("Seu nome completo é: " + nomeCompleto);
			
			System.out.println("Digite seu primeiro nome: ");
			
			String primeiroNome = scan.nextLine();
			
			System.out.println("Seu primeiro nome é: " + primeiroNome);		
			
			System.out.println("Digite sua idade: ");
			int idade = scan.nextInt();
			
			System.out.println("Sua idade é: " + idade);
			
			System.out.println("Digite sua altura: ");
			double altura = scan.nextDouble();
			
			System.out.println("A sua altura é: " + altura);*/
			
			System.out.println("Digite seu primeiro nome, idade, quantidade de pets e se tem pet: ");
			String primeiroNome = scan.next();
			int idade = scan.nextInt();
			byte qtdPets = scan.nextByte();
			boolean seTemPet = scan.nextBoolean();
			
			System.out.println("Você digitou os seguintes valores: ");
			System.out.println("Primeiro nome: " + primeiroNome);
			System.out.println("Idade: " + idade);
			System.out.println("Quantidade de pets" + qtdPets);
			System.out.println("Você tem pets: " + seTemPet);
	
			
			
			
		}
		
	}

}
