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
}
