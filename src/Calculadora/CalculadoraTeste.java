package Calculadora;

public class CalculadoraTeste {

	public boolean testeSoma(){
	int resultadoEsperado = 4;
	
	Calculadora calculadora = new Calculadora();
	
	int resultadoObtido = calculadora.soma(2,2);
	
	return resultadoEsperado == resultadoObtido;

	
	}
	
	public boolean testeSubtracao() {
		int resultadoEsperado = 0;
		
		Calculadora calculadora = new Calculadora();
		
		int resultadoObtido = calculadora.subtracao(2,2);
		return resultadoEsperado == resultadoObtido;
	}
	
	public boolean testeDivisao() {
		int resultadoEsperado = 1;
		Calculadora calculadora = new Calculadora();
		
		int resultadoObtido = calculadora.divisao(2,2);
		
		return resultadoEsperado == resultadoObtido;	
	}
	
	public boolean testeMultiplicacao() {
		int resultadoEsperado = 4;
		
		Calculadora calculadora = new Calculadora();
		
		int resultadoObtido = calculadora.multiplicacao(2,2);
		
		return resultadoEsperado == resultadoObtido;
	}
}	



