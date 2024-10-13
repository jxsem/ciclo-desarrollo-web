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
        Luego, imprime el mayor de los tres números.

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
        /*SWITCH CASE*/

        /*El switch-case es útil cuando tienes una variable y quieres comparar su valor con diferentes opciones.*/
         //Es ideal para SITUACIONES DONDE TIENES MUCHAS CONDICIONES if-else anidadas basadas en el valor de una sola variable.

            System.out.println("Selecciona un numero de la semana");
            int dia = dato.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                default:
                    System.out.println("Fin de semana");
                    break;
            }

                /*ESTRUCTURA*/

                /*tipovariable (nombrevariable) = valor

                * switch (nombrevariable{
                *   case (valorvariable)
                *       System out print("Valor por terminal")
                    case (valorvariable)
                        System out print("Valor terminal)
                *       break;})*/

                /*Calculadora básica:
                Crea un programa que solicite dos números y una operación (+, -, *, /).
                Utiliza un switch case para realizar la operación correspondiente y mostrar el resultado.*/

                System.out.println("Introduce un numero entero: ");
                int entero = dato.nextInt();
                System.out.println("Introduce otro numero entero: ");
                int enteroDos = dato.nextInt();
                dato.nextLine();

                System.out.println("¿Qué tipo de operación quieres realizar: Suma, Resta, Multiplicación o División?: ");
                String instruccion = dato.nextLine();

                switch (instruccion) {
                    case ("Suma"):
                        System.out.println(entero + enteroDos);
                        break;
                    case ("Resta"):
                        System.out.println(entero - enteroDos);
                        break;
                    case ("Multiplicacion"):
                        System.out.println(entero * enteroDos);
                        break;
                    case ("Division"):
                        if (enteroDos != 0) { // se anida if y else cuando hay mas de una comprobacion dentro de un caso
                            System.out.println("Resultado: " + (entero / enteroDos));
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                        }
                    default: // es como un else
                        System.out.println("Operación no válida. Por favor, elige Suma, Resta, Multiplicacion o Division.");
                }

    }
}




