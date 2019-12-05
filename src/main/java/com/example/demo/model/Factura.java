package com.example.demo.model;

import java.util.Date;
import java.util.List;

public class Factura {

	private Integer codigo;
	private Cliente cliente;
	private Date fecha;
	private List<LineaFactura> lineas;
	
	//Constructor vacío
	public Factura() {
		
	}

	public Factura(Integer codigo, Cliente cliente, Date fecha, List<LineaFactura> lineas) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.fecha = fecha;
		this.lineas = lineas;
	}

	public Integer getNumeroFactura() {
		return codigo;
	}

	public void setNumeroFactura(Integer codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<LineaFactura> getLineas() {
		return lineas;
	}

	public void setLineas(List<LineaFactura> lineas) {
		this.lineas = lineas;
	}

	public double getSubTotal() {
		double total= 0.0;
		
		for ( LineaFactura lf: lineas) {
			total += lf.getTotal();
		}
		
		return total;
	}
	
	public double getIva() {
		return getSubTotal() *0.21;
	}
	
	public double getTotal() {
		double total= 0.0;
		
		for ( LineaFactura lf: lineas) {
			total += lf.getTotal();
		}
		return total * 1.21;	
	}
	
	public void addLinea(Producto producto, int cantidad, double precio) {
		
		this.lineas.add(new LineaFactura(producto,cantidad,precio));
	}
	
	@Override
	public String toString() {
		return "Factura [numeroFactura=" + codigo
				+ ", cliente=" + cliente + ", fecha=" + fecha + ", lineas="
				+ lineas + "]";
	}
	
}
