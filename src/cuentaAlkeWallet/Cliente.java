package cuentaAlkeWallet;

public class Cliente {

	// Declaración de Atributos
	private long ID;
	private String nombreTitular;
	private Cuenta cuenta; // Atributo para asociar la cuenta al cliente

	// Constructor
	public Cliente(long ID, String nombreTitular, Cuenta cuenta) {
		this.ID = ID;
		this.nombreTitular = nombreTitular;
		this.cuenta = cuenta; // Para asignar la cuenta al cliente
	}

	// Método para mostrar los datos del cliente
	public void mostrarDatosCliente() {
		System.out.println("¡Bienvenido/a " + nombreTitular + " a tu billetera virtual!");
		System.out.println("--------------------------------------------------------");
		System.out.println("DATOS DE LA CUENTA:");
		System.out.println("ID del titular: " + ID);
		System.out.println("Nombre del titular: " + nombreTitular);
		cuenta.mostrarDatosCta(); // Para mostrar los datos de la cuenta asociada al cliente
	}
}
