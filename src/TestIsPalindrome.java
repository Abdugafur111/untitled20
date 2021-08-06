import java.sql.SQLOutput;
import java.util.Scanner;

public class TestIsPalindrome {

    public static void main(String[] args) {
	// write your code here
        Palin palindrome = new Palin();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scan.next();

        System.out.println(palindrome.isPalindrome(s));
    }
}
