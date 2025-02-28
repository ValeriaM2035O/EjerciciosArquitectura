package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {


        int persona1;
        int persona2;
        int winJugador1 = 0;
        int winJugador2 = 0;

        Random random = new Random();
        System.out.println("Piedra, papel o tijera...");
        System.out.println("Recuerda que 1 es piedra - 2 es papel - 3 es tijera");

        while (winJugador1 < 2 && winJugador2 < 2) {
            persona1 = random.nextInt(3) + 1;
            persona2 = random.nextInt(3) + 1;

            System.out.println("Ronda N°:" + (winJugador1 + winJugador2 + 1) );
            System.out.println("Jugadr 1 eligió: " + (persona1));
            System.out.println("Jugador 2 eligió: " + (persona2));

            if ((persona1 == 1 && persona2 == 2) ||
                    (persona1 == 2 && persona2 == 3) ||
                    (persona1 == 3 && persona2 == 1)) {
                winJugador2++;
                System.out.println("Ganador de ronda: Jugador N°2");

            } else if (persona1 == persona2) {
                System.out.println("Empate");
            } else {
                winJugador1++;
                System.out.println("Ganador de ronda: Jugador N°1");
            }
        }


        if (winJugador1 == 2) {
            System.out.println("El ganador del juego es el Jugador 1");
        } else {
            System.out.println("El ganador del juego es el Jugador 2");


        }
    }    }
