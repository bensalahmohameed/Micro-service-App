package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.Hello;

class TestHello {
	Hello h ;
	@BeforeAll
	//objet mech nest7a9o fil les test ilkol willa connexion base de donnée
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hello all tests");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Bye all tests");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Hello each tests");
		h=new Hello() ;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Bye each tests");
		h=null;
	}

	@Test
	void testGetMessage() {
		System.out.println("Test is executed");
		assertEquals("Hello Junit 5 from Enis", h.getMessage(" from Enis"));
		
	}

}
