package exception;

public class Second {

    public static void main(String[] args) {
        try {
            divideByZero(5.0, 0.0);
        } catch (Exception er) {
            System.out.println(er.getMessage());
            divideByZero(10.0, 2.0);
        }

        try {
            createPositiveNumber(-5);
        } catch (Exception er) {
            System.out.println(er.getMessage());
            createPositiveNumber(10);
        }

        try {
            checkingSmallLetters("ContainsBigLetters");
        } catch (Exception er) {
            System.out.println(er.getMessage());
            checkingSmallLetters("onlysmallletters");
        }


        String str1 = "";
        String str2 = "Hello, world!";

        try {
            checkString(str1);
        } catch (NewException er) {
            System.out.println(er.getMessage());
        }

        try {
            checkString(str2);
        } catch (NewException er) {
            System.out.println(er.getMessage());
        }
    }

    public static void divideByZero(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        double result = a / b;
        System.out.println(result);
    }

    public static void createPositiveNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Число должно быть больше 0");
        }
        System.out.println(number);
    }

    public static void checkingSmallLetters(String str) {
        if (!str.matches("[a-z]+")) {
            throw new IllegalArgumentException("В строке должны быть только маленькие буквы");
        }
        System.out.println(str);
    }

    public static void checkString(String str) throws NewException {
        if (str.isEmpty()) {
            throw new NewException("В строке ничего нет");
        }
    }
}