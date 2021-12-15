package n1ejercicio2;

/*
 * Ejercicio 2. Añade a las clases hijos algunos métodos deprecados, 
 * y utilice la anotacion correspondiente. Invoque desde una clase 
 * externa los métodos deprecados, suprimiendo mediante la anotación 
 * correspondiente los warnings para ser deprecada su utilización.
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
