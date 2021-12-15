package n1ejercicio1;

public class Hijo2 extends Padre{

	public Hijo2(String nombre) {
		super(nombre);
	}
	
	@Override
	public void saltar() {
		System.out.println("El hijo2 esta saltando");
	}
	
	@Override
	public void correr() {
		System.out.println("El hijo2 esta corriendo");
	}
}
