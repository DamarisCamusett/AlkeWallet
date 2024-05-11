package monedaAlkeWallet;

/**
 * Principio Substitucion de Liskov: Utilizada para sustituir objetos de una
 * clase base sin alterar el funcionamiento del programa, en cual en este caso,
 * es cambiar el tipo de moneda a Dolar Estadounidense (USD).
 */
public class ValorDolar implements Moneda {

	@Override
	public double tipoCambio() {
		return 936.13; // Valor dolar a la fecha de 08/05/2024
	}

	@Override
	public double Cambio(double monto) {
		return monto / tipoCambio();
	}
}
