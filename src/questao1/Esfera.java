package questao1;
/*
 * Implemente uma classe para calcular o volume de uma esfera.
 *  Para isso, crie um método para receber o valor do raio da esfera (double)
 *  e chame o método calcularVolumeEsfera (private) para realizar o cálculo,
 *  baseando-se na fórmula abaixo: volume = (4.0/3.0) * PI * raio2. 
 *  Um método deve ser criado para mostrar o resultado do cálculo.
 *  Os atributos devem ser criados de acordo com a necessidade do problema. 
 *  Defina-os com o modificador private. Para este exercício, utilize o valor do PI da classe Math (static).
 *  Verifique a consistência dos valores para as variáveis de instância
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
	 * Complementando a questão 1, crie dois métodos construtores para a classe anterior,
	 *  o primeiro atribuindo valor 0 (zero) para suas variáveis de instância, e o segundo para 
	 *  instanciar as variáveis do objeto com valores consistentes e a partir daí realizar o cálculo.
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
