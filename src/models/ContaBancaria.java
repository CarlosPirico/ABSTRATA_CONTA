package models;

public abstract class ContaBancaria {
	protected double saldo = 0;
	protected int consulta = 1;
	
	public ContaBancaria() {
	}
	
	public void saque(double saque) {
		saldo -= saque;
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public String consulta() {
		return "Saldo: " + saldo;
	}
}
