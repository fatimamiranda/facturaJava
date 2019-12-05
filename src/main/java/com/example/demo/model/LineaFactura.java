package com.example.demo.model;

public class LineaFactura {

	private Producto producto;
	private int cantidad;
	private double precio;
	
	public LineaFactura() {
		
	}
	
	public LineaFactura(Producto producto, int cantidad, double precio) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
		
	}

	public Producto getProducto() {
		return producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return cantidad*precio;
	}

	@Override
	public String toString() {
		return "LineaFactura [producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + ", precioTotal="
				+ "]";
	}
	
}
