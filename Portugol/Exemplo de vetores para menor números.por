programa
{
	
	funcao inicio()
	{


	inteiro num[5], menor 

     para(inteiro i = 0; i < 5; i++){

          escreva("\nDigite o ", i+1, "º numero: ")
          leia(num[i])   	
     }

     menor = num[0]

	para(inteiro i = 0; i < 5; i++){

          se(num[i] < menor){

          	menor = num[i]
          }
		
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 8, 9, 3}-{menor, 8, 17, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */