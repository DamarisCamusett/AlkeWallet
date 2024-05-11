package aplicacionAlkeWallet;

import java.util.Scanner;

import cuentaAlkeWallet.Cliente;
import cuentaAlkeWallet.CtaAhorro;
import cuentaAlkeWallet.CtaCorriente;
import cuentaAlkeWallet.Cuenta;
import monedaAlkeWallet.ValorDolar;
import monedaAlkeWallet.ValorEuro;
import monedaAlkeWallet.ValorPesoChileno;

public class Main {
	public static void main(String[] args) {
		// Crear una instancia de la clase Cuenta
		Cuenta cuenta = new Cuenta(12345678, 200000.0);

		// Crear instancias de las clases CtaCorriente y CtaAhorro con valores iniciales
		CtaCorriente ctaCorriente = new CtaCorriente(12345678, 500000.0, 250000.0);
		CtaAhorro ctaAhorro = new CtaAhorro(12345678, 300000.0, 0.10); // Tasa de interés del 10%

		// Crear una instancia de la clase Cliente asociada a la cuenta
		Cliente cliente = new Cliente(1234567890, "César Sánchez", cuenta);

		// Mostrar los datos del cliente en pantalla
		cliente.mostrarDatosCliente();

		Scanner scanner = new Scanner(System.in); // Se crea una instancia de Scanner para leer la entrada del usuario

		int selectOption;
		do {
			// Mostrar en pantalla el menú a seleccionar por el usuario
			System.out.println("--------------------------------------------------------");
			System.out.println("Seleccione una opción:");
			System.out.println("1. Realizar depósito");
			System.out.println("2. Realizar retiro");
			System.out.println("3. Consultar saldo");
			System.out.println("4. Realizar cambio de moneda a USD");
			System.out.println("5. Realizar cambio de moneda a EUR");
			System.out.println("6. Realizar cambio de moneda a CLP");
			System.out.println("0. Cerrar AlkeWallet");
			System.out.println("--------------------------------------------------------");

			// Para leer la opción ingresada por el usuario
			System.out.print("Ingrese su opción: ");
			selectOption = scanner.nextInt();

			// Variables para depósito y retiro
			double cantidad;
			int opcionSubMenu;

			// Para procesar la opción ingresada por el usuario
			switch (selectOption) {
			case 1:
				System.out.println("Realizar depósito:");
				System.out.println("1. Cuenta Corriente");
				System.out.println("2. Cuenta Ahorro");
				System.out.print("Ingrese su opción: ");
				opcionSubMenu = scanner.nextInt();
				switch (opcionSubMenu) {
				case 1:
					System.out.print("Ingrese la cantidad a depositar: ");
					cantidad = scanner.nextDouble();
					ctaCorriente.depositar(cantidad);
					System.out.println("Saldo disponible en la Cuenta Corriente: " + ctaCorriente.consultarSaldo());
					break;
				case 2:
					System.out.print("Ingrese la cantidad a depositar: ");
					cantidad = scanner.nextDouble();
					ctaAhorro.depositar(cantidad);
					System.out.println("Saldo disponible en la Cuenta de Ahorro: " + ctaAhorro.consultarSaldo());
					break;
				default:
					System.out.println("Opción seleccionada es inválida. Por favor, seleccione una opción válida.");
					break;
				}
				break;

			case 2:
				System.out.println("Realizar retiro:");
				System.out.println("1. Cuenta Corriente");
				System.out.println("2. Cuenta Ahorro");
				System.out.print("Ingrese su opción: ");
				opcionSubMenu = scanner.nextInt();
				switch (opcionSubMenu) {
				case 1:
					System.out.print("Ingrese la cantidad a retirar: ");
					cantidad = scanner.nextDouble();
					if (cantidad > ctaCorriente.consultarSaldo()) {
						System.out.println("El monto excede el saldo disponible en la Cuenta Corriente.");
					} else {
						ctaCorriente.retirar(cantidad);
						System.out.println("Saldo disponible en la Cuenta Corriente: " + ctaCorriente.consultarSaldo());
					}
					break;
				case 2:
					System.out.print("Ingrese la cantidad a retirar: ");
					cantidad = scanner.nextDouble();
					if (cantidad > ctaAhorro.consultarSaldo()) {
						System.out.println("El monto excede el saldo disponible en la Cuenta de Ahorro.");
					} else {
						ctaAhorro.retirar(cantidad);
						System.out.println("Saldo disponible en la Cuenta de Ahorro: " + ctaAhorro.consultarSaldo());
					}
					break;
				default:
					System.out.println("Opción seleccionada es inválida. Por favor, seleccione una opción válida.");
					break;
				}
				break;
			case 3:
				System.out.println("Consultar saldo de:");
				System.out.println("1. Cuenta Corriente");
				System.out.println("2. Cuenta Ahorro");
				System.out.print("Ingrese su opción: ");
				opcionSubMenu = scanner.nextInt();
				switch (opcionSubMenu) {
				case 1:
					System.out.println("Saldo actual de la cuenta corriente: " + ctaCorriente.consultarSaldo());
					break;
				case 2:
					System.out.println("Saldo actual de la cuenta de ahorro: " + ctaAhorro.consultarSaldo());
					break;
				default:
					System.out.println("Opción seleccionada es inválida. Por favor, seleccione una opción válida.");
					break;
				}
				break;
			case 4:
				System.out.println("Cambio de moneda a Dolar (USD):");
				System.out.println("1. Cambiar saldo Cuenta Corriente");
				System.out.println("2. Cambiar saldo Cuenta Ahorro");
				System.out.print("Ingrese su opción: ");
				opcionSubMenu = scanner.nextInt();
				switch (opcionSubMenu) {
				case 1:
					// Conversión del saldo de la cuenta corriente a dólares
					ValorDolar valorDolar = new ValorDolar();
					double saldoCorrienteEnDolares = valorDolar.Cambio(ctaCorriente.consultarSaldo());
					System.out
							.println("Saldo disponible en la Cuenta Corriente en dólares: " + saldoCorrienteEnDolares);
					break;
				case 2:
					// Conversión del saldo de la cuenta de ahorro a dólares
					valorDolar = new ValorDolar(); // Nueva instancia de ValorDolar
					double saldoAhorroEnDolares = valorDolar.Cambio(ctaAhorro.consultarSaldo());
					System.out.println("Saldo disponible en la Cuenta de Ahorro en dólares: " + saldoAhorroEnDolares);
					break;
				default:
					System.out.println("Opción seleccionada es inválida. Por favor, seleccione una opción válida.");
					break;
				}
				break;
			case 5:
				System.out.println("Cambio de moneda a Euro (EUR):");
				System.out.println("1. Cambiar saldo Cuenta Corriente");
				System.out.println("2. Cambiar saldo Cuenta Ahorro");
				System.out.print("Ingrese su opción: ");
				opcionSubMenu = scanner.nextInt();
				switch (opcionSubMenu) {
				case 1:
					// Conversión del saldo de la cuenta corriente a euros
					ValorEuro valorEuro = new ValorEuro();
					double saldoCorrienteEnEuros = valorEuro.Cambio(ctaCorriente.consultarSaldo());
					System.out.println("Saldo disponible en la Cuenta Corriente en euros: " + saldoCorrienteEnEuros);
					break;
				case 2:
					// Conversión del saldo de la cuenta de ahorro a euros
					valorEuro = new ValorEuro(); // Nueva instancia de ValorEuro
					double saldoAhorroEnEuros = valorEuro.Cambio(ctaAhorro.consultarSaldo());
					System.out.println("Saldo disponible en la Cuenta de Ahorro en euros: " + saldoAhorroEnEuros);
					break;
				default:
					System.out.println("Opción seleccionada es inválida. Por favor, seleccione una opción válida.");
					break;
				}
				break;
			case 6:
				System.out.println("Cambio de moneda a Peso (CLP):");
				System.out.println("1. Cambiar saldo Cuenta Corriente");
				System.out.println("2. Cambiar saldo Cuenta Ahorro");
				System.out.print("Ingrese su opción: ");
				opcionSubMenu = scanner.nextInt();
				switch (opcionSubMenu) {
				case 1:
					// Realizar la conversión del saldo disponible de la cuenta corriente a pesos
					// chilenos
					ValorPesoChileno valorPesoChileno = new ValorPesoChileno();
					double saldoCorrienteEnCLP = valorPesoChileno.Cambio(ctaCorriente.consultarSaldo());
					System.out.println(
							"Saldo disponible en la Cuenta Corriente en pesos chilenos: " + saldoCorrienteEnCLP);
					break;
				case 2:
					// Realizar la conversión del saldo disponible de la cuenta de ahorro a pesos
					// chilenos
					valorPesoChileno = new ValorPesoChileno(); // Se crea una nueva instancia de ValorPesoChileno
					double saldoAhorroEnCLP = valorPesoChileno.Cambio(ctaAhorro.consultarSaldo());
					System.out
							.println("Saldo disponible en la Cuenta de Ahorro en pesos chilenos: " + saldoAhorroEnCLP);
					break;
				default:
					System.out.println("Opción seleccionada es inválida. Por favor, seleccione una opción válida.");
					break;
				}
				break;
			case 0:
				System.out.println("Cerrando sesión...");
				break;
			default:
				System.out.println("Opción seleccionada es inválida. Por favor, seleccione una opción válida.");
				break;
			}
		} while (selectOption != 0);

		scanner.close();
	}
}
