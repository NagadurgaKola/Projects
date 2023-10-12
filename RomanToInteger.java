
import java.util.Scanner;

public class RomanToInteger {
    int value(char ch) {
        switch (ch) {
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
                return -1;
        }
    }

    int convertRomanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {
                    total = total + s1;
                } else {
                    total = total - s1;
                }
            } else {
                total = total + s1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RomanToInteger ob = new RomanToInteger();
        String romanValue = scan.nextLine();
        int result = ob.convertRomanToInt(romanValue);
        System.out.println(result);
        scan.close();
    }
}
