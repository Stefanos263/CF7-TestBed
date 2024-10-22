package gr.aeub.cf.ch1;

// calculates the sum of two integers
// and the result is printed in the console.

public class AddApp {

    public static void main(String[] args) {
        //δήλωση και αρχικοποιήση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // εντολές
        result = num1 + num2;

        // εκτύπωση του αποτελέσματος
        System.out.println("The result is " + result);
        System.out.println("the sum of " + num1 + ", " + num2 + " is going to be" + result);
    }
}
