package seis;
import seis.persona;
import java.util.*;
public class agenda {
     
	private ArrayList <persona> agenda = new ArrayList <persona>();
	
	public void agregarPersona( String Nombre, String Apellido, String Dni, String Telefono, String Mail) {
		persona persona = new persona(Nombre, Apellido, Dni, Telefono, Mail);
		agenda.add(persona);
	}
	
	public void eliminarPersona(String Dni) {
		
		for(int i = 0;i<agenda.size();i++){
            String dni = agenda.get(i).getDni();
            if (Dni.equals(dni)) {
            	agenda.remove(i);
            	System.out.println("Registro Eliminado exitosamente");
            }
}
		
	}
	
	public void buscarPorDni (String dni) {
		persona persona = null;
		for(int i = 0;i<agenda.size();i++){
            String Dni = agenda.get(i).getDni();
            if (dni.equals(dni)) {
            	persona = agenda.get(i);
            }
}
		if (persona == null) {
			System.out.println("No existe");
		}
		else {
			System.out.println(persona);
		}
		
	}
	
	
	
	
	
}
