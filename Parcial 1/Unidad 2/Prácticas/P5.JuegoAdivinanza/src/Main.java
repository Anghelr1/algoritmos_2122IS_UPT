import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("==========Ingresa el número a multiplicar==========");
//        Scanner leer = new Scanner(System.in);
//        int numero = leer.nextInt();
//        System.out.println("==========Ingresa el número máximo a multiplicar==========");
//        int multiplo = leer.nextInt();

        int random = (int) (Math.random() * 10 + 1);
        boolean estado = false;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa el numero de intentos que deseas: ");
        int intentos = lectura.nextInt();

        while(!estado){
            for(int i = 0; i <= intentos; i++){
                System.out.println("Ingresa tu intento " + i + ":");
                int n = lectura.nextInt();
                if (n == random){
                    System.out.println("Felicidades Ganaste");
                    estado = true;
                    intentos = i;
                } else {
                    System.out.println("Intento " + i + " fallido");
                    if (i == intentos){
                        System.out.println("Perdiste el juego.");
                    }
                }
            }
        }




    }
}