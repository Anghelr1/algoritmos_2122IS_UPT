import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Lector de datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Tamaño arreglo
        System.out.print("Ingresa las columnas del tablero: ");
        int tablero = scanner.nextInt();
        System.out.print("Ingresa las filas del tablero: ");
        int tableroFilas = scanner.nextInt();

        //Imprimiendo fila numero del tablero
        for (int i = 1; i <= tablero; i++){
            // Si i <= 1 se concatenará un espacio en blanco para distinguir la fila numerica con la columna
            if (i <= 1 ){
                System.out.print("  ");
            }
            //Si i tiene un digito se concatena un 0
            if (i < 10){
                System.out.print("0");
            }
            System.out.print(i + " ");
            if (i == tablero){
                System.out.println("");
            }

        }
        //Imprimiendo columnas y relleno de filas
        for (int i = 1; i <= tableroFilas; i++){
            for (int j = 1; j <= tableroFilas; j++) {
                if (j <= 1){
                    // Si i es de solo un dígito se le concatena un 0
                    if ( i < 10){
                        System.out.print("0");
                    }
                    System.out.print(i + " " );
                }
                // Imprimiendo el relleno del tablero
                //Imprimiendo diferencia si hay mas columnas que filas
                if (j == tableroFilas){
                    //Sacando diferencia entre el numero de columnas y filas
                    int dif = tablero - tableroFilas;
                    //Imprimiendo la diferencia
                    if (tableroFilas < tablero){
                        for(int k = 1; k <= dif; k++){
                            System.out.print("*" + "  ");
                        }
                    }
                }
                if (j == tablero){
                    if (tablero < tableroFilas){
                        int dif = tableroFilas - tablero;
                        for (int k = 1; k <= dif; k++){
                            System.out.print("*" + "  ");
                        }
                    }
                    if (tablero > tableroFilas){
                        System.out.print("*" + "  ");
                    }
                }

            }
            //Salto de fila
            System.out.println("");

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