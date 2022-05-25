package futbol;

public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;

	
	public Jugador(String nombre, int edad, String posicion) {
		super(nombre, edad, posicion);
	}

	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}

	@Override
	public int compareTo(Futbolista o) {
		return Math.abs(this.getEdad()-o.getEdad());
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString()+" con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}

}
