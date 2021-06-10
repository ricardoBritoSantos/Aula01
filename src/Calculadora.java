import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double valor1;
		double valor2;
		double soma;
		
		System.out.println("Por favor, Digite um valor:");
		valor1 = leitor.nextDouble();
		System.out.println("Por favor, Digite outro valor:");
		valor2 = leitor.nextDouble();
		
		soma = valor1 + valor2;
		
		System.out.println("A soma dos dois valores informados é: " +( soma));
		//System.out.println("A soma dos valores é:" +( valor1 + valor2));
		leitor.close();
		
	}

}
