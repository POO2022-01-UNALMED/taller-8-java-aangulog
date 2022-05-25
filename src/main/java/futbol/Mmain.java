package futbol;

public class Mmain {

	public static void main(String[] args) {
	
		
		Jugador f = new Jugador("Valeria", 21, "defensa", (short) 4, (byte) 8);
		boolean ok = false;
		if (f.getEdad() == 21 && f.getNombre().equals("Valeria") 
				&& f.getPosicion().equals("defensa") && f.golesMarcados == 4 
				&& f.dorsal == 8) {
			ok = true;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(ok);
	}

}
