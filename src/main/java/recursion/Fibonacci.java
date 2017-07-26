package recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fibonacci {

    public int fibonacci(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Cannot compute fibonacci number on negative argument");
        }
        if (i > 100_000) {
            throw new IllegalArgumentException("Max argument is 100 000");
        }
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

    @Test
    public void sholudReturnZero() {
        assertEquals(0, fibonacci(0));
    }

    @Test
    public void shouldReturnOneOnOne() {
        assertEquals(1, fibonacci(1));
    }

    @Test
    public void shouldReturnOneOn2() {
        assertEquals(1, fibonacci(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTrhowIllegalArgumentOnHugeArgument() {
        fibonacci(Integer.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void minusTest() {
        fibonacci(-1);
    }

}
