import java.util.Scanner; // Importa la clase Scanner del paquete java.util. Esta clase se utiliza para leer la entrada del usuario.

public class Main { // Declara una clase pública llamada Main. En Java, cada archivo de código
                    // fuente debe contener una clase pública que coincida con el nombre del
                    // archivo.

    public static void main(String[] args) { // Define el método principal que se ejecuta cuando se inicia tu programa.
                                             // Los argumentos de la línea de comandos se pasan a este método en el
                                             // array de Strings args.

        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner que lee de la entrada estándar (System.in,
                                                  // que es normalmente el teclado).
        scanner.close(); // Cierra el objeto Scanner.

        System.out.println("Hola Mundo"); // Imprime "Hola Mundo" en la consola.

        System.out.println("ODIO JAVA"); // Imprime "ODIO JAVA" en la consola.

        System.out.print("Por favor, introduce tu nombre: "); // Imprime "Por favor, introduce tu nombre: " en la
                                                              // consola.

        String nombre = scanner.nextLine(); // Lee una línea de entrada del usuario y la almacena en la variable nombre.

        if (nombre.equalsIgnoreCase("Java")) { // Comprueba si el nombre introducido por el usuario es "Java", ignorando
                                               // si las letras son mayúsculas o minúsculas.

            System.out.println("Oh, veo que te llamas igual que el lenguaje que estamos usando, tonoto!"); // Si el
                                                                                                           // nombre es
                                                                                                           // "Java",
                                                                                                           // imprime
                                                                                                           // este
                                                                                                           // mensaje.

        } else { // Si el nombre no es "Java"...

            System.out.println("Muere, " + nombre + "!"); // Imprime "Muere, " seguido del nombre que el usuario
                                                          // introdujo.

        } // Fin de la declaración if-else.

    } // Fin del método main.

} // Fin de la clase Main.