//En esta clase vamos a heredar el atributo de la clase abstracta figura, y lo vamos a sobreescribir
package Figura;

//Aplicamos herencia
public class Rectangulo extends Figura{
	
	//Parametros
	double base;
	double altura;
	
	//Constructor
	Rectangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	} // constructor
	
	//Metodos
	@Override
	public double calcularArea() {
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	}
	

}
