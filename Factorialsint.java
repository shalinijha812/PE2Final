package myexercise;

public class Factorialsint {
    public void getIntFactorials(int num) {

        int i, j, limit = 100, factorial = 1;
        for (i = 1; i < limit; i++) {
            factorial = 1;
            do {
                for (j = 1; j <= i; j++) {
                    factorial = factorial * j;
                }
                System.out.println("The factorial of" + i + "is" + factorial);
            }
            while (factorial != Integer.MAX_VALUE);
        }
        System.out.println("The factorial of" + i + " is" + "out of range");
    }

    public void getLongFactorials(int num) {
        int i, j, limit = 100, factorial = 1;
        for (i = 1; i < limit; i++) {
            factorial = 1;
            do {
                for (j = 1; j <= i; j++) {
                    factorial = factorial * j;
                }
                System.out.println("The factorial of" + i + "is" + factorial);
            }
            while (factorial != Long.MAX_VALUE);


            System.out.println("The factorial of" + i + " is" + "out of range");
        }
    }
}
