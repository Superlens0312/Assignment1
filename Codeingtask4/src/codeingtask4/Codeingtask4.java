/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeingtask4;
import java.util.Scanner;
/**
 *
 * @author Lenny Manset
 */
public class Codeingtask4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Please enter the intial balance:");
        System.out.println("Please enter the annual interest rate (2 for 2%): ");
        System.out.println("Please enter the number of years the client wants to save the money in the bank:");
        double Initial = input.nextDouble();
        double Interest = input.nextDouble();
        int Years = input.nextInt();
        double savings =Math.pow(1 + Interest/100, Years)*Initial;
        System.out.printf("%-25s : %9.2f%n","Initial Balance",Initial);
        System.out.printf("%-25s : %8.2f%%%n","Anual interest rate",Interest);
        System.out.printf("%-25s : %9d%n","Saving years",Years);
        System.out.println("-------------------------------------");
        System.out.printf("%-25s : %9.2f%n","Balance after "+ Years +" years",savings);
    }
    
}
