package service;

public class Calculadora {

	public void somar(int x, int y) {

		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public void subtrair(int x, int y) {

		System.out.println(x + " - " + y + " = " + (x - y));
	}
	
	public void multiplicar(int x, int y) {

		System.out.println(x + " * " + y + " = " + (x * y));
	}
	
	public void dividir(int x, int y) {

		System.out.println(x + " / " + y + " = " + (x / y));
	}
	
	public void calcularRaizQuadrada(int x) {

		System.out.println("sqrt " + x + " = " + Math.sqrt(x));
	}
	
	public void calcularPotencia(int x, int y) {

		System.out.println(x + " ^ " + y + " = " + Math.pow(x, y));
	}
	
	public void calcularInveso(double x) {
		
		System.out.println("1 / " + x + " = " + (1 / x));
	}
}
