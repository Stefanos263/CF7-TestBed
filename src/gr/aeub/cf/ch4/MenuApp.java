package gr.aeub.cf.ch4;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int choice;


      do{
          printMenu();
          choice = scanner.nextInt();
          if(!isChoiceValid(choice)){
              System.out.println("Error.Choice not valid.");
              continue;
          }

          doOnChoice(choice);



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

    public static boolean isChoiceValid(int choice){
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice){
        switch (choice){
            case 1:
                System.out.println("select process");
                break;
            case 2:
                System.out.println("delete process");
                break;
            case 3:
                System.out.println("search process");
                break;
            case 4:
                System.out.println("update process");
                break;
            case 5:
                System.out.println("quit process");
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
    }
}
