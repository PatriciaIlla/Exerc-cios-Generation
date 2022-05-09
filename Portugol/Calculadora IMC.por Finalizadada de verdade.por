programa
{
	
	funcao inicio()
	{
	//Operadores aritméticos
	/*
	 * 
	 * Adição +
	 * Subtração -
	 * Divisão /
	 * Multiplicação
	 * Módulo % - Retorna o resto da divisão com dois números inteiros 
	 *
	 */

	 //Exemplo utilizando os Operados Aritméticos
	 /*
      real num1, num2, resultado
	

	  */
		real peso, altura, imc

		escreva("Digite o peso: ")
		leia(peso)

		escreva("Digite a altura: ")
		leia(altura)

		imc = peso / (altura*altura)
		escreva(imc)

		se(imc<=18.4) {escreva("Desnutrição")}
		
		senao se(imc<=24.9) {escreva("\n\n Peso normal")}
		
		senao se(imc<=29.9) {escreva("\n\n Sobrepeso")}
		
		senao se(imc<=39.9) {escreva("\n\n obesidade I")}

		senao se(imc<=40) {escreva("\n\n obsedidade II")}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 709; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */