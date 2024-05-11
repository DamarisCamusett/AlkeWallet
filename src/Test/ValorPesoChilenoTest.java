package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import monedaAlkeWallet.ValorPesoChileno;

public class ValorPesoChilenoTest {

	@Test
	public void testTipoCambio() {
		// Se crea una instancia de ValorPesoChileno
		ValorPesoChileno pesoChileno = new ValorPesoChileno();

		// Se verifica que el tipo de cambio sea 1
		assertEquals(1.0, pesoChileno.tipoCambio(), 0.0);
	}

	@Test
	public void testCambio() {
		// Se crea una instancia de ValorPesoChileno
		ValorPesoChileno pesoChileno = new ValorPesoChileno();

		// Se realiza el cambio de monto
		double monto = 1000.0;
		double montoConvertido = pesoChileno.Cambio(monto);

		// Se verifica que el monto convertido sea igual al monto inicial
		assertEquals(monto, montoConvertido, 0.0);
	}
}