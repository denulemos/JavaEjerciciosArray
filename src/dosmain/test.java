package dosmain;
import dos.cancion;
import dos.cd;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       cd cd = new cd();
       
       cd.agregarCancionFinal("ricky", "pepe");
     
       
       System.out.println(cd.dameCancion(0));
       
       
       
	}

}
