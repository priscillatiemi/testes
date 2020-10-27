package Calculadora;

public class TesteAutomatizado {

	public static void main(String[] args) {

		CalculadoraTeste calcTeste = new CalculadoraTeste();
		QuadradoTeste quadTeste = new QuadradoTeste();
		JurosSimplesTeste jurosTeste = new JurosSimplesTeste();
		
		System.out.println("calcTeste.testeSoma(): " + calcTeste.testeSoma());
		System.out.println("calcTeste.testeSubtracao(): " + calcTeste.testeSubtracao());
		System.out.println("calcTeste.testeDivisao(): " + calcTeste.testeDivisao());
		System.out.println("calcTeste.TesteMultiplicacao(): " + calcTeste.testeMultiplicacao());
		System.out.println("quadTeste.testaConstrutorSucesso(): "+ quadTeste.testeConstrutorSucesso());
		System.out.println("quadTeste.testaConstrutorFalha(): "+ quadTeste.testeConstrutorFalha());
		System.out.println("quadTeste.testaTestePerimetro(): "+ quadTeste.testePerimetro());
		System.out.println("quadTeste.testaTesteCalcularArea(): "+ quadTeste.testeCalcularArea());
		System.out.println("jurosTeste.testaTesteConstrutorSucesso(): "+ jurosTeste.testeConstrutorSucesso());
		System.out.println("jurosTeste.testaTesteConstrutorFalha(): "+ jurosTeste.testeConstrutorFalha());
		System.out.println("jurosTeste.testaCalcularMontanteFinalParaSucesso(): "+jurosTeste.calcularMontanteFinalParaSucesso());
		System.out.println("jurosTeste.testaCalcularMontanteFinalParaFalha(): "+ jurosTeste.calcularMontanteFinalParaFalha());
		
	}

}
