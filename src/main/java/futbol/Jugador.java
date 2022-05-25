package futbol;

public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;

	
	public Jugador(String nombre, int edad, String posicion, short g, byte d) {
		super(nombre, edad, posicion);
		golesMarcados=g;
		dorsal = d;
	}

	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}


	public int compareTo(Futbolista o) {
		return Math.abs(this.getEdad()-((Jugador)o).getEdad());
	}

	public boolean jugarConLasManos() {
		return false;
	}
	

	public String toString() {
		return super.toString()+" con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}

}
