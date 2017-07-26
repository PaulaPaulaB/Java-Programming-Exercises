package recursion;

public class RecursionMain {

    public static int factorialByIteration(int entrance) {
        int result = 1;
        for (int i = 1; i <= entrance; i++) {
            result = result * i;
        }
        return result;
    }

    public static int factorialByRecursion(int entrance) {
        if (entrance == 1 || entrance == 0) {
            return 1;
        } else {
            return entrance * factorialByRecursion(entrance - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println("Wynik silni obliczonej w sposób iteracyjny: "
                + factorialByIteration(0));
        System.out.println("Wynik silni obliczonej w sposób rekurencyjny: "
                + factorialByRecursion(0));
    }
}
