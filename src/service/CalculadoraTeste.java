package service;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		calc.somar(10, 5);
		calc.subtrair(10, 5);
		calc.multiplicar(10, 5);
		calc.dividir(10, 5);
		calc.calcularRaizQuadrada(9);
		calc.calcularPotencia(5, 3);
	}
}
