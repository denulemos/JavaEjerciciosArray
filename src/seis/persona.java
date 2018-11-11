package seis;

public class persona {
	private String Nombre;
   private String Apellido;
private String Dni;
  private String Telefono;
	private String Mail;
	
	
	public persona() {
		super();
	}
	public persona(String nombre, String apellido, String dni, String telefono, String mail) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Dni = dni;
		Telefono = telefono;
		Mail = mail;
	}
	
	@Override
	public String toString() {
		return "persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Dni=" + Dni + ", Telefono=" + Telefono
				+ ", Mail=" + Mail + "]";
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	
	
}
