package com.mycompany.temperatureconverter;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        double result;
        int option;
        System.out.println("To Convert Celsius to Fahrenhiet Enter[1]: ");
        System.out.println("To Convert Fahrenhiet to Celsius Enter [2]: ");
        Scanner sc =new Scanner(System.in);
        option = sc.nextInt();
        if(option == 1){
        System.out.println("Enter Celsius to Convert into Fahrenhiet");
        celsius = sc.nextDouble();
        result = celsius * 1.8+ 32 ;
        System.out.println("The Degree with Fahrenheit: "+result);
    }if (option == 2){
        System.out.println("Enter Fahrenhiet to Convert into Celsius");
        fahrenheit = sc.nextDouble();
        result = (fahrenheit - 32) / 1.8;
        System.out.println("The Degree with Fahrenheit: "+result);
    }
}
}