package com.java.practice.phones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int iphoneChoice;
        int baseAgain;
        String sendMessage;
        do{

            Scanner sc = new Scanner(System.in);
            System.out.println("Please choose an iphone by choosing a number"+"\n"+
                    1+ ") iPhone7"+"\n"+
                    2+ ") iPhone8"+ "\n"+
                    3+ ") iPhone10");
            iphoneChoice = sc.nextInt();
            Iphone p;
            switch(iphoneChoice) {
                case 1:
                    p = new Iphone7(60, "Welcome!", false);
                    break;
                case 2:
                    p = new Iphone8(60, "Welcome!", false);
                    break;
                case 3:
                    p = new Iphone10(60, "Welcome!", false);
                    break;
                default:
                   throw new InputMismatchException("Please enter number from 1 to 3 only");
            }

            int again;
            do{

                System.out.println("Now please choose action that needs to be preformed");
                System.out.println("***Only one action at a time");
                System.out.println("1. Check BatteryLife\n" +
                        "2. Charge Iphone\n" +
                        "3. SendMessage\n" +
                        "4. ReadLastMessage\n" +
                        "5. check if iphone is locked\n" +
                        "6. lock iphone\n" +
                        "7. unlock iphone");
                int num;
                num = sc.nextInt();
                switch(num){
                    case 1:
                        System.out.println("The battery for your model is: "+p.getBatteryLevel());
                        break;
                    case 2:
                        System.out.println("Battery level at this time = "+ p.getBatteryLevel());
                        System.out.println("Charging the battery.......");
                        p.chargeBattery();
                        break;
                    case 3:
                        System.out.println("Please enter your message: " +"\n"+"One word only:  ");
                        sendMessage = sc.next();
                        p.sendMessage(sendMessage);
                        System.out.println("Message sent!");
                        break;
                    case 4:
                        System.out.println("Showing the text message: ");
                        System.out.println(p.getMessageText());
                        break;
                    case 5:
                        System.out.println("Status of an iPhone: ");
                        System.out.println(p.isLocked());
                        break;
                    case 6:
                        System.out.println("Method of locking: ");
                        p.lock();
                        break;
                    case 7:
                        System.out.println("Method of unlocking: ");
                        p.unlock();
                        break;
                    default:
                        System.out.println("Please choose the valid number");
                }


                System.out.println("Enter 1 to to choose different action with same model"+"\n"+ "or 2 to choose different model: ");
                again = sc.nextInt();
            }while(again == 1);
            System.out.println("Enter 1 to run it again with different model"+"\n"+ "or 2 to stop the whole program: ");
            baseAgain = sc.nextInt();
        }while(baseAgain == 1);

    }
}