package cuentaAlkeWallet;

public class CtaAhorro extends Cuenta {

	private double interes;

	// Constructor de Interes
	public CtaAhorro(int numeroCuenta, double saldoDisponible, double interes) {
		super(numeroCuenta, saldoDisponible);
		this.interes = interes;
	}

	// Método para aplicar intereses específico de una cuenta de ahorro
	public void aplicarInteres() {
		double intereses = super.consultarSaldo() * interes;
		super.depositar(intereses);
	}

	// Sobreescribimos el método retirar para incluir el cargo por retiro
	@Override
	public void retirar(double cantidad) {
		super.retirar(cantidad);
		// Aplicamos un cargo por retiro en cuentas de ahorro
		super.retirar(cantidad * 0.10); // 10% de interes del monto retirado
	}
}
