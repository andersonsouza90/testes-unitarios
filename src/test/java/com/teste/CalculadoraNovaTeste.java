package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTeste {
	
	
	/*
	 * TDD - Uma metodologia de desenvolvimento de software.
		ciclo de 5 passos
		
		Add test
		Falhe
		codificar
		Processar Test
		Refatorar c�digo
		
		Testes antes de codificar, para obter c�digo mais limpos
		um m�todo que faz muitas coisas � dificil de ser testado
		
		JUnit 5
		
		Estilos diferentes de testes
		
		maven - org.junit.jupiter
		
		Na IDE intellij o junit 5 � padr�o
		
		Assumption -> Usado para testes apenas se determinadas condi��es forem atendidas.
	 * */
	
	@Test
	public void deveSomarDoisValores() {
		int a = 1;
		int b = 2;
		//int soma = 0;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(a, b);
		
		
		assertEquals(3, soma);
	}
	
	@Test
	public void deveSomarTresValores() {
		int a = 1;
		int b = 2;
		int c = 3;
		//int soma = 0;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(a, b, c);
		
		
		assertEquals(6, soma);
	}
	
}
