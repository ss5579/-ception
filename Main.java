package Exception;

public class Main {
    public static void checkEven(int number) {
        if (number % 2 != 0) {
            throw new ArithmeticException("Число нечетное: " + number);
        }
        System.out.println("Число четное: " + number);
    }

    public static void main(String[] args) {
        int[] testNumbers = {2, 3, 4, 5, 6}; // Примеры чисел для тестирования

        for (int number : testNumbers) {
            try {
                checkEven(number);
            } catch (ArithmeticException e) {
                System.out.println("Исключение: " + e.getMessage());
            }
        }
    }
}
