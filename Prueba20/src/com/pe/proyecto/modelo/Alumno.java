package com.pe.proyecto.modelo;

public class Alumno {
	private String nombre;

	private int dn1;
    private String apellido;
	private String lugarnacimiento;
	private double promedionotas;
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDn1() {
		return dn1;
	}

	public void setDn1(int dn1) {
		this.dn1 = dn1;
	}

	public double getPromedionotas() {
		return promedionotas;
	}

	public void setPromedionotas(double promedionotas) {
		this.promedionotas = promedionotas;
	}
	

}
