package test;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({ TestHello.class , TestCompte.class} )
public class TestSuiteExample {

}
