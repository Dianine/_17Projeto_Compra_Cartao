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
		
		System.out.println("Voc� possue Cart�o de Cr�dito?");
		System.out.print("(1: Sim / 2: N�o): ");
			y = sc.nextInt();
		
		
		if (y == 1)  {
			System.out.print("Digite o N�mero do seu Cart�o: ");
			cartao = sc.nextInt();
			System.out.print("Digite c�digo de Seguran�a: ");
			cartao = sc.nextInt();
			System.out.println();
			System.out.println("Parab�ns, Sua Compra foi Realizada!!");
		}
		else{
		System.out.println();
		System.out.println("Infelizmente, s� trabalhamos com Cart�o.");
		}
		
		
		
		
		sc.close();	
			
	}
}
		

	

