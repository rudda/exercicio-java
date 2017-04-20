package questao3;

import java.util.Random;
/*
 Crie uma classe chamada Aleatório.
  Nessa classe, crie um método chamado gerarNumeroAleatorio() 
  para sortear uma determinada quantidade de números de acordo com um argumento,
   além da faixa que esses números devem ser sorteados.
    Para isso, o usuário deve informar a quantidade de números a ser gerada e a faixa de números válidos para o sorteio,
     por exemplo: se o usuário informar os argumentos 4 e 100 
     (gerarNumeroAleatorio(4,100)), 
     devem ser gerados quatro números aleatórios entre 1 e 100. 
     Um método deve ser criado para imprimir os números gerados,
      incluindo as informações de quantidade e faixa dos números sorteados.
       Os atributos devem ser criados de acordo com a necessidade do problema.
        Defina-os com o modificador private.
         Verifique a consistência dos valores para as variáveis de instância.
 * */

public class Aleatorio {

	public void gerarNumeroAleatorio(int numeros, int faixa){
	
		for(int i=0; i<numeros; i++){
			
			Random randon = new Random();
			int numero = randon.nextInt(faixa);
			imprimir(numero);
			
		}
		
	}

	private void imprimir(int numero) {
		
		System.out.println("aleaorio "+numero);
		
	}
	
	
}
