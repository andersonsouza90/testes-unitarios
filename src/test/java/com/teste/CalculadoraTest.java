package com.teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import org.junit.Test;
import com.teste.*;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		
		//assert indica se o resultado coincide  com o resultado esperado do teste
		//Usado para tipos primitivos, Objetos e arrays (int String e Array)
		//ordens dos parâmetros assertEquals(valorEsperado, valorAtual); 
		assertEquals(5, soma); 
	}
	
	
	//Mocks - simulam comportamento de objetos reais de maneira controlada

	//Frameworks para Mocks
	//Mockito
	//EasyMock
	//PowerMockito	
	@Test
	public void testeSomarComMock() {
		Calculadora calc = mock(Calculadora.class);
		
		when(calc.somar("1+2")).thenReturn(10);
		
		int resultado = calc.somar("1+2");
		assertEquals(10, resultado);
		
	}
	
	//Framework Hamcrest usado para fazer teste de unidade
	//trabalha com o JUnit

	//utiliza assertThat com os matchers adequados

	//Framework AssertJ
	//escreve asserts de fácil compreensão
	
	// TDD não é um framework, é uma metodologia

}
