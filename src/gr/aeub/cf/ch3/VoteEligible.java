package gr.aeub.cf.ch3;

import java.util.Scanner;

public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;


       System.out.println("Please enter your age:");
       age = scanner.nextInt();

       if(age >= 18){
           System.out.println("you can vote");
       }else{
           System.out.println("you cant vote");
       }
    }
}
