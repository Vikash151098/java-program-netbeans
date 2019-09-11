
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikash Kumar
 */
public class CurrencyFormater {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
         
        NumberFormat nf0=NumberFormat.getCurrencyInstance(Locale.US);
        nf0.setCurrency(Currency.getInstance("USD"));
        String us=nf0.format(payment);
         Locale locale1 = new Locale("en", "IN"); 
        NumberFormat nf1=NumberFormat.getCurrencyInstance(locale1); 
         nf1.setCurrency(Currency.getInstance("INR"));
        String india=nf1.format(payment);
        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.CHINA);
        nf2.setCurrency(Currency.getInstance("CNY"));
        String china=nf2.format(payment);
        NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        nf3.setCurrency(Currency.getInstance("EUR"));
        String france=nf3.format(payment);
        

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}



