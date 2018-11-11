package cuatro;
import java.util.*;
public class producto {
	
 private String nombre;
 private int cantidad;
 private int precio;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public producto(String nombre, int cantidad, int precio) {
	super();
	this.nombre = nombre;
	this.cantidad = cantidad;
	this.precio = precio;
}
public producto() {
	super();
}
@Override
public String toString() {
	return "producto [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
}
 
 
}
