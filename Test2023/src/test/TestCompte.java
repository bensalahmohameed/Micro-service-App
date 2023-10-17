package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.Compte;

class TestCompte {
    Compte c; 
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Compte(1111,1000);

	}

	@AfterEach
	void tearDown() throws Exception {
		c=null;
	}

	

	@Test
	void testSolde() {
		assertTrue(c.solde()==1000);
	}

	

	@Test
	void testDeposer() {
		c.deposer(1000);
		assertEquals(2000, c.solde());
	}

	@Test
	void testRetirer() {
		c.retirer(500);
		assertTrue(500 == c.solde());
	}

}
