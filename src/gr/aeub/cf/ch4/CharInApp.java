package gr.aeub.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

public class CharInApp {

    public static void main(String[] args) throws IOException {
        char ch = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character");

        ch = scanner.nextLine().charAt(0);

        System.out.println( ch);
    }


}
