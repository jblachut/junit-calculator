

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodawania() throws Exception {
		System.out.println("Metoda testowa");
		double a=1.0;
		double b=3.5;
		//oczekowany wynik
		double expekted= 4.5;
		//to co faktycznie zwraca funkcja z kalsy sum z kalkulatora
		double actual =classUnderTest.sum(a,b);

        Assert.assertEquals(expekted,actual, 0.001);

	}
    @Test
    public void testDzielenia() throws Exception {
        System.out.println("Metoda testowa dzielenia");
        double a=10.0;
        double b=5;
        //oczekowany wynik
        double expekted= 2;
        //to co faktycznie zwraca funkcja z kalsy sum z kalkulatora
        double actual =classUnderTest.divide(a,b);

        Assert.assertEquals(expekted,actual, 0.001);
        Assert.assertTrue(b != 0.00);

    }
    @Test (expected = IllegalArgumentException.class)
    public void testDzieleniaZero() throws Exception {
        System.out.println("Metoda testowa dzielenia przez 0");
        double a = 6;
        double b = 0;
        //oczekowany wynik
        classUnderTest.divide(a, b);

    }
    @Test
    public void testMnozenia() throws Exception {
        System.out.println("Metoda testowa");
        double a=2.0;
        double b=5.0;
        //oczekowany wynik
        double expekted= 10.0;
        //to co faktycznie zwraca funkcja z kalsy sum z kalkulatora
        double actual =classUnderTest.multiply(a,b);

        Assert.assertEquals(expekted,actual, 0.001);

    }

}
