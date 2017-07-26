package recursion;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    public boolean isPalindrome(char[] text, int i) {
        if (i < text.length / 2) {
            if (text[i] == text[text.length - 1 - i]) {
                isPalindrome(text, i + 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeByIteration(char[] text) {
        for (int i = 0; i < text.length; i++) {
            if (text[i] != text[text.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void palindromeTest() {

        String p1 = "KAJAK";
        String nonPalindrome = "DUPA";

        char[] text = p1.toCharArray();
        Assert.assertTrue(isPalindrome(text, 0));
        Assert.assertFalse(isPalindrome(nonPalindrome.toCharArray(), 0));
        Assert.assertTrue(isPalindrome("".toCharArray(), 0));
    }


    @Test
    public void palindromeByIterationTest() {

        String p1 = "KAJAK";
        String nonPalindrome = "DUPA";

        char[] text = p1.toCharArray();
        Assert.assertTrue(isPalindromeByIteration(text));
        Assert.assertFalse(isPalindromeByIteration(nonPalindrome.toCharArray()));
        Assert.assertTrue(isPalindromeByIteration("".toCharArray()));
    }
}
