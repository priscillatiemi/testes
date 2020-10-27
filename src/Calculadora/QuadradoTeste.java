package Calculadora;

public class QuadradoTeste {

	public boolean testeConstrutorSucesso() {
		try {
			new Quadrado(1);
			return true;
		}catch(RuntimeException ex) {
			return false;
		}
	}
		
	public boolean testeConstrutorFalha() {
			try {
				new Quadrado(0);
				return false;
			}catch(RuntimeException ex) {
				return true;
			}
		}
	
	public boolean testePerimetro() {
		int resultadoEsperado = 16;
		
		Quadrado quad = new Quadrado(4);
	
		int resultadoObtido = quad.calcularPerimetro();
		
		return resultadoEsperado == resultadoObtido;
	}
	
	public boolean testeCalcularArea() {
		int resultadoEsperado = 16;
		
		Quadrado quad = new Quadrado(4);
	
		int resultadoObtido = quad.calcularArea();
		
		return resultadoEsperado == resultadoObtido;
	}
}
