package main.java;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$#.00");
        System.out.println("Enter your state's two letter code (e.g. NY for New York): ");
        String state = in.nextLine().toUpperCase();
        System.out.println("Enter your total before tax: ");
        double total = in.nextDouble();
        double taxRate = 0.00;
        switch(state) {
            case "AL":
                taxRate = 0.04;
                break;
            case "AK":
                taxRate = 0.00;
                break;
            case "AZ":
                taxRate = 0.056;
                break;
            case "AR":
                taxRate = 0.065;
                break;
            case "CA":
                taxRate = 0.0725;
                break;
            case "CO":
                taxRate = 0.029;
                break;
            case "CT":
                taxRate = 0.0635;
                break;
            case "DE":
                taxRate = 0.00;
                break;
            case "DC":
                taxRate = 0.06;
                break;
            case "FL":
                taxRate = 0.06;
                break;
            case "GA":
                taxRate = 0.04;
                break;
            case "HI":
                taxRate = 0.04;
                break;
            case "ID":
                taxRate = 0.06;
                break;
            case "IL":
                taxRate = 0.0625;
                break;
            case "IN":
                taxRate = 0.07;
                break;
            case "IA":
                taxRate = 0.06;
                break;
            case "KS":
                taxRate = 0.065;
                break;
            case "KY":
                taxRate = 0.06;
                break;
            case "LA":
                taxRate = 0.0445;
                break;
            case "ME":
                taxRate = 0.055;
                break;
            case "MD":
                taxRate = 0.06;
                break;
            case "MA":
                taxRate = 0.0625;
                break;
            case "MI":
                taxRate = 0.06;
                break;
            case "MN":
                taxRate = 0.06875;
                break;
            case "MS":
                taxRate = 0.07;
                break;
            case "MO":
                taxRate = 0.04225;
                break;
            case "MT":
                taxRate = 0.00;
                break;
            case "NE":
                taxRate = 0.055;
                break;
            case "NV":
                taxRate = 0.0685;
                break;
            case "NH":
                taxRate = 0.00;
                break;
            case "NJ":
                taxRate = 0.06625;
                break;
            case "NM":
                taxRate = 0.05125;
                break;
            case "NY":
                taxRate = 0.04;
                break;
            case "NC":
                taxRate = 0.0475;
                break;
            case "ND":
                taxRate = 0.05;
                break;
            case "OH":
                taxRate = 0.0575;
                break;
            case "OK":
                taxRate = 0.045;
                break;
            case "OR":
                taxRate = 0.00;
                break;
            case "PA":
                taxRate = 0.06;
                break;
            case "RI":
                taxRate = 0.07;
                break;
            case "SC":
                taxRate = 0.06;
                break;
            case "SD":
                taxRate = 0.042;
                break;
            case "TN":
                taxRate = 0.07;
                break;
            case "TX":
                taxRate = 0.0625;
                break;
            case "UT":
                taxRate = 0.0485;
                break;
            case "VT":
                taxRate = 0.06;
                break;
            case "VA":
                taxRate = 0.043;
                break;
            case "WA":
                taxRate = 0.065;
                break;
            case "WV":
                taxRate = 0.06;
                break;
            case "WI":
                taxRate = 0.05;
                break;
            case "WY":
                taxRate = 0.04;
                break;
            default:
                System.out.println("Invalid state code.");
                System.exit(0);
        }
        double tax = total * taxRate;
        double totalWithTax = total + tax;
        System.out.println("Total before tax: " + df.format(total));
        System.out.println("Tax: " + df.format(tax));
        System.out.println("Total with tax: " + df.format(totalWithTax));
    }
}