import java.util.ArrayList;

public class Flight {
    private String destination;
    private ArrayList<Passenger> passengerArrayList;
    private int flightID;


    public Flight(String destination, int flightID){
        this.destination = destination;
        this.flightID = flightID;
        this.passengerArrayList = new ArrayList<>();

    }
    //getters
    public String getDestination() { return this.destination; }
    public int getFlightID() { return this.flightID; }
    public ArrayList<Passenger> getPassengers() {return this.passengerArrayList; }
    public int getPassengerCount() { return this.passengerArrayList.size();}

    //setters

    public void setDestination(String newDestination) {this.destination = newDestination;}
    public void setFlightID(int newFlightID) {this.flightID = newFlightID;}
    public void addPassenger(Passenger newPassenger) {this.passengerArrayList.add(newPassenger);}





}
