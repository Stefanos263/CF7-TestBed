package gr.aeub.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("choose one of the below.");
            System.out.println("1. one-player game");
            System.out.println("2. two-player game");
            System.out.println("3. team game");
            System.out.println("4. Quit");

            choice = scanner.nextInt();
            if (choice < 1 || choice > 4){
                System.out.println("one-player game started.");
            }else if(choice == 2){
                System.out.println("two-player game started");
            }else if (choice == 3){
                System.out.println("team game started");
            }else{
                System.out.println("Quiting...");
            }
        }while (choice != 4);
    }
}
