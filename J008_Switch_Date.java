import java.time.LocalDate;
import java.time.DayOfWeek;

public class J008_Switch_Date {

    public static void main(String[] args) {

        // switch = statement that allows a variable to be tested for equality against a
        // list of values

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String day = dayOfWeek.name();

        switch (day) {
            case "SUNDAY":
            case "FRIDAY":
            case "SATURDAY":
                System.out.println("Descana, panza!");
                break;
            case "MONDAY":
            case "WEDNESDAY":
                System.out.println("Clase de AI a las 10 D:");
                break;
            case "THURSDAY":
            case "TUESDAY":
                System.out.println("Hoy entras a las 7");
                break;
        }
    }
}
