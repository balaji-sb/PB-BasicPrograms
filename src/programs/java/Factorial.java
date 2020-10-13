package programs.java;

public class Factorial {

    public static void main(String args[]) {
        System.out.print(factorial(4));
    }

    static int factorial(int value) {
        if (value <= 1)
            return value;
        return value * factorial(value-1);
    }

}
