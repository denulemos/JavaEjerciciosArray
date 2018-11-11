package cuatro;
import java.util.*;
import cuatro.producto;

public class ticket {
public static Scanner input;
	private ArrayList<producto> productos = new ArrayList<producto>();
	private int total = 0;
	
	public void agregarProductos (String producto, int cantidad, int precio) {
		
		String opcion = "a";
		
		do {
		producto producto1 = new producto(producto, cantidad, precio);
		productos.add(producto1);
		System.out.println("Desea continuar? Ingrese F para salir");
		opcion= input.next();
		}while (!opcion.equals("f"));
	}
	
	private int total() {
		for(int i = 0;i<productos.size();i++){
            total+= productos.get(i).getPrecio() * productos.get(i).getCantidad();            
}
		return total;
	}
	
	public void imprimirticket() {
		for(producto i: productos){
	           System.out.println(productos.toString());
	}
		System.out.println(total);
	}
	
	
	
}
