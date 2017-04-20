package questao3;

import java.util.Random;
/*
 Crie uma classe chamada Aleat�rio.
  Nessa classe, crie um m�todo chamado gerarNumeroAleatorio() 
  para sortear uma determinada quantidade de n�meros de acordo com um argumento,
   al�m da faixa que esses n�meros devem ser sorteados.
    Para isso, o usu�rio deve informar a quantidade de n�meros a ser gerada e a faixa de n�meros v�lidos para o sorteio,
     por exemplo: se o usu�rio informar os argumentos 4 e 100 
     (gerarNumeroAleatorio(4,100)), 
     devem ser gerados quatro n�meros aleat�rios entre 1 e 100. 
     Um m�todo deve ser criado para imprimir os n�meros gerados,
      incluindo as informa��es de quantidade e faixa dos n�meros sorteados.
       Os atributos devem ser criados de acordo com a necessidade do problema.
        Defina-os com o modificador private.
         Verifique a consist�ncia dos valores para as vari�veis de inst�ncia.
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
