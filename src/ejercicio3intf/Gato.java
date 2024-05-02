package ejercicio3intf;

/**
 * Simula el comportamiento y características de un Gato
 */
public class Gato extends AnimalDomestico{

	/**
	 * Constructor vacio
	 */
	public Gato() {}
	
	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param raza
	 * @param peso
	 * @param color
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		if(nombre != null && !"".equals(nombre)) {
			super.nombre = nombre;
		}
		if(raza != null && !"".equals(raza)) {
			super.raza = raza;
		}
		if(peso > 0) {
			super.peso = peso;
		}
		if(color != null && !"".equals(color.trim())) {
			super.color = color;
		}
	}

	
	/**
	 * Emite un maullido
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Miau");
		
	}

	/**
	 * Simula cuando un Gato te hace caso
	 * @return true si te ha hecho caso si no, devuelve falso
	 */
	@Override
	public boolean hacerCaso() {
		int caso = (int) (Math.random() * 20 + 1);
		boolean res = false;
		
		if(caso == 1) {
			res = true;
		}
		
		return res;
	}
	
	public void toserBolaPelo() {
		int diametro = (int) Math.random() * 5;
		System.out.println(super.getNombre() + " acaba de toser una bola de pelo de " + diametro + "cm de diametro.");
	}
}
