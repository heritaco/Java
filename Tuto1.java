public class Tuto1 {
    public static void main(String[] args) {
        int x = 123;
        double pi = 3.14159265359;
        boolean si = true;
        char arroba = '@';
        String name = "Bro";

        System.out.println("HOLA " + arroba + name + "!");
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
