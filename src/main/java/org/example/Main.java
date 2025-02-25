package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoInicial = 50000;
        int opcion;

        do{
            System.out.println("SELCCIONE UNA OPCION:");
            System.out.println("1. Consulte saldo");
            System.out.println("2. Ingrese dinero");
            System.out.println("3. Retire dinero");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Saldo actual: $" + saldoInicial);
            case 2 -> {
                System.out.println("Saldo actual: $");
                        double ingreso = scanner.nextDouble();
                        if (ingreso > 0){
                            saldoInicial += ingreso;
                            System.out.println("Ingreso de dinero realizado");
                        } else {
                            System.out.println("Accion denegada");
                        }
            }
            case 3 -> {
                System.out.println("Ingrese la cantidad a retirar");
                double retiro = scanner.nextDouble();
                if (retiro > 0 && retiro <= saldoInicial){
                    saldoInicial -= retiro;
                    System.out.println("Retiro realizado");
                } else {
                    System.out.println("Dinero insuficiente");
                }
            }
            case 4 -> System.out.println("Fin");
        }
        }while (opcion != 4);
        }
}