import java.util.Scanner;

/**
 * Created by illladell on 6/22/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        int num = 12345;
        // 54321
        //System.out.println(Integer.parseInt(new StringBuffer(String.valueOf(num)).reverse().toString()));

        solveViaLoop(num);
        solveViaStringBuilder(num);
        solveViaMath();
    }

    public static void solveViaLoop(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        char[] reverseChars = new char[chars.length];
        int n = chars.length - 1;
        for (char c : chars) {
            reverseChars[n] = c;
            n--;
        }
        int reverseNum = Integer.valueOf(String.valueOf(reverseChars));
        System.out.println(reverseNum);
    }

    public static void solveViaStringBuilder(int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        int reverseNum = Integer.valueOf(s.reverse().toString());
        System.out.println(reverseNum);
    }

    public static void solveViaMath() {
        int num, reverse = 0;

        System.out.println("Enter a number to reverse");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        while( num != 0 ) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse of the entered number is: " + reverse);
    }
}
