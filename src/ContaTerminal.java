import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("---------------CONTA BANCÁRIA---------------\n");
		
        System.out.println("Digite o número da Conta: (1234)");
		numero = sc.nextInt();

		System.out.println("\nInforme o número da Agência: (123-8)");
		agencia = sc.next();
        if (agencia.length() <= 0){System.err.println("ERRO!\nAgência não pode ser vazia!");}

		System.out.println("\nNome: ");
		nomeCliente = sc.next();
        
        if (nomeCliente.length() < 3){
            System.err.println("ERRO!\nNão é possível aceitar este nome!");
        }
		sc.nextLine();

		System.out.println("\nInforme seu saldo atual: ");
		saldo = sc.nextDouble();

        if (saldo < 0.1) {System.err.println("ERRO!\nO saldo não pode ser 0");} 

		System.out.println();
		System.out.printf("\n\nPrezado Sr(a) %s, agradecemos pela preferência! "
				+ "A sua Agência é %s, "
				+ " conta %d e seu saldo é de R$ %.2f" , nomeCliente, agencia, numero, saldo);

		sc.close();
    }
}
