public class Main {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 10;
        int suma = n1 + n2;
        int resta = n1 - n2;
        int division = n1 / n2;
        int multiplicacion = n1 * n2;
        String Nombre = "Anghel";
        int edad = 6;

        System.out.println("La suma de los valores es: " + suma);
        System.out.println("La resta de los valores es: " + resta);
        System.out.println("La division de los valores es: " + division);
        System.out.println("La multiplicacón de los valores es: " + multiplicacion);
        System.out.println(Nombre);

        if(n1 < n2){
            System.out.println("El primer valor es menor a el segundo valor");
        }
        else{
            System.out.println("El primer valor es mayor al segundo");
        }

        if(edad <=1){
            System.out.println("Aún eres un bebe");
        } else if (edad <= 12) {
            System.out.println("Ya eres un niño");
        } else if (edad <= 17) {
            System.out.println("Eres un puberto");
        } else if (edad <= 27) {
            System.out.println("Eres un joven");
        } else if (edad >= 28) {
            System.out.println("Eres un adulto");
        }

    }
}