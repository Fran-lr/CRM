package modelo;
// Generated 9 abr. 2021 8:53:38 by Hibernate Tools 5.4.27.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Salas generated by hbm2java
 */
public class Salas implements java.io.Serializable {

	private int idsala;
	private Ciudades ciudades;
	private String planta;
	private String puerta;
	private int numasistentes;
	private Set ordens = new HashSet(0);

	public Salas() {
	}

	public Salas(int idsala, Ciudades ciudades, String planta, String puerta, int numasistentes) {
		this.idsala = idsala;
		this.ciudades = ciudades;
		this.planta = planta;
		this.puerta = puerta;
		this.numasistentes = numasistentes;
	}

	public Salas(int idsala, Ciudades ciudades, String planta, String puerta, int numasistentes, Set ordens) {
		this.idsala = idsala;
		this.ciudades = ciudades;
		this.planta = planta;
		this.puerta = puerta;
		this.numasistentes = numasistentes;
		this.ordens = ordens;
	}

	public int getIdsala() {
		return this.idsala;
	}

	public void setIdsala(int idsala) {
		this.idsala = idsala;
	}

	public Ciudades getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(Ciudades ciudades) {
		this.ciudades = ciudades;
	}

	public String getPlanta() {
		return this.planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public String getPuerta() {
		return this.puerta;
	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

	public int getNumasistentes() {
		return this.numasistentes;
	}

	public void setNumasistentes(int numasistentes) {
		this.numasistentes = numasistentes;
	}

	public Set getOrdens() {
		return this.ordens;
	}

	public void setOrdens(Set ordens) {
		this.ordens = ordens;
	}

}
