import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Lector de datos de entrada
        Scanner scanner = new Scanner(System.in);

        //================ PIDIENDO DATOS ================
        //Tamaño del tablero
        System.out.print("Ingresa las columnas del tablero: ");
        int tableroColumnas = scanner.nextInt();
        System.out.print("Ingresa las filas del tablero: ");
        int tablefroFilas = scanner.nextInt();
        if (tableroColumnas < 4 || tablefroFilas < 3 ){
            System.out.println("El tablero debe ser de un tamaño mínimo de 4 x 3");
            System.exit(0);
        }

        //Datos para jugabilidad
        System.out.print("Ingresa tu modo de juego:\n 1. Un solo jugador.\n 2. Dos jugadores.\n Opcion: ");
        int modoJuego = scanner.nextInt();
        if (modoJuego != 1 && modoJuego != 2){
            System.out.println("Opción incorrecta");
            System.exit(0);
        }
        System.out.println("Cuantos barcos quieres:");
        int nbarcos = scanner.nextInt();
        if (nbarcos < 2){
            System.out.println("El numero mínimo de barcos es de 2");
            System.exit(0);
        }

        //================ IMPRIMIENDO TABLERO ================

        //Imprimiendo fila numero del tableroColumnas
        for (int i = 1; i <= tableroColumnas; i++) {
            // Si i <= 1 se concatenará un espacio en blanco para distinguir la fila numerica con la columna
            if (i <= 1) {
                System.out.print("  ");
            }
            //Si i tiene un digito se concatena un 0
            if (i < 10) {
                System.out.print("0");
            }
            System.out.print(i + " ");
            if (i == tableroColumnas) {
                System.out.println("");
            }

        }
        //Imprimiendo columnas y relleno de filas
        for (int i = 1; i <= tablefroFilas; i++) {
            for (int j = 1; j <= tablefroFilas; j++) {
                if (j <= 1) {
                    // Si i es de solo un dígito se le concatena un 0
                    if (i < 10) {
                        System.out.print("0");
                    }
                    System.out.print(i + " ");
                }

                // Imprimiendo casillas de tablero dependiendo la diferencia entre columnas y filas
                if (tableroColumnas == tablefroFilas) {
                    System.out.print("*" + "  ");
                }
                if (tableroColumnas > tablefroFilas) {
                    System.out.print("*" + "  ");
                    if (j == tablefroFilas) {
                        int dif = tableroColumnas - tablefroFilas;
                        for (int k = 1; k <= dif; k++) {
                            System.out.print("*" + "  ");
                        }
                    }
                } else {
                    if (j == tablefroFilas) {
                        int dif = tablefroFilas - tableroColumnas;
                        for (int k = 1; k <= dif; k++) {
                            System.out.print("*" + "  ");
                        }
                    }
                }
            }
            //Salto de fila
            System.out.println("");
        }

        //================ JUGABILIDAD ================
        int nCasillas = tableroColumnas * tablefroFilas;

        if (modoJuego == 1){
            // Coordenadas random
            int randomY = (int)(Math.random()*nCasillas+1);
            int randomX = (int)(Math.random()*nCasillas+1);

            //Aisgnando barcos jugador 1
            int[] posicionYp1 = new int[nbarcos];
            int[] posicionXp1 = new int[nbarcos];

            //Almacenando posiciones del jugador 1
            System.out.println("Turno de que el jugador 1 asigne sus barcos");
            for (int i = 1; i <= nbarcos; i++){
                System.out.println("Asigna posición barco " + i);
                System.out.print("Posición Y: ");
                posicionYp1[i - 1] = scanner.nextInt();
                // Verificamos que sus coordenadas existan
                if (posicionYp1[i - 1] > tablefroFilas){
                    System.out.println("Tu coordenada Y no existe, intenta de nuevo:");
                    posicionYp1[i - 1] = scanner.nextInt();
                }
                System.out.print("Posición X: ");
                posicionXp1[i - 1] = scanner.nextInt();
                if (posicionXp1[i - 1] > tableroColumnas){
                    System.out.println("Tu coordenada X no existe, intenta de nuevo:");
                    posicionXp1[i - 1] = scanner.nextInt();
                }
            }
            // Mostrando posiciones del jugador 1
            for (int i = 1; i <= nbarcos; i++){
                System.out.println("Posición barco " + i + " Y:" + posicionYp1[i - 1] + " X:" + posicionXp1[i - 1]);
            }

            //Aisgnando barcos jugador 2 (PC)
            int[] posicionYp2 = new int[nbarcos];
            int[] posicionXp2 = new int[nbarcos];

            //Almacenando posiciones del jugador 2
            System.out.println("Turno de que el jugador 2 asigne sus barcos");
            for (int i = 1; i <= nbarcos; i++){
                posicionYp2[i - 1] = (int)(Math.random()*tablefroFilas+1);
                posicionXp2[i - 1] = (int)(Math.random()*tableroColumnas+1);
            }

            // Mostrando posiciones del jugador 2
            for (int i = 1; i <= nbarcos; i++){
                System.out.println("Posición barco " + i + " Y:" + posicionYp2[i - 1] + " X:" + posicionXp2[i - 1]);
            }

            //ADIVINANDO BARCOS
            boolean estadoPartida = false;
            int[] jugadorYp1 = new int[nCasillas];
            int[] jugadorXp1 = new int[nCasillas];
            int[] jugadorYp2 = new int[nCasillas];
            int[] jugadorXp2 = new int[nCasillas];

            int i = 0;
            int puntajeP1 = 0;
            int puntajeP2 = 0;

            while (!estadoPartida) {
                System.out.println("Es momento de jugar!!!\nTurno del jugador 1\nIngresa las coordenadas a derribar");
                System.out.print("Y:");
                jugadorYp1[i] = scanner.nextInt();
//                System.out.println(jugadorYp1[i]);
                System.out.print("X:");
                jugadorXp1[i] = scanner.nextInt();
//                System.out.println(jugadorXp1[i]);

                if (jugadorYp1[i] == posicionYp2[i] && jugadorXp1[i] == posicionXp2[i]){
                    System.out.println("¡BOOOOMM! Barco derrivado");
                    puntajeP1++;

                    if (puntajeP1 == nbarcos){
                        System.out.println("¡¡FELICIDADES!! Jugador 1 ha ganado");
                        System.out.println("Gracias por jugar");
                        estadoPartida = true;
                    }
                }

                System.out.println("Es turno del jugador 2\n Ingresa las coordenadas a derribar");
                jugadorYp2[i] = (int)(Math.random()*tablefroFilas+1);
                jugadorXp2[i] = (int)(Math.random()*tableroColumnas+1);
                System.out.println("El segundo jugador tiró en Y:" + jugadorYp2[i] + " y en X:" + jugadorXp2[i]);
                if (jugadorYp2[i] == posicionYp1[i] && jugadorXp2[i] == posicionXp1[i]){
                    System.out.println("¡BOOOOMM! Barco derrivado");
                    puntajeP2++;

                    if (puntajeP2 == nbarcos){
                        System.out.println("¡¡FELICIDADES!! Jugador 2 ha ganado (te ganó una maquina xd)");
                        System.out.println("Gracias por jugar");
                        estadoPartida = true;
                    }
                }

                i++;
            }


//            int[] intentosY = new int[nCasillas - 1];
//            int[] intentosX = new int[nCasillas - 1];
//            int i = 0;
//            while(!estadoPartida){
//                System.out.print("Turno jugador 1.\n Ingres tu eje y:");
//                intentosY[i] = scanner.nextInt();
//                System.out.print("Ingres tu eje x:");
//                intentosX[i] = scanner.nextInt();
//
//                System.out.println("Eje y:" + String.valueOf(intentosY[i]) + " Eje x:" +  String.valueOf(intentosX[i]));
//                if (i == nbarcos) {
//                    estadoPartida = true;
//                }
//                i++;
//            }


            System.out.println("Modo 1 solo jugador");
//            int[] array = new int[10];
//            for (int i = 0; i <= 9; i++){
//                array[i] = i;
//                System.out.println(array[i]);
//            }

        } else {

            System.out.println("Modo 2 juagadores");

        }





        //Cuadrado relleno
//        for(int i = 1; i <= tablero; i++){
//            for(int j = 1; j <= tablero; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //Cuadrado vacio
//        for(int i = 1; i <= tablero; i++){
//            for(int j = 1; j <= tablero; j++){
//                if (i == 1 || i == tablero ||
//                        j == 1 || j == tablero)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.print("\n");
//        }

    }
}