import java.util.List;

public class Ticket <ORIGIN,DESTINATION,BUS,NAME> {
    private ORIGIN origin;
    private DESTINATION destination;
    private BUS bus;
    private NAME name;

    public ORIGIN getOrigin() {
        return origin;
    }
    public void setOrigin(ORIGIN origin) {
        this.origin = origin;
    }
    public DESTINATION getDestination() {
        return destination;
    }
    public void setDestination(DESTINATION destination) {
        this.destination = destination;
    }
    public BUS getBus() {
        return bus;
    }
    public void setBus(BUS bus) {
        this.bus = bus;
    }
    public NAME getName() {
        return name;
    }
    public void setName(NAME name) {
        this.name = name;
    }

    public static boolean checkList(String temp, List list) {
        if (list.contains(temp))
            return true;
        else
            return false;
    }
    public static boolean checkRepeatedPassenger(Ticket trip, List<Object> list, String temp) {
        if (!Ticket.checkList(temp, list)) {
            trip.setName(temp);
            list.add(trip.getName());
            System.out.println("Booking Successful!");
            return true;
        }
        else if (Ticket.checkList(temp, list)==true) {
            try {
                throw new TicketException("You Can't Book Another Trip!");
            } catch (TicketException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }
}
