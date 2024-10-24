package app;

import models.*;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente corrente = new ContaCorrente();
		ContaPoupanca poupanca = new ContaPoupanca();
		System.out.println("Conta Corrente");
		System.out.println(corrente.consulta());
		corrente.deposito(1500);
		System.out.println(corrente.consulta());
		corrente.saque(2000);
		System.out.println(corrente.consulta());
		corrente.saque(1100);
		System.out.println(corrente.consulta());
		corrente.saque(500);
		System.out.println(corrente.consulta());
		
		System.out.println("\nConta Poupaca");
		System.out.println(poupanca.consulta());
		poupanca.deposito(1500);
		System.out.println(poupanca.consulta());
		poupanca.saque(2000);
		System.out.println(poupanca.consulta());
		poupanca.saque(1100);
		System.out.println(poupanca.consulta());
		poupanca.saque(500);
		System.out.println(poupanca.consulta());

	}

}
