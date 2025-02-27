package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double total=0;
        double precioProductos = 0;
        double dineroIngresado;
        int productosAdquiridos=0;
        double vueltas;
        int opcion;

        do{
            System.out.println("PRODUCTOS:");
            System.out.println("1. Galletas Oreo - $2000");
            System.out.println("2. Coca cola - $3000");
            System.out.println("3. Agua - $2000");
            System.out.println("4. Tostacos - $1300");
            System.out.println("5. Papas pollo - $2200");
            System.out.println("6. Te - $3000");
            System.out.println("7. Chocolatina - $1550");
            System.out.println("8. Manimoto - $2000");
            System.out.println("9. Jugo hit - $1700");
            System.out.println("10. Cheetos - $2300");
            System.out.println("11. Terminar compra");
            System.out.println("SELECCIONE NUMERO DEL PRODUCTO:");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1 -> precioProductos = 2000;
                case 2 -> precioProductos = 3000;
                case 3 -> precioProductos = 2000;
                case 4 -> precioProductos = 1300;
                case 5 -> precioProductos = 2200;
                case 6 -> precioProductos = 3000;
                case 7 -> precioProductos = 1550;
                case 8 -> precioProductos = 2000;
                case 9 -> precioProductos = 1700;
                case 10 -> precioProductos = 2300;
                case 11 -> System.out.println("Terminando compra");
                default -> System.out.println("Opción inválida, intente de nuevo.");
            }
            if (opcion >= 1 && opcion <= 10){
                total += precioProductos;
                productosAdquiridos++;
                System.out.println("Producto añadido - Total compra: $"+total);
            }
    }while (opcion!= 11 && productosAdquiridos < 5);
        
        if (total > 0){
            System.out.println("Ingrese dinero");
            dineroIngresado = scanner.nextDouble();
            
            if (dineroIngresado >= total){
                vueltas = dineroIngresado - total;
                System.out.println("Pago realizado - sus vueltas son: $"+ vueltas);
            }else {
                System.out.println("Dinero insuficiente, vuelva a intentar");
            }
        }else{
            System.out.println("Saliendo");
        }
}
}
