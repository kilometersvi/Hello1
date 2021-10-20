/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;
import org.json.simple.JSONObject;


/**
 *
 * @author milesmilos
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
    */
    public static double square(double x) {
        return x * x;
    }   
    public static double cube(double x) {
        return x * x * x;
    }
    public static double sqrt(int x) {
        return Math.sqrt(x);
    }
    public static double add(int x, int x2){
        return x + x2;
    }
    public static double subtract(int x, int x2){
        return x - x2;
    }   
    /*
    public static String getInput(Scanner sc) {
        //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter math");

        String usermath = sc.nextLine();  // Read user input
        return usermath;
    }
    public static int parse(String s) {
        ArrayList<String> current = new ArrayList<String>();
        
        for (String c : s){
            
        }
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(square(2));
        System.out.print(cube(2));
        System.out.print(sqrt(4));
        System.out.print(add(4,2));
        System.out.print(subtract(4,2));
        
    }
    
}
