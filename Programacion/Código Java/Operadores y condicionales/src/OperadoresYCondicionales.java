import java.util.Scanner;

public class OperadoresYCondicionales {
    public static void main(String[] args) {
        /*Operadores Logicos*/
        /*Operador AND &&
         * Operador OR ||
         * Operador NOT !*/

        /*Operador relacionales
         * Igual ==
         * Distinto !=
         * Mayor que >
         * Menor que <*/

        /* ENTRADA DE DATOS */

        // Crear un objeto Scanner para leer la entrada desde el teclado Scanner nombreScaner = new Scanner(System.in);
        Scanner dato = new Scanner(System.in);

        // Leer un dato de tipo String
        System.out.print("Introduce tu nombre: ");
        String nombre = dato.nextLine(); // Leer una línea de texto, texto entrando del usuario

        // Leer un dato de tipo int
        System.out.print("Introduce tu edad: ");
        int edad = dato.nextInt(); // Leer un entero

        // Mostrar los datos ingresados
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        // Cerrar el Scanner
        dato.close();


        /* CONDICIONALES IF Y ELSE */

                /* if (condición) {
            // Código si la condición es verdadera
        } else {
            // Código si la condición es falsa
        } */

        /*EJEMPLO DE USO IF ELSE */

                /*int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        */

        int nota = 85;

        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 75) {
            System.out.println("Notable");
        } else {
            System.out.println("Aprobado");
        }

    }
}




