package com.teste;

import java.util.ArrayList;

import org.junit.Test;

public class ExceptionTest {
	
	//teste que é esperado uma exceptin
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		new ArrayList<Object>().get(0);
	}
	
}
