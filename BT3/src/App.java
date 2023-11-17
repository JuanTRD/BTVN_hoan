package BT3.src;

public class App {
    public static void main(String[] args) {
        Transport[] transports = new Transport[3];
        Truck truck = new Truck(10,20,15);
        Ship ship = new Ship(10,20,30);
        Airplane plane = new Airplane(20,30,30);
        transports[0] = truck;
        transports[1] = ship;
        transports[2] = plane;

        TransportManager manager = new TransportManager();
        for(Transport transport : transports) {
        System.out.println(transport.getInfo());
        System.out.println("Transport Cost " + transport.calculateCost());
        System.out.println("Time cost " + transport.calculateTimeCost());
        System.out.println("Total cost " + (transport.calculateCost() + transport.calculateTimeCost()));
        }

    }
}
