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
	System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
	System.out.println(" ");
	System.out.printf("Quantas compras o cliente fez no último ano? ");
	quantidadedecompras = sc.nextInt();
	System.out.printf("Qual o ticket médio? ");
	ticket = sc.nextDouble();
	System.out.println(" ");
	System.out.printf("Quantas vezes o cliente atrasou o pagamento? ");
	atraso = sc.nextInt();
	System.out.printf("A maioria da compras foi em dinheiro, cartão, ou boleto (D,C,B)? ");
	maioriadascompras = sc.next().charAt(0);
	System.out.println(" ");
	
	if (quantidadedecompras == 0) {
		scorecompras = 0;
	}
	else if (quantidadedecompras >= 2 && ticket <= 3000) {
		scorecompras = 20;
	}
	else if (quantidadedecompras < 2 && ticket <= 3000) {
		scorecompras = 40;
	}
	else {
		scorecompras = 60;
	}
	
	System.out.println(" ");
	System.out.printf("Score de volume de compras = ", scorecompras);
	
	
	if (atraso == 0 && quantidadedecompras == 0) {
		scoreinadimplencia = 0;
	}
	else if (atraso <= 1 && quantidadedecompras <= 1) {
		scoreinadimplencia = 15;
	}
	else if (atraso == 0 && quantidadedecompras <= 1) {
		scoreinadimplencia = 30;
	}
	else {
		scorecompras = 00;
	}
	
	System.out.println(" ");
	System.out.printf("Score de inadimplência = ", scoreinadimplencia);

	if (quantidadedecompras >= 1 && maioriadascompras == ('D')) {
		scoreformadepagamento = 5;
	}
		else {
		scoreformadepagamento = 10;
	}
	
	System.out.println(" ");
	System.out.printf("Score de forma de pagamento = ", scoreformadepagamento);

	

		sc.close();
	}

}
