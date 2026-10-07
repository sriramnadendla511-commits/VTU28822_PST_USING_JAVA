import java.util.Scanner;

public class WEEK9_TASK2_RideSharingPlatformSimulator {
    static abstract class Ride {
        abstract int calculateFare(int distance);
    }

    static class Bike extends Ride {
        @Override int calculateFare(int distance) { return distance * 5; }
    }

    static class Auto extends Ride {
        @Override int calculateFare(int distance) { return distance * 12; }
    }

    static class Cab extends Ride {
        @Override int calculateFare(int distance) { return distance * 12; }
    }

    static Ride createRide(String type) {
        if (type.equalsIgnoreCase("Bike")) return new Bike();
        if (type.equalsIgnoreCase("Auto")) return new Auto();
        if (type.equalsIgnoreCase("Cab")) return new Cab();
        return null;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int bookingCount = input.nextInt();
            for (int i = 0; i < bookingCount; i++) {
                String type = input.next();
                int distance = input.nextInt();
                Ride ride = createRide(type);
                if (ride == null) System.out.println("Invalid booking");
                else System.out.println(ride.calculateFare(distance));
            }
        }
    }
}
