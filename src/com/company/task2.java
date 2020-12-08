package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
class Student{
    Scanner scan=new Scanner(System.in);
    String Name;
    int ID;
    char gender;
    int[] marks=new int[4];
    double total;

    void inputDetails(){
        System.out.println("Enter student details:");
        System.out.println("Name:");
        Name= scan.nextLine();
        System.out.println("ID:");
        ID= scan.nextInt();
        System.out.print("Gender(m/f/o):");
        gender= scan.next().charAt(0);
        System.out.println("Marks:");
        marks[0]=scan.nextInt();
        System.out.println("Physics:");
        marks[1]=scan.nextInt();
        System.out.println("Chemistry:");
        marks[2]=scan.nextInt();
        System.out.println("English:");
        marks[3]=scan.nextInt();
        total=(marks[0]+marks[1]+marks[2]+marks[3])/4;
        System.out.println("TOTAL:"+total+"%");
    }
    void displayDetails(){
        System.out.println("Name: "+Name);
        System.out.println("ID: "+ID);
        System.out.println("Gender: "+gender);
        System.out.println("Marks:");
        System.out.println("Maths: "+marks[0]);
        System.out.println("Physics: "+marks[1]);
        System.out.println("Chemistry: "+marks[2]);
        System.out.println("English: "+marks[3]);
        System.out.println("TOTAL: "+total+"%");
        System.out.println("\n\n");
    }
}
public class task2{
    static Student[] student = new Student[100];
    static Scanner scan=new Scanner(System.in);
    static int n;
    static void findStudent(int id){
        for (int i=0;i<n;i++) {


            if (student[i].ID == id)
                student[i].displayDetails();
        }
        static void sortDetails(){
            Student t=new Student();
            for (int i=0;i<n-1;i++){
                for(int j=0;j<n-1;j++){
                    if(student[j].total<student[j+1].total){
                        t=student[j];
                        student[j]=student[j+1];
                        student[j+1]=t;
                    }
                }
            }

        }

    }
    static void displayAll(){
        System.out.println("sl\tName\tTotal %");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+".\t"+(student[i].Name)+"\t"+student[i].total);

        }
        static void displayAll(int n){
            System.out.println("sl\tName\tTotal %");
            for(int i=0;i<n;i++){
                System.out.println((i+1)+".\t"+(student[i].Name)+"\t"+student[i].total);

            }
        }
        public static void main(String[] args){
            int choice;
            System.out.println("\nMENU\n1.Enter student details\n2.Find student\n3.topm students\n4.exit ");
            System.out.println("enter your choice:");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the number of students: ");
                    n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        student[i] = new Student();
                        student[i].inputDetails();
                        System.out.println();
                        student[i].displayDetails();
                    }
                    sortDetails();
                    break;
                case 2:
                    System.out.println("\n\nEnter student ID: ");
                    int IDD = scan.nextInt();
                    findStudent(IDD);
                    break;
                case 3:
                    System.out.println("\n\nEnter number of student : ");
                    int topp = scan.nextInt();
                    displayAll(topp);
                case 4:
                    displayAll();
                    break;
                default:
                    System.out.println("ERROR:invalid choice");


            }
        }

        }






