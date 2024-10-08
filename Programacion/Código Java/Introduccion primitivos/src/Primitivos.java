public class Primitivos {
    public static void main(String[] args) {
        /*Los primitivos son datos escalares que contienen solo un valor*/
        /*Java es de tipado estatico, es decir tenemos que definir el tipo de dato en
        * la vaiable*/

        /*Enteros, flotantes (precision simple y doble), caracteres y booleanos*/
        /*El tipo de dato se escribe completamente en minuscula*/

        /*Boleano Tipo simple de un solo bit, expresa valor verdadero o falso*/
        boolean a = false;
        boolean b = true;

        /*Char usa el codigo UNICODE y ocupa cada caracter 16 bit*/
        char c = '\u0021';

        /*Primitivos (numeros enteros) difieren en las precisiones y en los tipos de datos que queramos usar*/
        byte enteroByte = 127;
        short enteroShort = 32767;
        int enteroInt = 2147483647;
        long enteroLong = 9223372036854775807L;

        /*Primitivos (numeros reales)*/
        float realFloat = 3.1416f;
        double realDouble = 4.7029235E3;

        byte numeroByte = 127;
        System.out.println(numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("valor maximo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("valor maximo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("valor maximo de un int " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L; /*Introducir letra L para evitar confictlo y conviertes a un tipo LONG*/
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("valor maximo de un long " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775808F; /*var es palabra reservada para asignar valor a una variable, podemos usarla
                                              para crear lo mismo que arriba, usamos letras para decir si es Double, Float, Long...*/

    }



}
