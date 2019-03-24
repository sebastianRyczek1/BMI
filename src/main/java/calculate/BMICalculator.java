package calculate;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BMICalculator implements Calculator {
    private int weight;
    private  int height;

    public BMICalculator(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String calculate() {
        Double BMI =weight/Math.pow(height/100,2);
        return String.valueOf(BMI);
    }

    @Override
    public String interpret() {
        String valueFromCalculate=calculate();
        Double value = Double.parseDouble(valueFromCalculate);
        Map<Double,String> map = new TreeMap<>();
        map.put(0.0,"Underweight");
        map.put(18.5,"Normal Range");
        map.put(23.0,"Overweight-at risk");
        map.put(25.0,"Overweight-Moderately obese");
        map.put(30.0,"Overweight-Severely Obese");
        value=((TreeMap<Double, String>) map).floorKey(value);
        return map.get(value);
    }
}
