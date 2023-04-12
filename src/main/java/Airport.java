import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Passenger testPassenger = new Passenger(000,"blank", "blank");
        Flight testFlight = new Flight("Destination", 12345);
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

            System.out.println("What is your passenger's name?");
            String inputPassengerName = scanner.nextLine();
            testPassenger.setName(inputPassengerName);
            System.out.println("What is your passenger's ID?");
            String inputPassengerID = scanner.nextLine();
            testPassenger.setId(Integer.parseInt(inputPassengerID));
            System.out.println("What's your phone number or email?");
            String inputPassengerContactInfo = scanner.nextLine();
            testPassenger.setContactInfo(inputPassengerContactInfo);
            System.out.println("Your name is " + testPassenger.getName()
                    + " your passenger ID is " + testPassenger.getId()
                    + " and your contact info is " + testPassenger.getContactInfo());

            System.out.println("The total flights are: " + newFlightList);
            System.out.println("What flight would you like to cancel?");
            String inputCancelledFlight = scanner.findInLine();

            }

//        testFlight.addPassenger(testPassenger);

    }

    }

