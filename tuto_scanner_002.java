import java.util.Scanner;

public class tuto_scanner_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu mmm dedo del pie favorito? ");
        String dedo = scanner.nextLine();
        System.out.print("Que rico, el " + dedo + " es mi favorito también!");

        System.out.print("¿Cuántos dedos has comido hoy? ");
        int numDedos = scanner.nextInt();
        scanner.nextLine(); // necesitamos poner este despues del int para introducir un string despues de
                            // un int
        System.out.println("¡" + numDedos + " dedos! ¡Qué envidia! ¡Eres un monstruo!");

        System.out.println("¿A qué sabe el " + dedo + "?");
        String sabor = scanner.nextLine();
        System.out.println("¡" + sabor + "! ¡Qué rico! ¡Me encanta el sabor del " + dedo + "!");
        scanner.close();
    }
}
