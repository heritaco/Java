public class J001_Tuto1 {
    public static void main(String[] args) {
        int x = 123;
        double pi = 3.14159265359;
        float e = 2.7182818284590452353602874713527f; // se opne una f al final para indicar que es float
        boolean si = true;
        char arroba = '@'; // se guardan con comillas simples
        String name = "Bro"; // se guardan con comillas dobles

        System.out.println("HOLA " + arroba + name + "!" + " " + e);
        System.out.println(x + pi);
        System.out.println(si);

        String mario = "mario";
        String luigi = "luigi";

        System.out.println(mario);
        System.out.println(luigi);
        String temp; // temporal value

        temp = luigi;
        luigi = mario; // el segundo valor lo absorve
        mario = temp;

        System.out.println(mario);
        System.out.println(luigi);
    }
}
