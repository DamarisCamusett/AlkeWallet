package cuentaAlkeWallet;

/**
 * Principio Responzabilidad Única: Está interfaz solo tiene una
 * responsabilidad, la cual es definir los métodos necesarios para realizar el
 * tipo de cambio de moneda (CLP, USD, EUR).
 */

public interface CuentaBancaria {

	// Metodos para poder depositar, retirar y para consultar saldo
	void depositar(double cantidad);

	void retirar(double cantidad);

	double consultarSaldo();
}
