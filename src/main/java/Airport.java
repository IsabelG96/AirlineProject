import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Flight testFlight = new Flight("Destination", 12345, "Name");
        ArrayList<Flight> newFlightList = new ArrayList<Flight>();
        System.out.println("Welcome to BNTA Airport! Please enter your flight destination");
        while (true){
            String inputDestination = scanner.nextLine();
            testFlight.setDestination(inputDestination);
            System.out.println("Thanks for sharing! Now, how about a flight ID?");
            String inputFlightID = scanner.nextLine();
            testFlight.setFlightID(Integer.parseInt(inputFlightID));
            newFlightList.add(testFlight);
            System.out.println("Cheers, we've got that!");
            System.out.println("Your destination is " + testFlight.getDestination() +
                    " and your flight ID is " + testFlight.getFlightID());
// Displaying total flights
            System.out.println("The total flights are: " + newFlightList);

            break;
            }

        }

    }

//    "Welcome to BNTA Airport! Please enter your flight destination. Please select one of the following 5 options:"
//      1. Add a new flight
//      2. Display all available flights
//      3. Add a new passenger
//      4. Book a passenger onto a flight
//      5. Cancel a flight

