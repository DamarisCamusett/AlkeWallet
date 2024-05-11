package cuentaAlkeWallet;

public class Cuenta implements CuentaBancaria {
	// Declaración de Atributos
	private int numeroCuenta;
	private double saldoDisponible;

	// Constructor
	public Cuenta(int numeroCuenta, double saldoDisponible) {
		this.numeroCuenta = numeroCuenta;
		this.saldoDisponible = saldoDisponible;
	}

	// Método para mostrar los datos de la cuenta
	public void mostrarDatosCta() {
		System.out.println("Número de cuenta: " + numeroCuenta);
	}

	@Override
	public void depositar(double cantidad) {
		saldoDisponible += cantidad;
	}

	@Override
	public void retirar(double cantidad) {
		if (cantidad <= saldoDisponible) {
			saldoDisponible -= cantidad;
		} else {
			System.out.println("El saldo es insuficiente");
		}
	}

	@Override
	public double consultarSaldo() {
		return saldoDisponible;
	}

}