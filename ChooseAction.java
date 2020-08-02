package calculator;

import java.util.Scanner;
import java.lang.Float;

/*
Please note that the purpose of this was to implement strategy pattern.
This is not the most efficient way
to create a basic calculator!
 */

public class ChooseAction {
    private float num1;
    private float num2;
    private String operator;
    private StrategyInterface chosenOperator;

    public void takeInput(){
        System.out.println("Enter your first number:\n");
        Scanner argument1 = new Scanner(System.in);
        String stringNum1 = argument1.nextLine();
        num1 = Float.parseFloat(stringNum1);
        System.out.println("Enter Argument (Options: + - / *):\n");
        Scanner op = new Scanner(System.in);
        operator = op.nextLine();
        System.out.println("Enter your second number:\n");
        Scanner argument2 = new Scanner(System.in);
        String stringNum2 = argument2.nextLine();
        num2 = Float.parseFloat(stringNum2);

    }
    /*
    If case used instead of switch because it was easiest to take input
    as a string for the operator.
            */
    public float selectStrategy(){
        if (operator.contains("+")){
            chosenOperator = new Addition();
        }
        else if (operator.contains("-")){
            chosenOperator = new Subtraction();
        }
        else if(operator.contains("*")){
            chosenOperator = new Multiply();
        }
        else if(operator.contains("/")){
            chosenOperator = new Divide();
        }
        else{
            System.out.println("Operator not recognized");
        }
        return chosenOperator.calculate(num1, num2);
    }
}
