import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Este programa l� dados");
		
		System.out.print("Digite seu nome: ");
		String nome = leitor.next();
				
		System.out.println("Que legal ter voc� aqui, " + nome + "!!!");
		
		leitor.close();
	}

}
