import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        /*Entrada de datos*/
        Scanner dato = new Scanner(System.in); // clase Scanner NombreScaner  new Scanner(System.in) la invocas

        System.out.print("Ingresa tu nombre: ");
        String nombre = dato.nextLine(); // Creas la variable para recibir el dato y esto es igual a la entrada de dato esperada nombreEscaner.datoaRecibir

        System.out.println("Hola, " + nombre + "!");



        /*Condicionales*/


        System.out.println("Ingresa tu edad: ");
        int edad = dato.nextInt();

        if (edad > 18) {
            System.out.println("Eres mayor de edad.");

        } else {
            System.out.println("Eres menor de edad.");
        }



         // Cierra el scanner para evitar fugas de recursos

        //OPERADORES

        /*  Aritméticos: +, -, *, /, %
            De comparación: ==, !=, >, <, >=, <=
            Lógicos: && (y), || (o), ! (no)         */



        /*Ejercicio 1:
        Solicita al usuario que ingrese dos números enteros.
        Si el primer número es mayor que el segundo,
        imprime "El primer número es mayor".
        En caso contrario, imprime "El segundo número es mayor o igual".*/

        System.out.println("Introduce el primer numero: ");
        int numero1 = dato.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = dato.nextInt();

        if (numero1 > numero2){
            System.out.println("El numero 1 es mayor que el numero 2");
        }
        else if (numero1 == numero2){
            System.out.println("Los numeros son iguales");
        }
        else {
            System.out.println("El numero 1 es menor que el numero 2");
        }
        /*Ejercicio 2:
        Descripción: Pide al usuario que introduzca un número entero. Si el número es par, muestra en pantalla "Es un número par".
        Si es impar, muestra "Es un número impar".*/

        System.out.println("Introduce un numero entero positivo: ");
        int numeroUsuario = dato.nextInt();

        if (numeroUsuario % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }

        /*Ejercicio 3:
        Descripción: Escribe un programa que solicite al usuario su edad.
        Si la edad es mayor o igual a 18, imprime "Eres mayor de edad".
        Si es menor de 18, imprime "Eres menor de edad".*/

        System.out.println("Introzca su edad");
        int edadUsuario = dato.nextInt();

        if (edadUsuario >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }

        /*Ejercicio 4:
        Descripción: Escribe un programa que pida al usuario que introduzca tres números.
        Luego, imprime el mayor de los tres números.*/

        System.out.println("Introduce el primer numero: ");
        int numeroUno = dato.nextInt();
        System.out.println("Introduce el primer numero: ");
        int numeroDos = dato.nextInt();
        System.out.println("Introduce el primer numero: ");
        int numeroTres = dato.nextInt();


        if (numeroUno >= numeroDos && numeroUno >= numeroTres) {
            System.out.println("El numero " + numeroUno + " es el mayor de los tres");
        } else if (numero2 >= numeroUno && numeroDos >= numeroTres) {
            System.out.println("El numero " + numeroDos + " es el mayor de los tres");
        } else {
            System.out.println("El numero " + numeroTres + " es el mayor de los tres");
        }
    }
}




