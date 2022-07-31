public class Calculator implements CalculatorInterface{
    private float res = 0;

    @Override
    public void Addition(int num1, int num2) {
        res = num1 + num2;
        System.out.println("The result of addition is " + res);
    }

    @Override
    public void Subtraction(int num1, int num2) {
        res = num1 - num2;
        System.out.println("The result of subtraction is " + res);
    }

    @Override
    public void Multiplication(int num1, int num2) {
        res = num1 * num2;
        System.out.println("The result of multiplication is " + res);
    }

    @Override
    public void Division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("You cannot division by 0");
        }
        else {
            res = (float)num1 / num2;
            System.out.println("The result of division is " + res);}
    }
}
