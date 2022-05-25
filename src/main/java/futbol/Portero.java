package futbol;

public class Portero extends Futbolista {
	
	public short golesRecibidos;
	public byte dorsal;
	public final String posicion="Portero";

	public Portero(String nombre, int edad, String posicion, short g, byte d) {
		super(nombre, edad, "Portero");
		golesRecibidos=g;
		dorsal=d;
		
	}

	public Portero() {
		super();
		golesRecibidos=289;
		dorsal = 7;
	}

	@Override
	public int compareTo(Futbolista o) {
		return Math.abs(this.getEdad()-((Portero)o).getEdad());

	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+" con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
	}
}
