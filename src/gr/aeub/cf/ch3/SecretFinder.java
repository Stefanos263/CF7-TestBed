package gr.aeub.cf.ch3;

import java.util.Scanner;

public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int  SECRET = 12;
        boolean success = false;
        do {


            System.out.println("Insert a num to guess the secret");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Secret found!!");
                success = true;
            } else {
                System.out.println("secret is not correct, try again!");
            }
        }while(!success);


    }
}