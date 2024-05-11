package monedaAlkeWallet;

/**
 * Principio Responzabilidad Única: Está interfaz solo tiene una
 * responsabilidad, la cual es definir los métodos necesarios para realizar el
 * tipo de cambio de moneda (CLP, USD, EUR).
 */
public interface Moneda {
	// Metodos Abstractos
	double tipoCambio();

	double Cambio(double monto);

}
