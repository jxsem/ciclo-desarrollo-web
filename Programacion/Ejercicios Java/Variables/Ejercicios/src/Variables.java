import java.util.Scanner;

public class Variables{

    public static void main(String[] args) {
        /*Declara variables para almacenar la siguiente información:

        Nombre de una persona (tipo String)
        Edad (tipo int)
        Altura en metros (tipo double)
        ¿Es estudiante? (tipo boolean)*/

        String nombre = "Pedro";
        int numero = 23;
        double altura = 1.67;
        boolean estudiante = true;
        System.out.println(nombre + " Tiene" + " " + numero + " años y mide" + " " + altura + " centimetros" + " y es estudiante" + " " + estudiante);

        /*Declara las siguientes variables:

        precioProducto1 (tipo double)
        precioProducto2 (tipo double)
        cantidadProducto1 (tipo int)
        cantidadProducto2 (tipo int)
        impuesto (tipo double, por ejemplo 0.21 para un 21% de IVA)

        Calcula lo siguiente:

        El precio total sin impuesto para ambos productos.
        El total de impuestos a pagar.
        El precio total con impuesto incluido.*/

        double precioProducto1 = 1.25;
        double precioProducto2 = 3.45;
        int cantidadProducto1 = 6;
        int cantidadProducto2 = 3;
        double impuesto = 0.21;

        /*CAlCULOS*/
        double totalSinImpuestos = (precioProducto1 * cantidadProducto1) + (precioProducto2 * cantidadProducto2);
        double totalImpuestos = totalSinImpuestos * impuesto;
        double totalConImpuestos = totalSinImpuestos + totalImpuestos;

        System.out.println("El precio total de los productos SIN IVA es de un total de " + totalSinImpuestos);
        System.out.println("El precio total de los IMPUESTOS es de un total de " + totalImpuestos );
        System.out.println("El precio total de los productos CON IVA es de un total de " + totalConImpuestos);

        /*Ejercicio 4: Categoría de edad
        Descripción: Pide al usuario que ingrese su edad y determina su categoría (niño, adolescente, adulto, anciano).*/

        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        byte edad = dato.nextByte();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Eres un niño.");
        } else if (edad >= 13 && edad <= 19) {
            System.out.println("Eres un adolescente.");
        } else if (edad >= 20 && edad <= 64) {
            System.out.println("Eres un adulto.");
        } else if (edad >= 65) {
            System.out.println("Eres un anciano.");
        } else {
            System.out.println("Edad no válida.");
        }
    }

}