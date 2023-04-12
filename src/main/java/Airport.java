import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Passenger testPassenger = new Passenger(000,"blank", "blank");
        Flight testFlight = new Flight("Destination", 12345);
        ArrayList<Flight> newFlightList = new ArrayList<Flight>();

//        Creating a while loop. Adding a destination

        System.out.println("Welcome to BNTA Airport! Please enter your flight destination");
        while (true){
            String inputDestination = scanner.nextLine();
            testFlight.setDestination(inputDestination);

//          Adding flight ID

            System.out.println("Thanks for sharing! Now, how about a flight ID?");
            String inputFlightID = scanner.nextLine();
            testFlight.setFlightID(Integer.parseInt(inputFlightID));
            newFlightList.add(testFlight);
            System.out.println("Cheers, we've got that!");
            System.out.println("Your destination is " + testFlight.getDestination() +
                    " and your flight ID is " + testFlight.getFlightID());

//             Adding passenger info

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

//            Adding passenger to a flight

            System.out.println("Would you like to book on to this flight? Please select between Yes or No");
            String inputBooking = scanner.nextLine();
            if(inputBooking.equalsIgnoreCase("Yes")) {
                testFlight.addPassenger(testPassenger);
                System.out.println("Congratulations, you are on the flight!");
            } else {
                System.out.println("Sure, no problem.");
            }

//            Checking total numbers of passengers
            System.out.println("Your current total number of passengers is: " + testFlight.getPassengers().size());

//            Cancelling flight

            System.out.println("Would you like to cancel the flight? Please select between Yes or No");
            String inputCancelledFlight = scanner.nextLine();
            if(inputCancelledFlight.equalsIgnoreCase("Yes")) {
                newFlightList.remove(testFlight);
                System.out.println("Great, you flight has been cancelled!");
            } else {
                System.out.println("Sure, no problem.");
            }

            // Checking number of flights
            System.out.println("Your current total number of flights is: " + newFlightList.size());

            break;
            }
    }


    }

