package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int atacante;
        int defensor;
        int ataque;
        int defensa;
        double efectividad = 1.0;

        do {
            System.out.println("Seleccione el tipo del Pokémon atacante:");
            System.out.println("1. Agua");
            System.out.println("2. Fuego");
            System.out.println("3. Planta");
            System.out.println("4. Eléctrico");
            atacante = scanner.nextInt();

            System.out.println("Seleccione el tipo del Pokémon defensor:");
            System.out.println("1. Agua");
            System.out.println("2. Fuego");
            System.out.println("3. Planta");
            System.out.println("4, Eléctrico");
            defensor = scanner.nextInt();

        } while (defensor < 1 || defensor > 4 || atacante < 1 || atacante > 4);

        do {
            System.out.println("Ingrese el valor de ataque (1-100):");
            ataque = scanner.nextInt();

            System.out.println("Ingrese el valor de defensa (1-100):");
            defensa = scanner.nextInt();

        } while (defensa < 1 || defensa > 100 || ataque < 1 || ataque > 100);

        switch (atacante) {
            case 1 -> {
                switch (defensor) {
                    case 2 -> efectividad = 2.0;
                    case 3 -> efectividad = 0.5;
                    case 4 -> efectividad = 1.0;
                }
            }
            case 2 -> {
                switch (defensor) {
                    case 3 -> efectividad = 2.0;
                    case 1 -> efectividad = 0.5;
                    case 4 -> efectividad = 1.0;
                }
            }
            case 3 -> {
                switch (defensor) {
                    case 1 -> efectividad = 2.0;
                    case 2 -> efectividad = 0.5;
                    case 4 -> efectividad = 2.0;
                }
            }
            case 4 -> {
                switch (defensor) {
                    case 1 -> efectividad = 2.0;
                    case 4 -> efectividad = 0.5;
                    case 3 -> efectividad = 0.5;
                }
            }
            default -> efectividad = 1.0;
        }

        double daño = 50 * ((double) ataque / defensa) * efectividad;
        System.out.println("El daño del ataque es: " + daño);

    }
}