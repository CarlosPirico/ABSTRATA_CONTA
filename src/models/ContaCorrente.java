package models;

public class ContaCorrente extends ContaBancaria {
	private double credito = 1500;
	
	// criando construtor
	public ContaCorrente() {
	}
	
	// metodos
	@Override
	public void saque(double saque) {
		// validacao de saldo para saque e acrescentando taxa.
		if ((saque * 1.05) < saldo + credito) {
			saldo -= (saque * 1.05);
		} else {
			System.out.println("Valor de saque invalido!");
		}
	}

	@Override
	public void deposito(double deposito) {
		// deposito mais taxa
		saldo += (deposito * 0.98);
	}
	
	@Override
	public String consulta() {
		// validando qtd de consulta para cobrar taxa
		if (consulta % 5 == 0) {
			saldo -= 0.10;
		}
		consulta++;
		return "Saldo: " + saldo + 
				"\nCredito: " + credito + 
				"\nTotal: " + (credito + saldo) + "\n";
	}

}
