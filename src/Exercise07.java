/**
 * Created by illladell on 6/28/16.
 */
public class Exercise07 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("helloracecar"));

        //date range: 01/01/2016 to 12/31/16
        // MDDYY: 61016 06/10/2016
    }

    public static boolean isPalindrome(String input) {
        //return input.equals(new StringBuilder(input).reverse().toString());
        //String input = "racecar";
        int n = input.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
