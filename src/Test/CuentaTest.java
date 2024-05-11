package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cuentaAlkeWallet.Cuenta;

public class CuentaTest {

	@Test
	public void testDepositar() {
		// Para crear una instancia de Cuenta con saldo inicial de 1000
		Cuenta cuenta = new Cuenta(123456789, 1000.0);

		// Para depositar 500 en la cuenta
		cuenta.depositar(500.0);

		// Para verificar que el saldo después del depósito sea correcto
		assertEquals(1500.0, cuenta.consultarSaldo(), 0.001); // Usamos delta para tolerancia en punto flotante
	}

	@Test
	public void testRetirar() {
		// Para crear una instancia de Cuenta con saldo inicial de 1000
		Cuenta cuenta = new Cuenta(123456789, 1000.0);

		// Para retirar 300 de la cuenta
		cuenta.retirar(300.0);

		// Para verificar que el saldo después del retiro sea correcto
		assertEquals(700.0, cuenta.consultarSaldo(), 0.001); // Usamos delta para tolerancia en punto flotante
	}

	@Test
	public void testConsultarSaldo() {
		// Se crea una instancia de Cuenta con saldo inicial de 1000
		Cuenta cuenta = new Cuenta(123456789, 1000.0);

		// Para verificar que el saldo inicial sea correcto
		assertEquals(1000.0, cuenta.consultarSaldo(), 0.001); // Usamos delta para tolerancia en punto flotante
	}
}
