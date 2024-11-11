/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeingtask1;
import java.util.Scanner;
/**
 *
 * @author Lenny Manset
 */
public class Codeingtask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input = new Scanner(System.in);
        
        System.out.println(" Please enter your Name :");  
        System.out.println(" Please enter your Age :");
        System.out.println(" Please enter your Gender :");
        System.out.println(" Please enter your department :");
        System.out.println(" Please enter value of PI(3.1415926): ");
        String firstname = input.nextLine();
        String age = input.nextLine();
        String gender = input.nextLine();
        String major = input.nextLine();
        double PI = input.nextDouble();
        System.out.printf("%-13s : %s%n", "Name" ,firstname);
        System.out.printf("%-13s : %s%n", "Age" ,age);
        System.out.printf("%-13s : %s%n", "Gender" , gender);
        System.out.printf("%-13s : %s%n", "Department" ,major);
        System.out.printf("%-13s : %.2f%n","PI", PI);
    }
    
}
