/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeingtask2;
import java.util.Scanner;
/**
 *
 * @author Lenny Manset
 */
public class Codeingtask2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
    System.out.println("Please enter item price:");
    System.out.println("Please enter discount ratio (5 = 5%):");
    double price = input.nextDouble();
    double discount = input.nextDouble();
    double prePrice= price-price*(discount/100);
    System.out.printf("%-15s  : %3.2f%n" ,"Original price", price);
    System.out.printf("%-15s  : %.2f%%%n" ,"Discount ratio", discount);
    System.out.printf("%-15s : %.2f%n" ,"Price before tax", prePrice);
    System.out.println("-----------------------");
    double fedralTax = prePrice*0.05; 
    double provincialTax = prePrice*0.09975;
    System.out.printf("%-15s  : %.2f%n" ,"Federal tax", fedralTax);
    System.out.printf("%-15s  : %.2f%n" ,"Provincial tax", provincialTax);
    double finalPrice = prePrice + fedralTax + provincialTax;
    System.out.printf("%-15s  : %.2f%n" ,"Final price", finalPrice);

    }
    
}
