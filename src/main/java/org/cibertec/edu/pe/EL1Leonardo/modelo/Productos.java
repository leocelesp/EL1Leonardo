package org.cibertec.edu.pe.EL1Leonardo.modelo;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Productos {
	@Id
	private String Item;
	private String Articulo;
	private String Descripcion;
	private int Precio;
	
	public Productos() {
	}

	public Productos(String item, String articulo, String descripcion, int precio) {
		Item = item;
		Articulo = articulo;
		Descripcion = descripcion;
		Precio = precio;
	}

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

	public String getArticulo() {
		return Articulo;
	}

	public void setArticulo(String articulo) {
		Articulo = articulo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}
	
	
}
