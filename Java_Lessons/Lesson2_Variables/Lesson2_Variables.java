/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NEC
 */
public class Lesson2_Variables {
    public static void main(String[] args) {
// STRINGS
    String name = "WIZDOOM";
    String status = "Still fucking ALIVE";
//NUMBERSjn
    int age = 240;
    double money = 0.00;

    System.out.println("CODENAME: [" + name + "]");
    System.out.println("AGE OF SUFFERING: [" + age + "]");
    System.out.println("STATUS: [" + status + "]");
    System.out.println("NETWORTH: [" + money + "]");

    //VARIABLE MUTATION
    System.out.println();
    System.out.println("AGE: " + age);
    age = 25;
    System.out.println("AGE: " + age);
    age = 26;
    System.out.println("AGE: " + age);


    

        
    }
}

