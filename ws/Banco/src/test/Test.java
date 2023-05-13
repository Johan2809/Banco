package test;

import java.util.Collections;

import model.Banco;
import model.Cliente;

public class Test {

	public static void main(String[] args) {
		Banco banco = new Banco("MI BANCO", null, null);

		Cliente cliente = new Cliente("ana", "marinez", "123123213", banco, 20);
		Cliente cliente1 = new Cliente("andres", "gomez", "232233", banco, 30);

		banco.getListacliente().add(cliente);
		banco.getListacliente().add(cliente1);

		Collections.sort(banco.getListacliente());
	}

}