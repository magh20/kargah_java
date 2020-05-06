import java.util.*;

public class Main {
    public static void main(String[] args) {
        Terminal trip1=new Terminal();
        Terminal trip2=new Terminal();
        Terminal trip3=new Terminal();
        Terminal trip4=new Terminal();
        Terminal trip5=new Terminal();
        Terminal trip6=new Terminal();
        Terminal trip7=new Terminal();
        Terminal trip8=new Terminal();
        Terminal trip9=new Terminal();
        Terminal trip10=new Terminal();
        List<Object> list=new ArrayList<>();

        trip1.setShahrMabda("Tehran");
        trip1.setShahrMaghsad("Ahvaz");
        trip1.setCarModel("Benz");
        trip2.setShahrMabda("Tehran");
        trip2.setShahrMaghsad("Shiraz");
        trip2.setCarModel("Scania");
        trip3.setShahrMabda("Tehran");
        trip3.setShahrMaghsad("Tabriz");
        trip3.setCarModel("Benz");
        trip4.setShahrMabda("Tehran");
        trip4.setShahrMaghsad("Kerman");
        trip4.setCarModel("Scania");
        trip5.setShahrMabda("Tehran");
        trip5.setShahrMaghsad("Mashhad");
        trip5.setCarModel("Benz");
        trip6.setShahrMabda("Tehran");
        trip6.setShahrMaghsad("Ardebil");
        trip6.setCarModel("Scania");
        trip7.setShahrMabda("Tehran");
        trip7.setShahrMaghsad("Yazd");
        trip7.setCarModel("Benz");
        trip8.setShahrMabda("Tehran");
        trip8.setShahrMaghsad("Urumia");
        trip8.setCarModel("Scania");
        trip9.setShahrMabda("Tehran");
        trip9.setShahrMaghsad("Zabol");
        trip9.setCarModel("Benz");
        trip10.setShahrMabda("Tehran");
        trip10.setShahrMaghsad("Karaj");
        trip10.setCarModel("Scania");

        for (int i=0;;i++){
            Scanner input=new Scanner(System.in);
            System.out.println("\nMenu: ");
            System.out.println("1 - Book A Trip\n2 - Cancel Trip\n3 - Exit");
            int j=input.nextInt();
            if(j!=1 && j!=2 && j!=3){
                System.out.println("invalid number!!!");
                break;
            }
            switch (j){
                case 1:
                    System.out.println("List:");
                    System.out.println("TRIP 1:  " + trip1.getShahrMabda() + "\t" + trip1.getShahrMaghsad() + "\t" + trip1.getCarModel());
                    System.out.println("TRIP 2:  " + trip2.getShahrMabda() + "\t" + trip2.getShahrMaghsad() + "\t" + trip2.getCarModel());
                    System.out.println("TRIP 3:  " + trip3.getShahrMabda() + "\t" + trip3.getShahrMaghsad() + "\t" + trip3.getCarModel());
                    System.out.println("TRIP 4:  " + trip4.getShahrMabda() + "\t" + trip4.getShahrMaghsad() + "\t" + trip4.getCarModel());
                    System.out.println("TRIP 5:  " + trip5.getShahrMabda() + "\t" + trip5.getShahrMaghsad() + "\t" + trip5.getCarModel());
                    System.out.println("TRIP 6:  " + trip6.getShahrMabda() + "\t" + trip6.getShahrMaghsad() + "\t" + trip6.getCarModel());
                    System.out.println("TRIP 7:  " + trip7.getShahrMabda() + "\t" + trip7.getShahrMaghsad() + "\t" + trip7.getCarModel());
                    System.out.println("TRIP 8:  " + trip8.getShahrMabda() + "\t" + trip8.getShahrMaghsad() + "\t" + trip8.getCarModel());
                    System.out.println("TRIP 9:  " + trip9.getShahrMabda() + "\t" + trip9.getShahrMaghsad() + "\t" + trip9.getCarModel());
                    System.out.println("TRIP 10: " + trip10.getShahrMabda() + "\t" + trip10.getShahrMaghsad() + "\t" + trip10.getCarModel() + "\n");
                    System.out.print("Enter Trip Number: ");
                    switch (input.nextInt()){
                        case 1:
                            System.out.print("Enter Name: ");
                            String temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip1.setName(temp);
                                list.add(trip1.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        case 2:
                            System.out.print("Enter Name: ");
                            temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip2.setName(temp);
                                list.add(trip2.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        case 3:
                            System.out.print("Enter Name: ");
                            temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip3.setName(temp);
                                list.add(trip3.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        case 4:
                            System.out.print("Enter Name: ");
                            temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip4.setName(temp);
                                list.add(trip4.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        case 5:
                            System.out.print("Enter Name: ");
                            temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip5.setName(temp);
                                list.add(trip5.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        case 6:
                            System.out.print("Enter Name: ");
                            temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip6.setName(temp);
                                list.add(trip6.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        case 7:
                            System.out.print("Enter Name: ");
                            temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip7.setName(temp);
                                list.add(trip7.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        case 8:
                            System.out.print("Enter Name: ");
                            temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip8.setName(temp);
                                list.add(trip8.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        case 9:
                            System.out.print("Enter Name: ");
                            temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip9.setName(temp);
                                list.add(trip9.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        case 10:
                            System.out.print("Enter Name: ");
                            temp = input.next();
                            if (checkRepeatedPassenger(temp, list)==false) {
                                trip10.setName(temp);
                                list.add(trip10.getName());
                                System.out.println("Booking Successful");
                                break;
                            }
                            else if (checkRepeatedPassenger(temp, list)==true) {
                                try {
                                    throw new TripException("You Can't Book Another Trip!");
                                } catch (TripException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                    }
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    String temp = input.next();
                    if (trip1.getName()!=null && trip1.getName().equals(temp)) {
                        trip1.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else if (trip2.getName()!=null && trip2.getName().equals(temp)) {
                        trip2.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else if (trip3.getName()!=null && trip3.getName().equals(temp)) {
                        trip3.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else if (trip4.getName()!=null && trip4.getName().equals(temp)) {
                        trip4.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else if (trip5.getName()!=null && trip5.getName().equals(temp)) {
                        trip5.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else if (trip6.getName()!=null && trip6.getName().equals(temp)) {
                        trip6.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else if (trip7.getName()!=null && trip7.getName().equals(temp)) {
                        trip7.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else if (trip8.getName()!=null && trip8.getName().equals(temp)) {
                        trip8.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else if (trip9.getName()!=null && trip9.getName().equals(temp)) {
                        trip9.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else if (trip10.getName()!=null && trip10.getName().equals(temp)) {
                        trip10.setName("");
                        int tmp = list.indexOf(temp);
                        list.remove(tmp);
                        System.out.println("Cancellation Successful!");
                    }
                    else {
                        try {
                            throw new TripException("Passenger Not Found!");
                        } catch (TripException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("pasengers name : ");
                    for (Object s: list)
                        System.out.println(s);
                    break;
                case 3:

                    System.exit(0);
            }
        }
    }

    private static boolean checkRepeatedPassenger (String temp, List list) {
        if (list.contains(temp))
            return true;
        else
            return false;
    }
}