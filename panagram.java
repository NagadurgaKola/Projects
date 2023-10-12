import java.util.Scanner;

public class panagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String s = "";
        for (char i = 'a'; i <= 'z'; i++) {
            if (str.indexOf(i) >= 0) {

                s = s + i;
            }
        }
        if (s.length() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println(" Not Pangram");
        }
        sc.close();
    }
}