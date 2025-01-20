package ControlFlow;

public class TheForLoop {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        for (double i = 2; i <= 5; i++) {

            double interestAmount = calculateInterest(10000, i);
            System.out.println("10,000 at " + i + "% interest = " + interestAmount);
        }

        for (double i = 7.5; i <= 10; i += .25) {

            double interestAmount = calculateInterest(100, i);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100 at " + i + "% interest = $" + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
