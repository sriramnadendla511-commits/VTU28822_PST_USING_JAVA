import java.util.Locale;
import java.util.Scanner;

public class WEEK9_TASK3_VehicleRentalSystem {
    static abstract class Vehicle {
        final String vehicleNumber;
        final double rentPerDay;

        Vehicle(String vehicleNumber, double rentPerDay) {
            this.vehicleNumber = vehicleNumber;
            this.rentPerDay = rentPerDay;
        }

        abstract double calculateRent(int days);
    }

    static class Car extends Vehicle {
        Car(String number, double rent) { super(number, rent); }
        @Override double calculateRent(int days) { return rentPerDay * days; }
    }

    static class Bike extends Vehicle {
        Bike(String number, double rent) { super(number, rent); }
        @Override double calculateRent(int days) { return rentPerDay * days * 0.90; }
    }

    static class Truck extends Vehicle {
        Truck(String number, double rent) { super(number, rent); }
        @Override double calculateRent(int days) { return rentPerDay * days * 1.20; }
    }

    static Vehicle createVehicle(int type, String number, double rentPerDay) {
        switch (type) {
            case 1: return new Car(number, rentPerDay);
            case 2: return new Bike(number, rentPerDay);
            case 3: return new Truck(number, rentPerDay);
            default: throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner input = new Scanner(System.in)) {
            int count = input.nextInt();
            for (int i = 0; i < count; i++) {
                int type = input.nextInt();
                String number = input.next();
                double rentPerDay = input.nextDouble();
                int days = input.nextInt();
                Vehicle vehicle = createVehicle(type, number, rentPerDay);
                System.out.printf("%s %.2f%n", vehicle.vehicleNumber, vehicle.calculateRent(days));
            }
        }
    }
}
