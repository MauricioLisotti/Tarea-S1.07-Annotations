package n1ejercicio2;

public class Padre {
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Padre(String nombre) {
		this.nombre=nombre;		
	}
	
	public void saltar() {
		System.out.println("El padre esta saltando");
	}
	
	public void correr() {
		System.out.println("El padre esta corriendo");
	}
}
