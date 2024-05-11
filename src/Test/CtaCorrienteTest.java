package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cuentaAlkeWallet.CtaCorriente;

public class CtaCorrienteTest {

	@Test
	public void testRetirarDentroDelLimite() {
		// Se crea una instanciade CtaCorriente con un saldo disponible de 1000 y un
		// límite de sobregiro de 500
		CtaCorriente cuentaCorriente = new CtaCorriente(123456789, 1000.0, 500.0);

		// Retiro dentro del límite
		cuentaCorriente.retirar(700.0);

		// Para verificar que el saldo después del retiro es correcto
		assertEquals(300.0, cuentaCorriente.consultarSaldo(), 0.001); // Usamos delta para tolerancia en punto flotante
	}

	@Test
	public void testRetirarExcedeLimite() {
		// Se crea una instancia de CtaCorriente con un saldo disponible de 1000 y un
		// límite de sobregiro de 500
		CtaCorriente cuentaCorriente = new CtaCorriente(123456789, 1000.0, 500.0);

		// Retiro que excede el límite
		cuentaCorriente.retirar(1700.0);

		// Para verificar que el saldo no cambió después del retiro
		assertEquals(1000.0, cuentaCorriente.consultarSaldo(), 0.001); // Usamos delta para tolerancia en punto flotante
	}
}