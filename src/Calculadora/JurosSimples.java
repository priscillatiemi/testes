package Calculadora;

public class JurosSimples {

	private double juros;
	private int montanteInicial;
	
	public JurosSimples(double juros, int montanteInicial){
		
		if(juros < 0 | montanteInicial < 0) {
			throw new RuntimeException("valor invalido");
		}
		this.juros = juros;
		this.montanteInicial = montanteInicial;
	
	}
	
	public double calcularMontanteFinalPara(int quantidadeMes) {
		if(quantidadeMes < 0) {
			throw new RuntimeException("valor invalido");
		}
		return this.montanteInicial + this.montanteInicial*juros*quantidadeMes;
	}
}
