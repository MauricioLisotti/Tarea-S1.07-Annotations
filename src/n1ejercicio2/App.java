package n1ejercicio2;

/*
 * Ejercicio 2. A�ade a las clases hijos algunos m�todos deprecados, 
 * y utilice la anotacion correspondiente. Invoque desde una clase 
 * externa los m�todos deprecados, suprimiendo mediante la anotaci�n 
 * correspondiente los warnings para ser deprecada su utilizaci�n.
 */
public class App {
public static void main(String[]args) {
		
		Hijo1 hijo1 = new Hijo1("hijo1");
		Hijo2 hijo2 = new Hijo2("hijo2");
		
		hijo1.correr();
		hijo1.saltar();
		hijo2.correr();
		hijo2.saltar();
		
	}
}
