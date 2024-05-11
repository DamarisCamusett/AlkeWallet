package monedaAlkeWallet;

/**
 * Principio Substitucion de Liskov: Utilizada para sustituir objetos de una
 * clase base sin alterar el funcionamiento del programa, en cual en este caso,
 * es cambiar el tipo de moneda a Peso Chileno (CLP).
 */
public class ValorPesoChileno implements Moneda {

	@Override
	public double tipoCambio() {
		return 1; // El valor de conversion es 1 debido a que 1 CLP = 1 CLP.
	}

	@Override
	public double Cambio(double monto) {
		return monto;
	}
}
