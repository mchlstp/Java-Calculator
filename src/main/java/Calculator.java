import java.util.Scanner;

public class Calculator
{
    private static final Scanner myScan = new Scanner(System.in);
    public static double result;
    public static double numOne;
    public static double numTwo; //makes variables for the whole class

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {



        System.out.println("Calculator");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        int pick = myScan.nextInt();

        if(pick == 1) {
            addMe();
        }
        else if(pick == 2) {
            subMe();
        }
        else if(pick == 3) {
            timesMe();
        }
        else if(pick == 4) {
            divideMe();
        }
        else {
            System.out.println("Please pick ONLY 1-4");
            calculator();
        }
        myScan.close();
    }

    private static double getNumbers() {
        System.out.println("Enter your first number:");
        numOne = myScan.nextDouble();
        System.out.println("Enter your second number:");
        numTwo = myScan.nextDouble();
        return numOne;
    }

    public static void subMe() {
        System.out.println("I subtract things!");
        getNumbers();
        result = numOne - numTwo;
        System.out.println("This is the result:  " + result);
        calculator();
    }

    public static void addMe() {
        System.out.println("I add things!");
        getNumbers();
        result = numOne + numTwo;
        System.out.println("This is the result:  " + result);
        calculator();
    }

    public static void timesMe() {
        System.out.println("I multiply things for you!");
        getNumbers();
        result = numOne * numTwo;
        System.out.println("This is the result:  " + result);
        calculator();
    }

    public static void divideMe() {
        System.out.println("I divide things!");
        getNumbers();
        result = numOne / numTwo;
        System.out.println("This is the result:    " + result);
        calculator();
    }

    public static double getNumTwo() {
        return numTwo;
    }

    public static void setNumTwo(double numTwo) {
        Calculator.numTwo = numTwo;
    }

    public static double getNumOne() {
        return numOne;
    }

    public static void setNumOne(double numOne) {
        Calculator.numOne = numOne;
    }

    public static double getResult() {
        return result;
    }

    public static void setResult(double result) {
        Calculator.result = result;
    }

    public static Scanner getMyScan() {
        return myScan;
    }

    public Calculator() {

    }
}