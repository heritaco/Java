import java.util.Scanner;

public class C2_Main2 {
    public static void main(String[] args) { // Define el método principal que se ejecuta cuando se inicia tu programa.
                                             // Los argumentos de la línea de comandos se pasan a este método en el
                                             // array de Strings args.

        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner que lee de la entrada estándar (System.in,
                                                  // que es normalmente el teclado).

        System.out.print("¿Cuántos números quieres introducir? "); // Imprime "¿Cuántos números quieres introducir? " en
                                                                   // la consola.
        int numNumeros = scanner.nextInt(); // Lee un número entero de la entrada del usuario y lo almacena en la
                                            // variable numNumeros.

        scanner.close(); // Cierra el objeto Scanner.

        double[] numeros = new double[numNumeros]; // Crea un array de números de punto flotante (double) con una
                                                   // longitud igual al número de números que el usuario quiere
                                                   // introducir.

        for (int i = 0; i < numNumeros; i++) { // Inicia un bucle que se ejecuta desde i = 0 hasta i < numNumeros.
            System.out.print("Introduce el número " + (i + 1) + ": "); // Imprime "Introduce el número " seguido del
                                                                       // número de iteración actual (i + 1) en la
                                                                       // consola.
            numeros[i] = scanner.nextDouble(); // Lee un número de punto flotante de la entrada del usuario y lo
                                               // almacena en la posición i del array numeros.
        } // Fin del bucle for.

        double media = calcularMedia(numeros); // Llama al método calcularMedia, pasándole el array numeros, y almacena
                                               // el resultado en la variable media.
        double maximo = calcularMaximo(numeros); // Llama al método calcularMaximo, pasándole el array numeros, y
                                                 // almacena el resultado en la variable maximo.
        double varianza = calcularVarianza(numeros, media); // Llama al método calcularVarianza, pasándole el array
                                                            // numeros y la media, y almacena el resultado en la
                                                            // variable varianza.

        System.out.println("La media de los números introducidos es " + media); // Imprime "La media de los números
                                                                                // introducidos es " seguido de la media
                                                                                // en la consola.
        System.out.println("El número más grande introducido es " + maximo); // Imprime "El número más grande
                                                                             // introducido es " seguido del máximo en
                                                                             // la consola.
        System.out.println("La varianza de los números introducidos es " + varianza); // Imprime "La varianza de los
                                                                                      // números introducidos es "
                                                                                      // seguido de la varianza en la
                                                                                      // consola.
    } // Fin del método main.

    public static double calcularMedia(double[] numeros) { // Declara un método estático que toma un array de números de
                                                           // punto flotante como argumento y devuelve un número de
                                                           // punto flotante.
        double suma = 0; // Inicializa una variable suma a 0.

        for (double numero : numeros) { // Inicia un bucle for-each que recorre cada número en el array numeros.
            suma += numero; // Suma el número actual a la suma.
        } // Fin del bucle for-each.

        return suma / numeros.length; // Devuelve la suma dividida por la longitud del array numeros (es decir, la
                                      // media de los números en el array).
    } // Fin del método calcularMedia.

    public static double calcularMaximo(double[] numeros) { // Declara un método estático que toma un array de números
                                                            // de punto flotante como argumento y devuelve un número de
                                                            // punto flotante.
        double maximo = numeros[0]; // Inicializa una variable maximo al primer número en el array numeros.

        for (double numero : numeros) { // Inicia un bucle for-each que recorre cada número en el array numeros.
            if (numero > maximo) { // Si el número actual es mayor que el máximo actual...
                maximo = numero; // ...actualiza el máximo al número actual.
            } // Fin de la declaración if.
        } // Fin del bucle for-each.

        return maximo; // Devuelve el máximo.
    } // Fin del método calcularMaximo.

    public static double calcularVarianza(double[] numeros, double media) { // Declara un método estático que toma un
        // array de números de punto flotante y un número de punto flotante como
        // argumentos
        // y devuelve un número de punto flotante.
        double suma = 0; // Inicializa una variable suma a 0.

        for (double numero : numeros) { // Inicia un bucle for-each que recorre cada número en el array numeros.
            suma += Math.pow(numero - media, 2); // Suma el cuadrado de la diferencia entre el número actual y la media
            // a la suma.
        } // Fin del bucle for-each.

        return suma / numeros.length; // Devuelve la varianza.
    } // Fin del método calcularVarianza.
} // Fin de la clase Main2.