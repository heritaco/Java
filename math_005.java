public class math_005 {

    public static void main(String[] args) {

        double pi = 3.141516;
        double y = -2.61;

        double max = Math.max(pi, y);
        System.out.println(max);

        double min = Math.min(pi, y);
        double abs = Math.abs(max);
        double sqrt = Math.sqrt(abs);
        double ceil = Math.ceil(sqrt);
        double floor = Math.floor(sqrt);

        System.out.println(max + " " + min
                + " " + abs + " " + sqrt + " " + ceil
                + " " + floor);
    }
}
