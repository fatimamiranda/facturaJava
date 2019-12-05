package com.example.demo.model;

public class TestClass {

	public static void main(String[] args) {
		
		Factura f1 = new Factura();
		
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		
		f1.addLinea(p1, 10, 5.67);
	}

}
