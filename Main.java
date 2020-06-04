import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner scanner = new Scanner(System.in);
        PlaneList planeList = new PlaneList();
        Flight flight = new Flight();
        TextUserInterface ui = new TextUserInterface(scanner, planeList, flight);

        ui.start();







    }
}
