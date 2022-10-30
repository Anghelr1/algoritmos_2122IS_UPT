import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class Arraylist {
    public static void main(String[] args) {
// Lector de datos de entrada
        Scanner scanner = new Scanner(System.in);

        //================ PIDIENDO DATOS ================
        //Tamaño del tablero
        System.out.print("Ingresa las columnas del tablero: ");
        int tableroColumnas = scanner.nextInt();
        System.out.print("Ingresa las filas del tablero: ");
        int tableroFilas = scanner.nextInt();
        if (tableroColumnas < 4 || tableroFilas < 3) {
            System.out.println("El tablero debe ser de un tamaño mínimo de 4 x 3");
            System.exit(0);
        }

        //Datos para jugabilidad
        System.out.print("Ingresa tu modo de juego:\n 1. Un solo jugador.\n 2. Dos jugadores.\n Opcion: ");
        int modoJuego = scanner.nextInt();
        if (modoJuego != 1 && modoJuego != 2) {
            System.out.println("Opción incorrecta");
            System.exit(0);
        }
        System.out.println("Cuantos barcos quieres:");
        int nbarcos = scanner.nextInt();
        if (nbarcos < 2) {
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
        for (int i = 1; i <= tableroFilas; i++) {
            for (int j = 1; j <= tableroColumnas; j++) {
                if (j <= 1) {
                    // Si i es de solo un dígito se le concatena un 0
                    if (i < 10) {
                        System.out.print("0");
                    }
                    System.out.print(i + " ");
                }
                System.out.print("*" + "  ");
            }
            //Salto de fila
            System.out.println("");
        }

        //================ JUGABILIDAD ================
        int nCasillas = tableroColumnas * tableroFilas;

        if (modoJuego == 1) {

            //Posiciones barcos jugador 1
            ArrayList<Integer> posicionP1Y = new ArrayList<Integer>();
            ArrayList<Integer> posicionP1X = new ArrayList<Integer>();
            System.out.println("Jugador 1, Ingresa la posicion de tus barcos");
            for (int i = 1; i <= nbarcos; i++) {
                System.out.println("Barco " + i + " ingresa:");
                System.out.print("Y:");
                posicionP1Y.add(i - 1, scanner.nextInt());
                System.out.print("X:");
                posicionP1X.add(i - 1, scanner.nextInt());
            }
            System.out.print(posicionP1Y + " " + posicionP1X);


            // Posiciones Jugador 2 (Maquina)
            ArrayList<Integer> posicionP2Y = new ArrayList<>();
            ArrayList<Integer> posicionP2X = new ArrayList<>();
            System.out.println("\nJugador 2, Ingresa la posicion de tus barcos");
            for (int i = 1; i <= nbarcos; i++) {
                posicionP2Y.add(i - 1, (int) (Math.random() * tableroColumnas + 1));
                posicionP2X.add(i - 1, (int) (Math.random() * tableroFilas + 1));
            }
            Iterator<Integer> iteratorY = posicionP2Y.iterator();
            Iterator<Integer> iteratorX = posicionP2X.iterator();
            int j = 1;
            while (iteratorY.hasNext() && iteratorX.hasNext()) {
                System.out.println("Juagor 2 ingresó:");
                System.out.println("Barco " + j);
                System.out.println("Y: " + iteratorY.next());
                System.out.println("X: " + iteratorX.next());

                j++;
            }
            System.out.print(posicionP2Y + " " + posicionP2X);

            //ADIVIDAR Y JUGAR
            //DATOS JUGADOR 1
            ArrayList<Integer> tiradaP1Y = new ArrayList<>();
            ArrayList<Integer> tiradaP1X = new ArrayList<>();
            int puntajeP1 = 0;
            //DATOS JUGADOR 2
            ArrayList<Integer> tiradaP2Y = new ArrayList<>();
            ArrayList<Integer> tiradaP2X = new ArrayList<>();
            int puntajeP2 = 0;


            System.out.println("\n!!HORA DE JUGAR");
            boolean estadoJuego = false;
            int i = 0;
            while (!estadoJuego) {
                if (!estadoJuego) {
                    System.out.println("Turno jugador 1");
                    System.out.println("Ingresa las coordenadas del barco a derribar:");
                    System.out.print("Y:");
                    tiradaP1Y.add(i, scanner.nextInt());
                    System.out.print("X:");
                    tiradaP1X.add(i, scanner.nextInt());
                    if (posicionP2Y.contains(tiradaP1Y.get(i)) && posicionP2X.contains(tiradaP1X.get(i))) {
                        System.out.println("¡¡BOOOMMMM!!! Barco derribado por jugador 1");
                        puntajeP1++;
                        System.out.println("Puntaje acutual: " + puntajeP1 + "/" + nbarcos);

                        if (puntajeP1 == nbarcos) {
                            System.out.println("¡¡¡FELICIDADESS!!!! Jugador 1 ha ganado");
                            estadoJuego = true;
                        }
                    }
                }

                if (!estadoJuego) {
                    System.out.println("Turno jugador 2");
                    tiradaP2Y.add(i, (int) (Math.random() * tableroColumnas + 1));
                    System.out.println("Jugador 2 tiró en Y: " + tiradaP2Y.get(i));
                    tiradaP2X.add(i, (int) (Math.random() * tableroFilas + 1));
                    System.out.println("Jugador 2 tiró en X: " + tiradaP2X.get(i));
                    if (posicionP1Y.contains(tiradaP2Y.get(i)) && posicionP1X.contains(tiradaP2X.get(i))) {
                        System.out.println("¡¡BOOOMMMM!!! Barco derribado por jugador 2");
                        puntajeP2++;
                        System.out.println("Puntaje acutual: " + puntajeP2 + "/" + nbarcos);

                        if (puntajeP2 == nbarcos) {
                            System.out.println("¡¡¡FELICIDADESS!!!! Jugador 2 ha ganado");
                            estadoJuego = true;
                        }
                    }
                }
                i++;
            }


        } else {
            System.out.print("Modo 2 juagadores");
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
