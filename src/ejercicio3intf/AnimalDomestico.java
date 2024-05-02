package ejercicio3intf;

/**
 * Clase que define el comportamiento y caracteristicas de los animales domesticos
 */
public abstract class AnimalDomestico implements Animal{
	/**
	 * Nombre del animal
	 */
	protected String nombre;
	
	/**
	 * Raza del animal
	 */
	protected String raza;
	
	/**
	 * Peso en kilos del animal
	 */
	protected double peso;
	
	/**
	 * Color del animal
	 */
	protected String color;
	
	/**
	 * Devuelve el peso del animal
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Cambia el valor del atributo peso
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Devuelve el color del animal
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Cambia el color del animal
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Devuelve el nombre del animal
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve la raza del animal
	 * @return raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * Simula la vacunación de un animal doméstico
	 */
	public void vacunar() {
		System.out.println(nombre + " ha sido vacunado!");
	}
	
	/**
	 * Simula que un animal está comiendo
	 */
	@Override
	public void comer() {
		System.out.println("Ñam ñam ñam");		
	}

	/**
	 * Simula el sonido que hace un ser vivo al dormir
	 */
	@Override
	public void dormir() {
		System.out.println("Zzzzz");
	}

	/**
	 * Define el ruido que hace cada animal
	 */
	@Override
	abstract public void hacerRuido();

	/**
	 * Representa la probabilidad y la casuística de que el animal te haga caso
	 * @return true cuando el animal te hace caso y false en lo contrario
	 */
	abstract public boolean hacerCaso();
}
