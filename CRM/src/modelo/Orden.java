package modelo;
// Generated 9 abr. 2021 8:53:38 by Hibernate Tools 5.4.27.Final

/**
 * Orden generated by hbm2java
 */
public class Orden implements java.io.Serializable {

	private int idorden;
	private Clientes clientes;
	private Salas salas;
	private String precio;

	public Orden() {
	}

	public Orden(int idorden, Clientes clientes, Salas salas, String precio) {
		this.idorden = idorden;
		this.clientes = clientes;
		this.salas = salas;
		this.precio = precio;
	}

	public int getIdorden() {
		return this.idorden;
	}

	public void setIdorden(int idorden) {
		this.idorden = idorden;
	}

	public Clientes getClientes() {
		return this.clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public Salas getSalas() {
		return this.salas;
	}

	public void setSalas(Salas salas) {
		this.salas = salas;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

}
