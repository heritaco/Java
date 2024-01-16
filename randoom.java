import java.util.Random;

public class randoom {

    public static void main(String[] args) {

        Random random = new Random();

        int randomint = random.nextInt();
        System.out.println(randomint);

        int randomintmenora5 = random.nextInt(5);
        System.out.println(randomintmenora5);

        double entreceroyuno = random.nextDouble();
        System.out.println(entreceroyuno);

        // tambien se puede con boolean
    }
}
