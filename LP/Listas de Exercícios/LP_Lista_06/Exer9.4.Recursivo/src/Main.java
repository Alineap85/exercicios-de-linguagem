import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter your word: ");
            word = in.next();
        } while (word.isEmpty());

        String lowerCase = word.toLowerCase();
        char[] array = lowerCase.toCharArray();

        if (verifyPalindrome(array, 0, array.length - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        in.close();
    }

    public static boolean verifyPalindrome(char[] array, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (array[start] != array[end]) {
            return false;
        }
        return verifyPalindrome(array, start+1, end-1);
    }
}