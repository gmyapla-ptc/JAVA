/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NEC
 */
public class Lesson4_Assignment_Operators {
    public static void main (String []args){
    int value = 100;
    
    value += 50;
    System.out.println("x = 100");
    System.out.println("ADD 50 to x is = " + value);
    value -= 50;
    System.out.println("SUBTRACT 50 to x is = " + value);
    value *= 2;
    System.out.println("MUlTIPLY 2 to x is = " + value);
    value /= 4;    
    System.out.println("DIVIDE 4 to x is = " + value);
    
    value++;
    System.out.println("INCRAMENT or ADD 1 to the x");
    System.out.println(value);
  
    value--;
    System.out.println("DECRAMENT or MINUS 1 to the x");
    System.out.println(value);
    
    // ++ INCREMENT
    // -- DECRAMENT
    
    /* Shortcut	                     Full version
       x += 5	                     x = x + 5
       x -= 5	                     x = x - 5
       x *= 5	                     x = x * 5
       x /= 5	                     x = x / 5
       x %= 5	                     x = x % 5
*/
    }
    }