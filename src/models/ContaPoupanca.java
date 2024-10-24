package models;

// extendendo a superclasse contabancaria
public class ContaPoupanca extends ContaBancaria {

	// criando construtor
	public ContaPoupanca() {
	}
	
	// metodos
	@Override
	public void saque(double saque) {
		// validacao de saldo para saque e acrescentando taxa.
		if ((saque * 1.02) < saldo ) {
			saldo -= (saque * 1.02);
		} else {
			System.out.println("Valor de saque invalido!");
		}
	}

	@Override
	public void deposito(double deposito) {
		// deposito mais taxa
		saldo += (deposito * 0.99);
	}
	
	@Override
	public String consulta() {
		// validando qtd de consulta para cobrar taxa
		if (consulta % 10 == 0) {
			saldo -= 0.05;
		}
		consulta++;
		return "Saldo: " + saldo + "\n";
	}
	
}
