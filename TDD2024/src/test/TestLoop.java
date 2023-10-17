package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Loop;
import main.Orientation;

class TestLoop {
	Loop lp ;
	@BeforeEach
	void setUp() throws Exception {
		lp= new Loop();
	}

	@AfterEach
	void tearDown() throws Exception {
		lp= null;
	}

	@Test
	void test() {
		assertEquals(Orientation.Nord, lp.getPosition());
	}
	
	@Test
	void testPositionTournerUneFois() {
		lp.tourner();
		assertEquals(Orientation.Est,lp.getPosition() );
	}
	

}
