package dos;
import java.util.*;
import dos.cancion;;
public class cd {
 
	ArrayList<cancion> canciones = new ArrayList<cancion>();
	private int contador =0;
	
	
	public cd() {
		super();
	}


	public cd(ArrayList<cancion> canciones) {
		super();
		this.canciones = new ArrayList();
		
	}
	
	public int numeroCanciones() {
		contador = canciones.size();
		return contador;
	}
	
	public cancion dameCancion(int numero) {
	  cancion cancion = canciones.get(numero);
	  return cancion;
	  
		
	}
	
	public void agregarCancion (int posicion, String nombre, String artista) {
		cancion cancion = new cancion (nombre, artista);
		canciones.set(posicion, cancion);
		
	}
	
	public void agregarCancionFinal (String nombre, String artista) {
		cancion cancion = new cancion (nombre, artista);
		canciones.add(cancion);
	}
	
	public void eliminarCancion (int posicion) {
		canciones.remove(posicion);
	}


	@Override
	public String toString() {
		return "cd [canciones=" + canciones + ", contador=" + contador + "]";
	}
	
	
	
}
