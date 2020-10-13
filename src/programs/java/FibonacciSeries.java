package programs.java;

public class FibonacciSeries {

    public static void main(String args[]) {
        int value=4;
        for(int i=0;i<value;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }

    static int fibonacci(int value) {
        if (value <= 1) {
            return value;
        }
        return fibonacci(value - 1) + fibonacci(value - 2);
    }
}
