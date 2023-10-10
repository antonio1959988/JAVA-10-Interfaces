//Vamos a usar clases abstractas para evitar la instanciación de objetos que no necesito (generalmente son objetos muy abstractos, como Persona, Transporte, Animal, Comida, Arte, Operaciones matematicas, lectura, Ropa, Plantas,Paises,etc.)

package Figura;

//Utilizando clases abstractas evitamos las instancias no necesarias

//Para que una clase se vuelva abstracta usamos la palabra abstract antes de class
public abstract class Figura {
	
	//Declaramos un metodo abstracto (no tiene cuerpo)
	//Metodo abstracto que nos dice QUE TENEMOS QUE HACER, pero NO NOS DICE EL COMO
	public abstract double calcularArea();
	
	
	
	
	
} //clase figura


/*
 * Nota, las clases abstractas pierden la capacidad de instanciar
 * Una clase abstracta si o si necesita metodos abstractos
 * Cuando usamos clases abstractas, estamos "obligados" a utilizar todos los metodos abstractos
 */