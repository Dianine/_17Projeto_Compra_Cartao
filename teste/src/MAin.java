import java.util.Locale;
import java.util.Scanner;

public class MAin {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
				
		String cliente;
		int y, cartao;
		
		System.out.print("xxxxxxxx FINALIZE SUA COMPRA xxxxxxxx");
		System.out.println();
		System.out.print("Nome Completo: ");
			cliente = sc.nextLine();
		
		System.out.println("Você possue Cartão de Crédito?");
		System.out.print("(1: Sim / 2: Não): ");
			y = sc.nextInt();
		
		
		if (y == 1)  {
			System.out.print("Digite o Número do seu Cartão: ");
			cartao = sc.nextInt();
			System.out.print("Digite código de Segurança: ");
			cartao = sc.nextInt();
			System.out.println();
			System.out.println("Parabéns, Sua Compra foi Realizada!!");
		}
		else{
		System.out.println();
		System.out.println("Infelizmente, só trabalhamos com Cartão.");
		}
		
		
		
		
		sc.close();	
			
	}
}
		

	

