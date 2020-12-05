package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int phy=-1,chem,maths;


    static void inputMarks (){
        System.out.println("enter marks:");
        System.out.print("physics:");
        phy=scan.nextInt();
        System.out.print("chemistry:");
        chem=scan.nextInt();
        System.out.print("maths:");
        maths=scan.nextInt();

    }
    static void average(){
        int arg;
        arg=(phy+chem+maths)/3;
        System.out.println("average = "+arg);
    }
    static void pause(){
        System.out.println("\n\nenter any value to continue");
        scan.next();
    }
    public static void main(String[] args) {
        int f=0;


        while (f==0)
        {System.out.println("MENU \n1.INPUT MARKS\n2.AVERAGE \n3.EDIT MARKS \n4.DISPLAY MARKS \n5.EXIT");
            System.out.print("Enter your choice");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    inputMarks();pause();
                    break;
                case 2:
                    average();pause();
                    break;
                case 3:
                    if (phy==-1){
                        System.out.println("marks not present");
                    }
                    else{
                    System.out.println("Physics="+phy);
                    System.out.println("chemistry="+chem);
                    System.out.println("maths="+maths);
                    System.out.println("enter marks for physics");
                    phy= scan.nextInt();
                    System.out.println("enter marks for chemistry");

                    chem= scan.nextInt();
                    System.out.println("enter marks for maths");
                    maths= scan.nextInt();
                    }
                    pause();
                break;
                case 4:
                    System.out.println("Physics="+phy);
                    System.out.println("chemistry="+chem);
                    System.out.println("maths="+maths);pause();
                    break;
                case 5:
                    f=1;
                    break;
                default:
                    System.out.println("input not valid");

            }


        }

    }
}

