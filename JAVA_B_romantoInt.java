import java.util.Scanner;

public class JAVA_B_romantoInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.next();
        int result = romanToInteger(romanNumeral);
        System.out.println("Converted Integer: " + result);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = romanCharToValue(c);

            if (value < prevValue) {
                result = result - value;
            } else {
                result = result + value;
            }

            prevValue = value;
        }

        return result;
    }

    public static int romanCharToValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}