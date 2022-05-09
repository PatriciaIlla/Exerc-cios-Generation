programa
{
	
	funcao inicio()
	{
		inteiro P
		inteiro M
		inteiro E
		inteiro L = 50
		
		escreva("Informe o peso do tomate: ")
		leia(P)
		
		se (P > L)
		{
			E = P - L
			M = E * 4
			escreva("Sua multa a pagar é de R$ ", M)
		} senao {
			escreva("Peso:", P)
			escreva(" \n")
			escreva("Excesso: 0 \n")
			escreva("Multa: 0\n")
			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */