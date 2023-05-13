package model;

import javax.swing.JOptionPane;

public class CuentaBancaria {
	private String nombreTitular;
	private String apellidoTitular;
	private double saldo;
	private TipoCuenta tipoCuenta;
	private String numeroCuenta;

	public CuentaBancaria(TipoCuenta tipoCuenta, String numeroCuenta, String nombreTitular) {
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular;
		this.saldo = 0.0;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getApellidoTitular() {
		return apellidoTitular;
	}

	public void setApellidoTitular(String apellidoTitular) {
		this.apellidoTitular = apellidoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void retirarDinero(double valor) throws Exception {
		if (valor <= saldo) {
			saldo -= valor;
			JOptionPane.showMessageDialog(null, "Retiro exitoso");
		} else {
			throw new Exception("Fondos insuficientes");
		}
	}

	public void transferirDinero(CuentaBancaria cuentaDestino, double valor) throws Exception {
		if (valor <= saldo) {
			saldo -= valor;
			cuentaDestino.depositarDinero(valor);
			JOptionPane.showMessageDialog(null, "Transferencia exitosa");
		} else {
			throw new Exception("Fondos insuficientes");
		}
	}

	public void depositarDinero(double valor) {
		saldo += valor;
		JOptionPane.showMessageDialog(null, "Deposito exitoso");
	}

	public double consultarSaldo() {
		return saldo;
	}

	public boolean compararSaldo(CuentaBancaria otraCuenta) {
		return this.saldo >= otraCuenta.saldo;
	}

	public String toString() {
		return "Cuenta Bancaria: " + numeroCuenta + "\nTitular: " + nombreTitular + "\nTipo de cuenta: " + tipoCuenta
				+ "\nSaldo actual: $" + saldo;
	}
}
