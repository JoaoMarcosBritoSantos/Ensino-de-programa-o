package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	int  quantidadedecompras, atraso, scorecompras, scoreinadimplencia, scoreformadepagamento;
	char maioriadascompras;
	double ticket;
	
	System.out.println("SISTEMA DE PERFIL DO CLIENTE");
	System.out.println("--------------------------------");
	System.out.println("INFORME OS DADOS DO �LTIMO ANO");
	System.out.println(" ");
	System.out.printf("Quantas compras o cliente fez no �ltimo ano? ");
	quantidadedecompras = sc.nextInt();
	System.out.printf("Qual o ticket m�dio? ");
	ticket = sc.nextDouble();
	System.out.println(" ");
	System.out.printf("Quantas vezes o cliente atrasou o pagamento? ");
	atraso = sc.nextInt();
	System.out.printf("A maioria da compras foi em dinheiro, cart�o, ou boleto (D,C,B)? ");
	maioriadascompras = sc.next().charAt(0);
	System.out.println(" ");

		sc.close();
	}

}
