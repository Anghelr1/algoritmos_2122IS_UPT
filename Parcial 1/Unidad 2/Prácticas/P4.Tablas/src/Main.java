import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //For: Inicio de un proseco hasta definir un límite
        //x<=10 condicion a cumplir para que entre
        //x++ Es para incrementar el valor de una varible numérica
        //While: Proceso condicionado para su realizacion.
        //Metodo: acciones que realiza un objeto
        //import Java Utils Scanner
        //Scanner leer = new Scanner(System.in);
        //int ok = leer.nexint();

        /*
        int x=0;
        int z=0;

        for(x=0; x<=3; x++){
            System.out.println("Hola mundo " + x);
        }

        while(z<=3){
            System.out.println("asd");
            z++;
        }

         */

        System.out.println("==========Ingresa el número a multiplicar==========");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        System.out.println("==========Ingresa el número máximo a multiplicar==========");
        int multiplo = leer.nextInt();

        for(int valor=1; valor<=multiplo; valor++){
            int result=0;
            result = numero*valor;
            System.out.printf(numero + " x " + valor + " = " + result + "\n");
        }


    }
}