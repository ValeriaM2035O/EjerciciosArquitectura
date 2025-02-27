package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double tempIngresada;
        double resultado=0;
        int opcion;

        do{
            System.out.println("SELCCIONE UNA OPCION:");
            System.out.println("1. Farenheit a Celcius");
            System.out.println("2. Celcius a Farenheit");
            System.out.println("3. Kelvin a Celcius");
            System.out.println("4. Celsius a Kelvin");
            System.out.println("5. Farenheit a Kelvin");
            System.out.println("6. Kelvin a Farenheit");
            System.out.println("7. Rankine a Farenheit");
            System.out.println("8. Farenheit a Rankine");
            System.out.println("9. Reaumur a Celsius");
            System.out.println("10. Celsius a Reaumur");
            System.out.println("11. Rankine a Kelvin");
            System.out.println("12. Kelvin a Rankine");
            System.out.println("13. Rankine a Celsius");
            System.out.println("14. Celsius a Rankine");
            System.out.println("15. Celsius a Reaumur");
            System.out.println("16. Reaumur a Celsius");
            opcion = scanner.nextInt();

            System.out.print("Ingrese la temperatura: ");
            tempIngresada = scanner.nextDouble();

        resultado= switch (opcion) {
                case 1 -> (5*(tempIngresada - 32)/9);
                case 2 -> (9 * tempIngresada / 5) + 32;
                case 3 -> tempIngresada - 273.15;
                case 4 -> tempIngresada + 273.15;
                case 5 -> (5*(tempIngresada-32)/9)+273.15;
                case 6 -> (9*(tempIngresada-273.15)/5)+32;
                case 7 -> tempIngresada - 459.67;
                case 8 -> tempIngresada + 459.67;
                case 9 -> (5* tempIngresada)/4;
                case 10 -> (4 * tempIngresada)/5;
                case 11 -> (5*(tempIngresada-491.67)/9)+273.15;
                case 12 -> (9*(tempIngresada-273.15)/5)+491.67;
                case 13 -> (5*(tempIngresada-491.67)/9);
                case 14 -> ((9*tempIngresada)/5)+491.67;
                case 15 -> (4*tempIngresada)/5;
                case 16 -> (5*tempIngresada)/4;
            default -> 0;
        };
            System.out.println("Resultado: " + resultado);

        } while (opcion != 16);
    }
}
