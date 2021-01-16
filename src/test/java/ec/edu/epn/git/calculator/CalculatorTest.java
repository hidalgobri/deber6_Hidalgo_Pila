package ec.edu.epn.git.calculator;

import junit.framework.TestCase;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator c;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }


    @Before
    public void setUp() {
        System.out.println("setUp()");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_addition_then_ok(){
        System.out.println("Test 1");
        assertEquals(6, c.addition(3,3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(2, c.subtraction(6, 4));
    }

    @Test (expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        System.out.println("Test 3");
        assertEquals(3, c.division(3, 0));
    }

    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_timeout_50(){
        System.out.println("Test 4");
        assertEquals(6, c.multiplication(2,3));
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAns(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }
}