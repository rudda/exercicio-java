package questao1;
/*
 * Implemente uma classe para calcular o volume de uma esfera.
 *  Para isso, crie um m�todo para receber o valor do raio da esfera (double)
 *  e chame o m�todo calcularVolumeEsfera (private) para realizar o c�lculo,
 *  baseando-se na f�rmula abaixo: volume = (4.0/3.0) * PI * raio2. 
 *  Um m�todo deve ser criado para mostrar o resultado do c�lculo.
 *  Os atributos devem ser criados de acordo com a necessidade do problema. 
 *  Defina-os com o modificador private. Para este exerc�cio, utilize o valor do PI da classe Math (static).
 *  Verifique a consist�ncia dos valores para as vari�veis de inst�ncia
 *  */

public class Esfera {

	private double volume;
	private double raio;
	
	private void calculaVolumeEsfera(double raio){
		
		this.volume  = (4.0/3.0)* Math.PI * Math.pow(raio, 2);
		
	}
	
	private void mostrarVolume(){
		
		System.out.println("Volume da Esfera "+this.volume);
	}

	
	/*
	 * Complementando a quest�o 1, crie dois m�todos construtores para a classe anterior,
	 *  o primeiro atribuindo valor 0 (zero) para suas vari�veis de inst�ncia, e o segundo para 
	 *  instanciar as vari�veis do objeto com valores consistentes e a partir da� realizar o c�lculo.
	 *  
	 * */
	
	public Esfera (){
		this.volume = 0;
	}
	
	public Esfera(double raio){
		
		this.raio = raio;
		calculaVolumeEsfera(raio);
	
	}
	
	
}
