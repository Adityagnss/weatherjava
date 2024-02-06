import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\tWelcome to the Weather Forecaster!\n\n");
        System.out.println("Just Enter the City you want the weather report for and click on the button! It's that simple!\n\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the City : ");
        String city_name = scanner.nextLine();
        System.out.println("\n\n");

        genReport(city_name);
    }

    public static void genReport(String C) {
        String url = "https://wttr.in/" + C;
        try {
            Scanner scanner = new Scanner(new URL(url).openStream());
            String T = scanner.useDelimiter("\\A").next();
            scanner.close();
            System.out.println(T);
        } catch (IOException e) {
            System.out.println("Error Occurred");
        }
    }
}