package cuentaAlkeWallet;

public class CtaCorriente extends Cuenta {
	// Atributo
	private double limiteSobregiro;

	// Constructor
	public CtaCorriente(int numeroCuenta, double saldoDisponible, double limiteSobregiro) {
		// Llama al constructor de la superclase (CON SUPER)
		super(numeroCuenta, saldoDisponible);
		this.limiteSobregiro = limiteSobregiro;
	}

	@Override
	public void retirar(double cantidad) {
		if (cantidad <= (super.consultarSaldo() + limiteSobregiro)) {
			super.retirar(cantidad);
		} else {
			System.out.println("Excede el límite de sobregiro");
		}
	}
}
