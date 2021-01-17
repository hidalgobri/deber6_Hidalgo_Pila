package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args)
    {
        System.out.println("***Calculator Execute***");

        Calculator c = new Calculator();
        System.out.println("c.adition(4,7)="+c.addition(4,7));
        System.out.println("c.substraction(7,1)="+c.subtraction(7,1));

        System.out.println("+++ESTO ES UN CAMBIO!+++");
    }
}
