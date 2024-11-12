package gr.aeub.cf.ch5;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         int choice;
         int result = 0;

        while(true){
            printMenu();
            choice = getOneInt();


            if(!isChoiceValid(choice)){
                System.out.println("Error. Choice must be between 1-6.Try again.");
                continue;
            }


            if (choice == 6){
                System.out.println("quitting...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu(){
        System.out.println("choose one of the bellow:");
        System.out.println("1. add");
        System.out.println("2. abstraction");
        System.out.println("3. multiply");
        System.out.println("4. division");
        System.out.println("5. last of division");
        System.out.println("6. quit");
    }

    public static int  getOneInt(){
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice){
//        if(choice >= 1 && choice <= 6){
//            return true;
//        }else {
//            return false;
//        }
        return  choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice){
        int num1 = 0;
        int num2 = 0;
        int result= 0;

        System.out.println("Please insert two whole numbers");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice){
            case 1:
                result = add(num1,num2);
                break;
            case 2:
                result = sub(num1,num2);
                break;
            case 3:
                result = mul(num1,num2);
                break;
            case 4:
                result = div(num1,num2);
                break;
            case 5:
                result = mod(num1,num2);
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
        return result;
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        if(b==0) return 0;
        return a / b;
    }

    public static int mod(int a, int b){
        if(b==0)return 0;
        return a % b;
    }

}
