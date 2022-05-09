programa
{
	
	funcao inicio()
	{
	/*
	 * Vetores (ou arrays) - São variáveis que armazenam múltiplos valores de tipo definido
	 * 
	 * Estrutura
	 * 
	 * tipo identificador[tamanho]
	 * inteiro vetor[10]
	 * 
	 * inteiro vetor[] = {1, 3, 4, 5}
	 * 
	 * Quando um vetor é declarado o su tamanho não pode ser alterado, porém os valores internos podem ser alterados
	 * 
	 */

    //Cada posição referente ao meu vetor é chamado de index
     /*
	  inteiro vetor[10]

	  inteiro vetor2[] = {5, 3, 4}
	  */

       //Exemplo de forma que funciona, mas que é HORRÍVEL
	   /*
	   inteiro num [3]

	   num[0] = 5
	   num[1] = 8
	   num[2] = 6

	   escreva(num[1])

          */

      //Exemplo utilizado a maneira correta de iterar os valores do vetor

      cadeia nomes[5]

      para(inteiro i = 0; i < 5; i++){

      	escreva("Digite o nome na posição ", i, ": ")
      	leia(nomes[i])
      	
      }

      para(inteiro i = 0; i < 5; i++){

      	escreva("\n", nomes[i])

      	
      }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 981; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nomes, 41, 13, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */