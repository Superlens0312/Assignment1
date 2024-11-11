/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeingtask3;
import java.util.Scanner;
/**
 *
 * @author Lenny Manset
 */
public class Codeingtask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
        System.out.println("Pleae enter a 4 digit octal number (numbers must be between 0-7)");
        String Octal = input.nextLine();
        System.out.printf("%-15s : %1s%n","Octal number", Octal);
        Character Value1 = Octal.charAt(0);
        Character Value2 = Octal.charAt(1);
        Character Value3 = Octal.charAt(2);
        Character Value4 = Octal.charAt(3);
        int integerOfFirstValue=((int)Value1-(int)'0');
        int integerOfSecondValue=((int)Value2-(int)'0');
        int integerOfThirdValue=((int)Value3-(int)'0');
        int integerOfFourthValue=((int)Value4-(int)'0');
        double Decimal1 = Math.pow(8,3)* integerOfFirstValue ;
        double Decimal2 = Math.pow(8,2)* integerOfSecondValue;
        double Decimal3 = Math.pow(8,1)* integerOfThirdValue;
        double Decimal4 = Math.pow(8,0)* integerOfFourthValue;
        double FinalDecimal = (Decimal1 + Decimal2 +Decimal3 +Decimal4);
        System.out.printf("%-15s : %1.0f%n","Decimal number", FinalDecimal );
    }
    
}
