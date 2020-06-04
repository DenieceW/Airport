import java.util.ArrayList;

public class Flight {
    private ArrayList<String> flights;

    public Flight(){
        this.flights = new ArrayList<String>();
    }

    public void addFlight(String airportCode, Plane plane){
        this.flights.add(plane + " " + airportCode);
    }

    public void printFlights(){
        for (String flight: this.flights){
            System.out.println(flight);
        }
    }

}
