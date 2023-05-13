package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Banco {

	private String nombre;
	private List<CuentaBancaria> listaCuentaBancaria = new ArrayList<CuentaBancaria>();
	private List<Cliente> listacliente = new ArrayList<Cliente>();

	public Banco() {
		super();
	}

	public Banco(String nombre, List<CuentaBancaria> listaCuentaBancaria, List<Cliente> listacliente) {
		super();
		this.nombre = nombre;
		this.listaCuentaBancaria = listaCuentaBancaria;
		this.listacliente = listacliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CuentaBancaria> getListaCuentaBancaria() {
		return listaCuentaBancaria;
	}

	public void setListaCuentaBancaria(List<CuentaBancaria> listaCuentaBancaria) {
		this.listaCuentaBancaria = listaCuentaBancaria;
	}

	public List<Cliente> getListacliente() {
		return listacliente;
	}

	public void setListacliente(List<Cliente> listacliente) {
		this.listacliente = listacliente;
	}

	public void retirarDinero(String numeroCuenta, double cantidad) throws Exception {
		for (CuentaBancaria cuenta : listaCuentaBancaria) {
			if (cuenta.getNumeroCuenta().equals(numeroCuenta))
				cuenta.retirarDinero(cantidad);
			JOptionPane.showMessageDialog(null, "Dep�sito realizado con �xito.");
			return;
		}
	}

	public void depositarDinero(String numeroCuenta, double cantidad) {
		for (CuentaBancaria cuenta : listaCuentaBancaria) {
			if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
				cuenta.depositarDinero(cantidad);
				JOptionPane.showMessageDialog(null, "Dep�sito realizado con �xito.");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "La cuenta bancaria no existe.");
	}

	public void consultarSaldo(String numeroCuenta) {
		for (CuentaBancaria cuenta : listaCuentaBancaria) {
			if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
				JOptionPane.showMessageDialog(null,
						"El saldo de la cuenta " + numeroCuenta + " es: " + cuenta.getSaldo());
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "La cuenta bancaria no existe.");
	}
}
