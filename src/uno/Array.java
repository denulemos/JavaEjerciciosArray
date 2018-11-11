package uno;
import java.util.*;
public class Array {
public static Scanner input;

	ArrayList<Integer> numeros = new ArrayList<Integer>();
	private int promedio;
	private int pares;
	private int contador;

	
	public Array() {
		super();
	}

	public Array(ArrayList<Integer> numeros, int promedio, int pares, int contador) {
		super();
		this.numeros = new ArrayList();
		this.promedio = promedio;
		this.pares = pares;
		this.contador = contador;
	}

	public void agregarnumeros() {
		int numero = 0;
		contador = 0;
		do {
			System.out.println("Ingrese un numero");
			numero = input.nextInt();
			numeros.add(numero);
			contador++;
		}while (contador<10);
	}
	
	public int promedio () {
		promedio = 0;
		for(int i = 0;i<numeros.size();i++){
            promedio += numeros.get(i);
            
}
		promedio = promedio / numeros.size();
		return promedio;
	}
	
	public int prompares() {
		pares = 0;
		for(int i = 0;i<numeros.size();i++){
			if (i%2 == 0) {
				 pares += numeros.get(i);
			}
			
            
         }
		pares = pares / numeros.size();
		return pares;
	}
	
}
