programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
	
		real idade, categoria

		escreva("Digite a idade: ")
		leia(idade)


		categoria = idade
		escreva(categoria)

		se(categoria<=4) {escreva("\n\n Não tem idade suficiente")}

		senao se(categoria<=7) {escreva("\n\n Infantil A")}
		
		senao se(categoria<=11) {escreva("\n\n Infantil B")}
		
		senao se(categoria<=13) {escreva("\n\n Juvenil A")}
		
		senao se(categoria<=17) {escreva("\n\n Juvenil B")}

		senao
		{escreva("\n\n Adulto \n\n")}

		escreva("\n\n")
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */