package ejercicio3intf;

import ejercicio3intf.Gato;
import ejercicio3intf.Perro;

public class Main {
	public static void main(String[] args) {
		Gato gato = new Gato("Calcetines", "Siamés", 4.5f, "Negro");
		Perro perro = new Perro("Sobras", "Yorkshire", 7f, "Negro");
		
		gato.hacerRuido();
		for(int i = 0; i < 10; i++) {
			boolean haceCaso = gato.hacerCaso();
			if(haceCaso) {
				System.out.println("¡" + gato.getNombre() + " te ha hecho caso!");
				gato.hacerRuido();
			}else {
				System.out.println(gato.getNombre() + " no te ha hecho caso...");
			}
		}
		
		perro.hacerRuido();
		for(int i = 0; i < 10; i++) {
			boolean haceCaso = perro.hacerCaso();
			if(haceCaso) {
				System.out.println("¡" + perro.getNombre() + " te ha hecho caso!");
				perro.hacerRuido();
			}else {
				System.out.println(perro.getNombre() + " no te ha hecho caso...");
			}
		}
	}
}
