package gr.aeub.cf.ch4;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int choice;


      do{
          printMenu();
          choice = scanner.nextInt();
      }while(choice != 5);
    }

    public static void printMenu(){
        System.out.println("choose one of the bellow:");
        System.out.println("1.insert");
        System.out.println("2.delete");
        System.out.println("3. search");
        System.out.println("4. update");
        System.out.println("5. quit");
    }
}
