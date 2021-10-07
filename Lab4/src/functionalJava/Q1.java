package functionalJava;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Q1 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> operationResult = operation("add");
        System.out.println(operationResult.apply(2, 3));

    }

    public static BiFunction<Integer, Integer, Integer> operation (String op) {

        if (op.toLowerCase().equals("add")) {
            return ((firstNumber, secondNumber) -> firstNumber + secondNumber);
        }
        else if (op.toLowerCase().equals("subtract")) {
            return ((firstNumber, secondNumber) -> firstNumber - secondNumber);
        }
        else if (op.toLowerCase().equals("power")) {
            return ((firstNumber, secondNumber) -> (int) Math.pow(firstNumber, secondNumber));
        }

        return null;

    }

}
