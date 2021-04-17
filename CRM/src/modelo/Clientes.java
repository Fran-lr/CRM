package modelo;
// Generated 9 abr. 2021 8:53:38 by Hibernate Tools 5.4.27.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes implements java.io.Serializable {

	private int idcliente;
	private String nombreCliente;
	private String nif;
	private Set ordens = new HashSet(0);

	public Clientes() {
	}

	public Clientes(int idcliente, String nombreCliente, String nif) {
		this.idcliente = idcliente;
		this.nombreCliente = nombreCliente;
		this.nif = nif;
	}

	public Clientes(int idcliente, String nombreCliente, String nif, Set ordens) {
		this.idcliente = idcliente;
		this.nombreCliente = nombreCliente;
		this.nif = nif;
		this.ordens = ordens;
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Set getOrdens() {
		return this.ordens;
	}

	public void setOrdens(Set ordens) {
		this.ordens = ordens;
	}

}