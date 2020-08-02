package calculator;

public class Main {

    public static void main(String[] args) {
	calculator.ChooseAction x = new ChooseAction();
	x.takeInput();
	System.out.println(x.selectStrategy());
    }
}
