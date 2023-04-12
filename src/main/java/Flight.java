import java.util.ArrayList;

public class Flight {
    // string destination
    // int id
    //arraylist (list of type PASSENGERS)
    //getters and setters
    //add a passenger to the class
    private String destination;
    private ArrayList<Passenger> passengerArrayList;
    private int flightID;


    public Flight(String destination, int flightID, String passengerName){
        this.destination = destination;
        this.flightID = flightID;
        this.passengerArrayList = new ArrayList<>();

    }
    //getters
    public String getDestination() { return this.destination; }
    public int getFlightID() { return this.flightID; }
    public ArrayList<Passenger> getPassengers() {return this.passengerArrayList; }
    public int getPassengerCount() { return this.passengerArrayList.size();}
//    public ArrayList<Flight> getFlights() {return this.flightArrayList; }
//    public int getFlightCount() { return this.flightArrayList.size();}
    //setters

    public void setDestination(String newDestination) {this.destination = newDestination;}
    public void setFlightID(int newFlightID) {this.flightID = newFlightID;}
    public void addPassenger(Passenger newPassenger) {this.passengerArrayList.add(newPassenger);}





}
