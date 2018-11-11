import seis.agenda;
public class seistest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    agenda agenda = new agenda();
agenda.agregarPersona("Denu", "Lemos", "41172770", "12345678", "mailfalso");
agenda.buscarPorDni("41172770");
agenda.eliminarPersona("41172770");
agenda.buscarPorDni("41172770");
	}

}
