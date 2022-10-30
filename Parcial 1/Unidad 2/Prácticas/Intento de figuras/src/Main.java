import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa la base del triangulo:");
        int base = lector.nextInt();

        System.out.println("Triangulo");
        //Triangulo
        for (int i = 0; i < base; i++) {
            int nbase = ((base + 1) - (base - i));
            for (int j = 0; j < base - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nbase; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < nbase; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
//        for (int i = 0; i < base; i++) {
//            int nbase = ((base + 1) - (base - i));
//            for (int j = 0; j < nbase; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


        System.out.println("Cuadrado");
        //Cuadrado
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        System.out.println("Rombo");
        //Rombo
        for (int i = 0; i < base; i++) {
            int nbase = ((base + 1) - (base - i));
            for (int j = 0; j < base - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nbase; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < nbase; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int i = 0; i < base; i++) {
            int nbase = ((base - 1) - i);
            for (int j = 0; j < base - nbase; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nbase; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < nbase; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
