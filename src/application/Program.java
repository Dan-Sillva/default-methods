package application;

import services.BrazilTaxService;
import services.InterestService;
import services.USATaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the loan amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter the amount of months: ");
        int months = sc.nextInt();

        InterestService btx = new USATaxService();

        System.out.println("Payment: "+ String.format("%.2f",btx.payment(200, 3)));

    }

}
