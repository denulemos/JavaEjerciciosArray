package cinco;
import java.util.*;
public class auto {
	public static Scanner input;
	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	private ArrayList <auto> autos = new ArrayList <auto>();
	
	public void AgregarAutos (String matricula, String marca, String modelo, int km) {
		String opcion = "a";
		do {
			
		auto auto1 = new auto (matricula, marca, modelo, km);
		autos.add(auto1);
		System.out.println("Desea seguir ingresando? F para no");
		opcion = input.next();
		
		}while (!opcion.equals("f"));
		
	}
	
	public void devolvermarca (String marca) {
		auto auto;
		for(int i = 0;i<autos.size();i++){
            auto = autos.get(i);
            if (marca.equals(auto.getMarca())) {
            	System.out.println(auto);
            }
            
            
}
	}
	
	public void devolverkm (int kmmax) {
		auto auto;
		for(int i = 0;i<autos.size();i++){
            auto = autos.get(i);
            if (kmmax > auto.getKm()) {
            	System.out.println(auto);
            }
            
            
}
	}
	
	
	
	public void devolverkmmax () {
		int max = 0;
		auto auto;
		
		int kmmax = 0;
		for(int i = 0;i<autos.size();i++){
			
            auto = autos.get(i);
            
            if (auto.getKm() > kmmax) {
            	max = i;
            }
            
           
                
}
		
		System.out.println(autos.get(max));
	}
	
	public auto(ArrayList<auto> autos) {
		super();
		this.autos = new ArrayList<auto>();
	}
	
	
	public ArrayList<auto> getAutos() {
		return autos;
	}


	public void setAutos(ArrayList<auto> autos) {
		this.autos = autos;
	}


	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public auto(String matricula, String marca, String modelo, int km) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}
	public auto() {
		super();
	}
	@Override
	public String toString() {
		return "auto [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km + ", autos="
				+ autos + "]";
	}
	
	
}
