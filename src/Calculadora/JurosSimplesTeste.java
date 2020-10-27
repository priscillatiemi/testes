package Calculadora;

public class JurosSimplesTeste {

	public boolean testeConstrutorSucesso() {
		try {
			new JurosSimples(4,0);
			return true;
		}catch(RuntimeException ex) {
			return false;
		}
	}
	
	public boolean testeConstrutorFalha() {
		try {
			new JurosSimples(-2,0);
			return false;
		}catch(RuntimeException ex) {
			return true;
		}
	}
	
	public boolean calcularMontanteFinalParaSucesso() {
		double resultadoEsperado = 200;
		JurosSimples jurosSimples = new JurosSimples(0.1, 100);
		try {
			double resultadoObtido = jurosSimples.calcularMontanteFinalPara(10);
		return resultadoEsperado == resultadoObtido;	
		}catch(RuntimeException ex) {
			return false;
		}
	}
	
	public boolean calcularMontanteFinalParaFalha() {
		JurosSimples jurosSimples = new JurosSimples(0.1, 100);
		
		try {
			jurosSimples.calcularMontanteFinalPara(-1);
			return false;
		}catch(RuntimeException ex) {
			return true;
		}
	}
}
