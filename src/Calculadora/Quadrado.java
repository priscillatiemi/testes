package Calculadora;

public class Quadrado {

	private int lado;
	
	public Quadrado(int lado) {
		if(lado<=0) {
			throw new RuntimeException("O lado nao pode ser nulo ou negativo");
		}
		this.lado = lado;
	}
	
	public int getLado() {
		return this.lado;
	}
	
	public int calcularPerimetro() {
		return 4*lado;
	}
	
	public int calcularArea() {
		return lado*lado;
	}
	
	
}
