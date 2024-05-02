package ejercicio3intf;

/**
 * Simula los comportamientos y características de un perro
 */
public class Perro extends AnimalDomestico {
	/**
	 * Constructor vacío
	 */
	public Perro () {}
	
	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param raza
	 * @param peso
	 * @param color
	 */
	public Perro(String nombre, String raza, double peso, String color) {
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
	 * Simula un perro ladrando
	 */
	@Override
	public void hacerRuido() {
		System.out.println("WOOF");
	}

	/**
	 * Simula cuando un Perro te hace caso
	 * @return true si te ha hecho caso si no, devuelve falso
	 */
	@Override
	public boolean hacerCaso() {
		int caso = (int) (Math.random() * 10 + 1);
		boolean haceCaso = true;
		
		if(caso == 1) {
			haceCaso = false;
		}
		
		return haceCaso;
	}
	
	/**
	 * Muestra un indicador de que el perro ha salido a pasear
	 */
	public void sacarPaseo() {
		System.out.println(super.getNombre() + " ha salido de paseo.");
	}
	
}
