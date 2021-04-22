
import org.junit.Test;


import static org.junit.Assert.*;

public class CustomCalculatorTest
{
    private CustomCalculator customCalcuator;
    //더하기
    @Test
    public void addTest()
    {
        customCalcuator = new CustomCalculator();
        int result = customCalcuator.add(10,10);
        assertTrue(result==20);

    }




    @Test
    public void add()
    {

    }

    @Test
    public void subtract()
    {
        customCalcuator = new CustomCalculator();
        int result = customCalcuator.subtract(20,5);
        assertTrue(result==15);


    }

    @Test
    public void multiply()
    {
        customCalcuator = new CustomCalculator();
        int result = customCalcuator.multiply(20,5);
        assertFalse(result==15);
    }

    //
    // @Test(expected =)
    @Test
    public void divide()
    {
        customCalcuator = new CustomCalculator();
        int result = customCalcuator.divide(22,1);
        assertTrue(result==22);
    }



}