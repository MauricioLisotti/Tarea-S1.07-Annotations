package n1ejercicio2;

public class Hijo2 extends Padre{

	public Hijo2(String nombre) {
		super(nombre);
	}
	
	@Deprecated
	public void saltar() {
		System.out.println("El hijo2 esta saltando");
	}
	
	@Deprecated
	public void correr() {
		System.out.println("El hijo2 esta corriendo");
	}
}
