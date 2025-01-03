package Exception;

public class Main1 {
    public static void stringTest(String input) throws Exception {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Строка не должна содержать цифры: " + input);
            }
        }
    }
    public static void main(String[] args) {
        try {
            stringTest("HelloWorld");
            System.out.println("Строка корректна");
            stringTest("Hello123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
