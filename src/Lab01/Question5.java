package Lab01;
public class Question5 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result1 = calculator.square(
                calculator.add(
                        calculator.multiply(3, 4),
                        calculator.multiply(5, 7)
                )
        );

        int result2 = calculator.add(
                calculator.square(calculator.add(4, 7)),
                calculator.square(calculator.add(8, 3))
        );

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
    }
}