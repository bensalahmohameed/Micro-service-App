package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import hello.Calculator;
import hello.Compte;

class TestCalculator {

	Calculator c;
	@BeforeEach
	void setUp() throws Exception {
		c = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		c=null;
	}

	@Test
	@DisplayName("Tester evaluate")
	void testEvaluate() {
		assertTrue(5 == c.evaluate("3+1+1"));
	}
	
	@Test
	@DisplayName("for demonstration purposes")
	void skippedTest() {
		assertTrue(5 == c.evaluate("3+1+1"));
	}
	@ParameterizedTest
	@ValueSource(strings = {"100+100" , "150+50"})
	void testevaluatewithparam(String ch) {
	int sum = c.evaluate(ch);
	assertEquals(200, sum);
	}
	@Test
	void GroupedTest () {
	 assertAll("operattions",
			() -> assertEquals(2, c.add(1,1)),
			() -> assertEquals(1, c.multiply(1, 1)),
			() -> assertEquals (0 , c.substract(1, 1)) ,
			() -> assertEquals(1, c.divide(1, 1))
			);
	}
	
	@Test 
	void DviseTest () {
		Exception exception =assertThrows(ArithmeticException.class,
				() -> {c.divide(2, 0); });
		assertEquals("division par 0", exception.getMessage());
	}
	
	@DisplayName ("Test add 10 fois")
	@RepeatedTest (value=10 , name="{displayName}" + "{currentRepetition}/{totalRepetitions}")
	void testrepeatedmultiply () {
	
	assertEquals(10, c.add(5, 5));

	} 

}
