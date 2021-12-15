package n1ejercicio1;

public class Hijo1 extends Padre{

	public Hijo1(String nombre) {
		super(nombre);
	}
	
	@Override
	public void saltar() {
		System.out.println("El hijo1 esta saltando");
	}
	
	@Override
	public void correr() {
		System.out.println("El hijo1 esta corriendo");
	}

}
