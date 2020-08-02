package calculator;

public class Subtraction implements StrategyInterface{

    @java.lang.Override
    public float calculate(float num1, float num2) {
        return num1-num2;
    }
}
