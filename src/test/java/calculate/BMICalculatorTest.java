package calculate;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class BMICalculatorTest {

    @Test
    @Parameters({"100,100,100.0","50,180,50.0","50,200,12.5"})
    public void shouldReturnBMI(int w,int h,String result){
        BMICalculator BMIcal= new BMICalculator(w,h);
        assertEquals(result,BMIcal.calculate());
    }

    @Test
    @Parameters({"100,100,Overweight-Severely Obese","50,180,Overweight-Severely Obese","50,200,Underweight","80,200,Normal Range","95,200,Overweight-at risk","110,200,Overweight-Moderately obese"})
    public void shouldReturnBMIInterpret(int w,int h,String result){
        BMICalculator BMIcal= new BMICalculator(w,h);
        assertEquals(result,BMIcal.interpret());
    }




}