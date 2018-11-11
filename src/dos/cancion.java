package dos;

public class cancion {
 private String nombre;
 private String artista;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getArtista() {
	return artista;
}
public void setArtista(String artista) {
	this.artista = artista;
}
public cancion(String nombre, String artista) {
	super();
	this.nombre = nombre;
	this.artista = artista;
}
public cancion() {
	super();
}
@Override
public String toString() {
	return "cancion [nombre=" + nombre + ", artista=" + artista + "]";
}
 
 
}
