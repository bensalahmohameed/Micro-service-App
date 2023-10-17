package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import hello.LeapYear;

class TestLeapYear {
	LeapYear l ;
	@BeforeEach
	void setUp() throws Exception {
		l= new LeapYear();
	}

	@AfterEach
	void tearDown() throws Exception {
		l=null;
	}

	@ParameterizedTest
	@CsvSource({"2000,true","2004,true", "2500,false", "1900,false","2015,false"})
	void testIsLeapyear(int y , boolean r) {
		assertEquals(r, l.isLeapyear(y));
	}

}
