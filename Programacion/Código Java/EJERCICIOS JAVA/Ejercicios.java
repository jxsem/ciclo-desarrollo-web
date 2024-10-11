import java.util.Objects;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        /*Verificar número par o impar*/

        System.out.println("Dime un numero entero positivo: ");
        int numero = dato.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es impar");
        }

        /*Pide al usuario que ingrese una letra y decir si es vocal o consonante.*/

        // Consumir el salto de línea después de nextInt
        dato.nextLine();

        System.out.println("Introduce una letra del abecedario: ");
        String letra = dato.nextLine().trim();
        ; // .trim para borrar espacios en blanco

        // Cuando compare cadenas en Java, no puedo usar ==,
        //sino el metodo .equals(), ya que == comprueba si ambas variables apuntan al mismo objeto,
        //  mientras que .equals() compara el contenido de las cadenas.

        if (letra.length() == 1) {
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                // Significa que si letra.esiguala("a") O letra.esiguala("e") O letra.esiguala("i")......
                System.out.println("La letra " + letra + "es una vocal");
            } else {
                System.out.println("La letra " + letra + " es una consonante");
            }
        }
        /*Escribe un programa que pida al usuario que introduzca un año.
        Luego, verifica si el año es bisiesto o no. Un año es bisiesto si cumple con las siguientes condiciones:
           Es divisible por 4.
           No es divisible por 100, a menos que también sea divisible por 400.*/
        System.out.println("Introduce un año: ");
        int year = dato.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Si es divisible por 100, verifica si también es divisible por 400
                if (year % 400 == 0) {
                    System.out.println("El año es bisiesto");
                } else {
                    // Si NO es divisible por 400, NO es bisiesto
                    System.out.println("El año no es bisiesto");
                }
            } else {
                // Si NO es divisible por 100, ES BISIESTO
                System.out.println("El año es bisiesto");
            }
        } else {
            // Si no es divisible por 4, NO ES BISIESTO
            System.out.println("El año no es bisiesto");
        }


        /*Escribe un programa que pida al usuario que introduzca la calificación de un estudiante
            (de 0 a 100) y determine la calificación en letras según la siguiente escala:

            A: 90 a 100
            B: 80 a 89
            C: 70 a 79
            D: 60 a 69
            F: Menos de 60*/
        System.out.println("Introduzca su nota: ");
        byte calificacion = dato.nextByte();

        if (calificacion < 0 || calificacion > 100) { // calificacion menor a 0 ó calificacion mayor a 101
            System.out.println("Entrada inválida");
        } else if (calificacion >= 90) {
            System.out.println("Calificación A");
        } else if (calificacion >= 80){
            System.out.println("Calificacion B");
        } else if (calificacion >= 70){
            System.out.println("Calificacion C");
        } else if (calificacion >= 60){
            System.out.println("Calificacion D");
        }else
            System.out.println("Calificacion F");
    }
}