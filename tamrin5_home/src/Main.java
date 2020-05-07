import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ticket trip1 = new Ticket();
        Ticket trip2 = new Ticket();
        Ticket trip3 = new Ticket();
        Ticket trip4 = new Ticket();
        Ticket trip5 = new Ticket();
        Ticket trip6 = new Ticket();
        Ticket trip7 = new Ticket();
        Ticket trip8 = new Ticket();
        Ticket trip9 = new Ticket();
        Ticket trip10 = new Ticket();
        List<Object> list = new ArrayList<>();

        trip1.setOrigin("Tehran");
        trip1.setDestination("Qom");
        trip1.setBus("Benz");
        trip2.setOrigin("Tehran");
        trip2.setDestination("Mashhad");
        trip2.setBus("Benz");
        trip3.setOrigin("Tehran");
        trip3.setDestination("Kerman");
        trip3.setBus("Benz");
        trip4.setOrigin("Tehran");
        trip4.setDestination("Semnan");
        trip4.setBus("Benz");
        trip5.setOrigin("Tehran");
        trip5.setDestination("Khoram Abad");
        trip5.setBus("Benz");
        trip6.setOrigin("Tehran");
        trip6.setDestination("Qom");
        trip6.setBus("Scania");
        trip7.setOrigin("Tehran");
        trip7.setDestination("Mashhad");
        trip7.setBus("Scania");
        trip8.setOrigin("Tehran");
        trip8.setDestination("Kerman");
        trip8.setBus("Scania");
        trip9.setOrigin("Tehran");
        trip9.setDestination("Semnan");
        trip9.setBus("Scania");
        trip10.setOrigin("Tehran");
        trip10.setDestination("Khoram Abad");
        trip10.setBus("Scania");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nMenu:");
            System.out.println("1 - Book A Trip");
            System.out.println("2 - Cancel Trip");
            System.out.println("3 - Exit");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("List:");
                    System.out.println("TRIP 1:  " + trip1.getOrigin() + "\t" + trip1.getDestination() + "\t\t\t" + trip1.getBus());
                    System.out.println("TRIP 2:  " + trip2.getOrigin() + "\t" + trip2.getDestination() + "\t\t" + trip2.getBus());
                    System.out.println("TRIP 3:  " + trip3.getOrigin() + "\t" + trip3.getDestination() + "\t\t" + trip3.getBus());
                    System.out.println("TRIP 4:  " + trip4.getOrigin() + "\t" + trip4.getDestination() + "\t\t" + trip4.getBus());
                    System.out.println("TRIP 5:  " + trip5.getOrigin() + "\t" + trip5.getDestination() + "\t" + trip5.getBus());
                    System.out.println("TRIP 6:  " + trip6.getOrigin() + "\t" + trip6.getDestination() + "\t\t\t" + trip6.getBus());
                    System.out.println("TRIP 7:  " + trip7.getOrigin() + "\t" + trip7.getDestination() + "\t\t" + trip7.getBus());
                    System.out.println("TRIP 8:  " + trip8.getOrigin() + "\t" + trip8.getDestination() + "\t\t" + trip8.getBus());
                    System.out.println("TRIP 9:  " + trip9.getOrigin() + "\t" + trip9.getDestination() + "\t\t" + trip9.getBus());
                    System.out.println("TRIP 10: " + trip10.getOrigin() + "\t" + trip10.getDestination() + "\t" + trip10.getBus());
                    System.out.print("Enter Trip Number: ");
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.print("Enter Name: ");
                            String temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip1, list, temp))
                                break;
                        case 2:
                            System.out.print("Enter Name: ");
                            temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip2, list, temp))
                                break;
                        case 3:
                            System.out.print("Enter Name: ");
                            temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip3, list, temp))
                                break;
                        case 4:
                            System.out.print("Enter Name: ");
                            temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip4, list, temp))
                                break;
                        case 5:
                            System.out.print("Enter Name: ");
                            temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip5, list, temp))
                                break;
                        case 6:
                            System.out.print("Enter Name: ");
                            temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip6, list, temp))
                                break;
                        case 7:
                            System.out.print("Enter Name: ");
                            temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip7, list, temp))
                                break;
                        case 8:
                            System.out.print("Enter Name: ");
                            temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip8, list, temp))
                                break;
                        case 9:
                            System.out.print("Enter Name: ");
                            temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip9, list, temp))
                                break;
                        case 10:
                            System.out.print("Enter Name: ");
                            temp = scanner.next();
                            if (Ticket.checkRepeatedPassenger(trip10, list, temp))
                                break;
                    }
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    String temp = scanner.next();
                    if (list.contains(temp)) {
                        int tmp = list.indexOf(temp);
                        switch (tmp) {
                            case 0:
                                trip1.setName("");
                            case 1:
                                trip2.setName("");
                            case 2:
                                trip3.setName("");
                            case 3:
                                trip4.setName("");
                            case 4:
                                trip5.setName("");
                            case 5:
                                trip6.setName("");
                            case 6:
                                trip7.setName("");
                            case 7:
                                trip8.setName("");
                            case 8:
                                trip9.setName("");
                            case 9:
                                trip10.setName("");
                        }
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else {
                        try {
                            throw new TicketException("Passenger Not Found!");
                        } catch (TicketException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}