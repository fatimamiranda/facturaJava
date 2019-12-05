package com.example.demo.model;

public class Cliente {
	
	//private int id;
	private String CIF;
	private String razonSocial;
	private String direccion;
	private String codigoPostal;
	private String ciudad;
	private String pais;
	
	public Cliente() {
		
	}
	
	public Cliente( String cIF, String razonSocial, String direccion, String codigoPostal, String ciudad,
			String pais) {
		
		CIF = cIF;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.pais = pais;
	}
	
	public String getCIF() {
		return CIF;
	}
	
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}
	
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Cliente [CIF=" + CIF + ", razonSocial=" + razonSocial + ", direccion=" + direccion
				+ ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", pais=" + pais + "]";
	}

}
