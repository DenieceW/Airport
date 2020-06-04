import java.util.Scanner;

public class TextUserInterface {
    Scanner scanner;
    PlaneList planeList;
    Flight flight;

    public TextUserInterface(Scanner scanner, PlaneList planeList, Flight flight){
        this.scanner = scanner;
        this.planeList = planeList;
        this.flight = flight;
    }

    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        while(true){
            airportPanelStartMenu();
            String userInput = scanner.nextLine();
            if(userInput.equals("x")){
                break;
            }
            handleStatementForAirportPanel(userInput);
        }
        System.out.println("");
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");

        while (true){
            flightServiceStartMenu();
            String userInput = scanner.nextLine();
            if(userInput.equals("x")){
                break;
            }
            handleStatementForFlightService(userInput);
        }
    }

    public void handleStatementForAirportPanel(String userInput){
        if(userInput.equals("1")){
            addAirplane();
        }else if (userInput.equals("2")){
            addFlight();
        }
    }

    public void handleStatementForFlightService(String userInput){
        if(userInput.equals("1")){
            printPlanes();
        }else if (userInput.equals("2")){
            printFlights();
        }else if (userInput.equals("3")){
            printPlaneInfo();
        }
    }

    public void addAirplane(){
        System.out.print("Give plane ID: ");
        String planeID = scanner.nextLine().toUpperCase();
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(scanner.nextLine());
        this.planeList.addPlaneToList(new Plane(planeID, planeCapacity));
    }

    public void addFlight(){
        System.out.print("Give plane ID: ");
        String planeID = scanner.nextLine().toUpperCase();
        System.out.print("Give departure airport code: ");
        String departureCode = scanner.nextLine().toUpperCase();
        System.out.print("Give destination airport code: ");
        String destinationCode = scanner.nextLine().toUpperCase();
        this.flight.addFlight("(" + departureCode + "-" + destinationCode + ")", this.planeList.getPlane(planeID));
    }

    public void printPlanes(){
       planeList.printPlaneList();
    }

    public void printFlights(){
        flight.printFlights();

    }

    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String planeID = scanner.nextLine().toUpperCase();
        this.planeList.printPlane(planeID);

    }

    public void airportPanelStartMenu(){
        System.out.println("Choose operation: ");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");

    }

    public void flightServiceStartMenu(){
        System.out.println("Choose action: ");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");

    }

}
