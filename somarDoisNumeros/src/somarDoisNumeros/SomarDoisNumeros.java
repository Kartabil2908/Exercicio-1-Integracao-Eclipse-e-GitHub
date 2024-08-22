package somarDoisNumeros;
import java.util.Scanner;

class SomarDoisNumeros {
	
	public static int Somar( int num1, int num2)
	{
		return (num1+num2);
	}

	public static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		int num1, num2, soma = 0;
		
		System.out.println("Digite o primeiro número:");
		
		num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número:");
		num2 = scanner.nextInt();
		
		soma = Somar(num1,num2);
		
		scanner.close();
		
		System.out.println("A soma é " + soma);
				
	}
}
