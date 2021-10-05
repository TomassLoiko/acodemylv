import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {



   public Calculator calculator = new Calculator("Casio");

    @Test
    public void  addTest() {
        assertEquals("Sum of two numbers are not correct", 30.0, calculator.add(20.0, 10.0), 0);
    }

    @Test
    public void  subtractTest() {
        assertEquals("Subtraction of two numbers are not correct", 12.60, calculator.subtract(30.00, 17.40), 0);
    }

    @Test
    public void  multiplyTest() {
        assertEquals("Multiplication of two numbers are not correct", 13.02, calculator.multiply(4.2, 3.1), 0);
    }

    @Test
    public void  divideTest() {
        assertEquals("Division of two numbers are not correct",4.73, calculator.divide(10.4, 2.2), 0);
    }

}
//import calculator.Calculator;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class CalculatorTest {
//
//    public Calculator calculator = new Calculator("Casio");
//
//    @Test
//    public void addTest() {
//        assertEquals("Sum of two numbers are not correct", 30.0, calculator.add(20, 10), 0);
//    }
//
//    @Test
//    public void subtractTest() {
//        assertEquals("Subtract of two numbers are not correct", 12.6, calculator.subtract(20.0, 7.4), 0);
//    }
//
//    @Test
//    public void multiplyTest() {
//        assertEquals("Multiplication of two numbers are not correct", 13.02, calculator.multiply(4.2, 3.1), 0);
//    }
//
//    @Test
//    public void divideTest() {
//        assertEquals("Division of two numbers are not correct", 4.73, calculator.divide(10.4, 2.2), 0);
//    }
//}