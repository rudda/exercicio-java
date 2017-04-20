package questao5;

public class PesoIdeal {

	private double altura;
	private char sexo;
	
	
	private double calcularPesoIdealMasculino(double altura){
		
		return (72.7*altura) -58;
	}
	private double calcularPesoIdealFeminino(double altura){
		
		return (62.1*altura) - 44.7;
		
	}
	public void calcularPesoIdeal(char sexo, double altura){
		double ideal =0;
		if(sexo == 'm' || sexo == 'M'){
			
			ideal = calcularPesoIdealMasculino(altura);
		}else if (sexo == 'f' || sexo == 'F'){
			
			ideal = calcularPesoIdealFeminino(altura);
		}
		
		mostrar(sexo, altura, ideal);
		
	}
	
	private void mostrar(char sexo2, double altura2, double ideal) {
		// TODO Auto-generated method stub
		String sexo = "";
		if(sexo2 == 'm' || sexo2 == 'M'){
			
			sexo = "Masculino";
		}else if (sexo2 == 'f' || sexo2 == 'F'){
			
			sexo = "Feminino";
		}
		
		System.out.println("Para uma pessoa com "+altura2+" de altura do sexo "+sexo+" o peso ideal eh "+ideal);
	}
	
	
	/*
	 * 
	 * Complementando a questão 5,
	 *  crie dois métodos construtores para a classe anterior,
	 *   o primeiro atribuindo valor 0 (zero) para suas variáveis de instância,
	 *    e o segundo para instanciar as variáveis do objeto com valores consistentes
	 *     e a partir daí realizar o cálculo.
	 * */
	
	
	public PesoIdeal (){
		
		this.altura = 0;
		
	}
	
	public PesoIdeal(double altura, char sexo){
		
		this.altura = altura;
		this.sexo = sexo;
		
		calcularPesoIdeal(this.sexo, this.altura);
		
		
	}
	
	
	//asdasdasdasdas
	//asdasd
	
	
}
