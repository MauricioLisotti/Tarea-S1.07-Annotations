package n1ejercicio2;

public class Hijo1 extends Padre{

	public Hijo1(String nombre) {
		super(nombre);
	}
	
	@Deprecated
	public void saltar() {
		System.out.println("El hijo1 esta saltando");
	}
	
	@Deprecated
	public void correr() {
		System.out.println("El hijo1 esta corriendo");
	}

}
