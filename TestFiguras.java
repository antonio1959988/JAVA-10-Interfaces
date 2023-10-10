package Figura;

public class TestFiguras {
	
	public static void main(String[] args) {
		
		//Generar las instancias de nuestras clases
		
		//1. Instancia de la clase figura
		//Figura generica = new Figura(); // Error porque es clase abstracta
		
		//2. Instancia de la clase rectangulo
		Figura rectangulo = new Rectangulo(5.0, 6.5); //base y altura
		
		//3. Instancia de un circulo
		Figura circulo = new Circulo(3.14,3.0); // pi y radio
		
		// Invocacion del metodo
		System.out.println(rectangulo.calcularArea());
		System.out.println(circulo.calcularArea());
		
		
	} //metodo main
} //clase testFiguras
