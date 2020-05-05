

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
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
        Map teravel1=new LinkedHashMap();
        Map teravel2=new LinkedHashMap();
        Map teravel3=new LinkedHashMap();
        Map teravel4=new LinkedHashMap();
        Map teravel5=new LinkedHashMap();
        Map teravel6=new LinkedHashMap();
        Map teravel7=new LinkedHashMap();
        Map teravel8=new LinkedHashMap();
        Map teravel9=new LinkedHashMap();
        Map teravel10=new LinkedHashMap();
        Set set1 =teravel1.keySet();
        Set set2 =teravel2.keySet();
        Set set3 =teravel3.keySet();
        Set set4 =teravel4.keySet();
        Set set5 =teravel5.keySet();
        Set set6 =teravel6.keySet();
        Set set7 =teravel7.keySet();
        Set set8 =teravel8.keySet();
        Set set9 =teravel9.keySet();
        Set set10 =teravel10.keySet();
        List<Object> name=new ArrayList<>();

        trip1.setShahrMabda("Tehran");
        trip1.setShahrMaghsad("Ahvaz");
        trip1.setCarModel("benz");
        teravel1.put("shahr mabda",trip1.getShahrMabda());
        teravel1.put("shahr maghsad",trip1.getShahrMaghsad());
        teravel1.put("car model",trip1.getCarModel());

        trip2.setShahrMabda("Tehran");
        trip2.setShahrMaghsad("Shiraz");
        trip2.setCarModel("scania");
        teravel2.put("shahr mabda",trip2.getShahrMabda());
        teravel2.put("shahr maghsad",trip2.getShahrMaghsad());
        teravel2.put("car model",trip2.getCarModel());

        trip3.setShahrMabda("Tehran");
        trip3.setShahrMaghsad("Tabriz");
        trip3.setCarModel("benz");
        teravel3.put("shahr mabda",trip3.getShahrMabda());
        teravel3.put("shahr maghsad",trip3.getShahrMaghsad());
        teravel3.put("car model",trip3.getCarModel());

        trip4.setShahrMabda("Tehran");
        trip4.setShahrMaghsad("Kerman");
        trip4.setCarModel("scania");
        teravel4.put("shahr mabda",trip4.getShahrMabda());
        teravel4.put("shahr maghsad",trip4.getShahrMaghsad());
        teravel4.put("car model",trip4.getCarModel());

        trip5.setShahrMabda("Tehran");
        trip5.setShahrMaghsad("Mashhad");
        trip5.setCarModel("benz");
        teravel5.put("shahr mabda",trip5.getShahrMabda());
        teravel5.put("shahr maghsad",trip5.getShahrMaghsad());
        teravel5.put("car model",trip5.getCarModel());

        trip6.setShahrMabda("Tehran");
        trip6.setShahrMaghsad("Ardebil");
        trip6.setCarModel("scania");
        teravel6.put("shahr mabda",trip6.getShahrMabda());
        teravel6.put("shahr maghsad",trip6.getShahrMaghsad());
        teravel6.put("car model",trip6.getCarModel());

        trip7.setShahrMabda("Tehran");
        trip7.setShahrMaghsad("Yazd");
        trip7.setCarModel("benz");
        teravel7.put("shahr mabda",trip7.getShahrMabda());
        teravel7.put("shahr maghsad",trip7.getShahrMaghsad());
        teravel7.put("car model",trip7.getCarModel());

        trip8.setShahrMabda("Tehran");
        trip8.setShahrMaghsad("Urumia");
        trip8.setCarModel("scania");
        teravel8.put("shahr mabda",trip8.getShahrMabda());
        teravel8.put("shahr maghsad",trip8.getShahrMaghsad());
        teravel8.put("car model",trip8.getCarModel());

        trip9.setShahrMabda("Tehran");
        trip9.setShahrMaghsad("Zabol");
        trip9.setCarModel("benz");
        teravel9.put("shahr mabda",trip9.getShahrMabda());
        teravel9.put("shahr maghsad",trip9.getShahrMaghsad());
        teravel9.put("car model",trip9.getCarModel());

        trip10.setShahrMabda("Tehran");
        trip10.setShahrMaghsad("Karaj");
        trip10.setCarModel("scania");
        teravel10.put("shahr mabda",trip10.getShahrMabda());
        teravel10.put("shahr maghsad",trip10.getShahrMaghsad());
        teravel10.put("car model",trip10.getCarModel());

        for (int i=0;;i++){
            System.out.println("pls choose your number : ");
            System.out.println("1-book a trip\n2-cancle a trip\n3-Exit");
            int j=input.nextInt();
            if(j!=1 && j!=2 && j!=3){
                System.out.println("invalid number!!!");
                break;
            }
            switch (j){
                case 1:
                    System.out.println("travels list :\n");
                    System.out.println("TRAVEL 1 : Tehran-Ahvaz(benz)\nTRAVEL 2 : Tehran-Shiraz(scania)\nTRAVEL 3 : Tehtan-Tabriz(benz)\n" +
                            "TRAVEL 4 : Tehran-Kerman(scania)\nTRAVEL 5 :Tehran-Mashhad(benz)\nTRAVEL 6 :Tehran-Ardebil(scania)\n" +
                            "TRAVEL 7 :Tehran-Yazd(benz)\nTRAVEL 8 :Tehran-Urumia(scania)\nTRAVEL 9 :Tehran-Zabol(benz)\n" +
                            "TRAVEL 10 :Tehran-Karaj(scania)\n");
                    System.out.println("pls choose your bus : ");
                    int x=input.nextInt();
                    switch (x){
                        case 1:
                            System.out.println("pls enter your name : ");
                            String y=input.nextLine();
                            trip1.setName(input.nextLine());
                            if(trip1.getName().equals(trip2.getName())|| trip1.getName().equals(trip3.getName())|| trip1.getName().equals(trip4.getName())
                                    || trip1.getName().equals(trip5.getName())|| trip1.getName().equals(trip6.getName())|| trip1.getName().equals(trip7.getName())
                                    || trip1.getName().equals(trip8.getName())|| trip1.getName().equals(trip9.getName())|| trip1.getName().equals(trip10.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL1 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel1 ticket");
                            for (Object o : set1) {
                                System.out.println(o + " : ");
                                System.out.println(teravel1.get(o));
                            }
                            continue;
                        case 2:
                            System.out.println("pls enter your name : ");
                            y=input.nextLine();
                            trip2.setName(input.nextLine());
                            if(trip2.getName().equals(trip1.getName())|| trip2.getName().equals(trip3.getName())|| trip2.getName().equals(trip4.getName())
                                    || trip2.getName().equals(trip5.getName())|| trip2.getName().equals(trip6.getName())|| trip2.getName().equals(trip7.getName())
                                    || trip2.getName().equals(trip8.getName())|| trip2.getName().equals(trip9.getName())|| trip2.getName().equals(trip10.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL2 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel2 ticket");
                            for (Object o : set2) {
                                System.out.println(o + " : ");
                                System.out.println(teravel2.get(o));
                            }
                            continue;
                        case 3:
                            System.out.println("pls enter your name : ");
                            y=input.nextLine();
                            trip3.setName(input.nextLine());
                            if(trip3.getName().equals(trip2.getName())|| trip3.getName().equals(trip1.getName())|| trip3.getName().equals(trip4.getName())
                                    || trip3.getName().equals(trip5.getName())|| trip3.getName().equals(trip6.getName())|| trip3.getName().equals(trip7.getName())
                                    || trip3.getName().equals(trip8.getName())|| trip3.getName().equals(trip9.getName())|| trip3.getName().equals(trip10.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL3 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel3 ticket");
                            for (Object o : set3) {
                                System.out.println(o + " : ");
                                System.out.println(teravel3.get(o));
                            }
                            continue;
                        case 4:
                            System.out.println("pls enter your name : ");
                            y=input.nextLine();
                            trip4.setName(input.nextLine());
                            if(trip4.getName().equals(trip2.getName())|| trip4.getName().equals(trip3.getName())|| trip4.getName().equals(trip1.getName())
                                    || trip4.getName().equals(trip5.getName())|| trip4.getName().equals(trip6.getName())|| trip4.getName().equals(trip7.getName())
                                    || trip4.getName().equals(trip8.getName())|| trip4.getName().equals(trip9.getName())|| trip4.getName().equals(trip10.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL4 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel4 ticket");
                            for (Object o : set4) {
                                System.out.println(o + " : ");
                                System.out.println(teravel4.get(o));
                            }
                            continue;
                        case 5:
                            System.out.println("pls enter your name : ");
                            y=input.nextLine();
                            trip5.setName(input.nextLine());
                            if(trip5.getName().equals(trip2.getName())|| trip5.getName().equals(trip3.getName())|| trip5.getName().equals(trip4.getName())
                                    || trip5.getName().equals(trip1.getName())|| trip5.getName().equals(trip6.getName())|| trip5.getName().equals(trip7.getName())
                                    || trip5.getName().equals(trip8.getName())|| trip5.getName().equals(trip9.getName())|| trip5.getName().equals(trip10.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL5 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel5 ticket");
                            for (Object o : set5) {
                                System.out.println(o + " : ");
                                System.out.println(teravel5.get(o));
                            }
                            continue;
                        case 6:
                            System.out.println("pls enter your name : ");
                            y=input.nextLine();
                            trip6.setName(input.nextLine());
                            if(trip6.getName().equals(trip2.getName())|| trip6.getName().equals(trip3.getName())|| trip6.getName().equals(trip4.getName())
                                    || trip6.getName().equals(trip5.getName())|| trip6.getName().equals(trip1.getName())|| trip6.getName().equals(trip7.getName())
                                    || trip6.getName().equals(trip8.getName())|| trip6.getName().equals(trip9.getName())|| trip6.getName().equals(trip10.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL6 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel6 ticket");
                            for (Object o : set6) {
                                System.out.println(o + " : ");
                                System.out.println(teravel6.get(o));
                            }
                            continue;
                        case 7:
                            System.out.println("pls enter your name : ");
                            y=input.nextLine();
                            trip7.setName(input.nextLine());
                            if(trip7.getName().equals(trip2.getName())|| trip7.getName().equals(trip3.getName())|| trip7.getName().equals(trip4.getName())
                                    || trip7.getName().equals(trip5.getName())|| trip7.getName().equals(trip6.getName())|| trip7.getName().equals(trip1.getName())
                                    || trip7.getName().equals(trip8.getName())|| trip7.getName().equals(trip9.getName())|| trip7.getName().equals(trip10.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL7 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel7 ticket");
                            for (Object o : set7) {
                                System.out.println(o + " : ");
                                System.out.println(teravel7.get(o));
                            }
                            continue;
                        case 8:
                            System.out.println("pls enter your name : ");
                            y=input.nextLine();
                            trip8.setName(input.nextLine());
                            if(trip8.getName().equals(trip2.getName())|| trip8.getName().equals(trip3.getName())|| trip8.getName().equals(trip4.getName())
                                    || trip8.getName().equals(trip5.getName())|| trip8.getName().equals(trip6.getName())|| trip8.getName().equals(trip7.getName())
                                    || trip8.getName().equals(trip1.getName())|| trip8.getName().equals(trip9.getName())|| trip8.getName().equals(trip10.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL8 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel8 ticket");
                            for (Object o : set8) {
                                System.out.println(o + " : ");
                                System.out.println(teravel8.get(o));
                            }
                            continue;
                        case 9:
                            System.out.println("pls enter your name : ");
                            y=input.nextLine();
                            trip9.setName(input.nextLine());
                            if(trip9.getName().equals(trip2.getName())|| trip9.getName().equals(trip3.getName())|| trip9.getName().equals(trip4.getName())
                                    || trip9.getName().equals(trip5.getName())|| trip9.getName().equals(trip6.getName())|| trip9.getName().equals(trip7.getName())
                                    || trip9.getName().equals(trip8.getName())|| trip9.getName().equals(trip1.getName())|| trip9.getName().equals(trip10.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL9 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel9 ticket");
                            for (Object o : set9) {
                                System.out.println(o + " : ");
                                System.out.println(teravel9.get(o));
                            }
                            continue;
                        case 10:
                            System.out.println("pls enter your name : ");
                            y=input.nextLine();
                            trip10.setName(input.nextLine());
                            if(trip10.getName().equals(trip2.getName())|| trip10.getName().equals(trip3.getName())|| trip10.getName().equals(trip4.getName())
                                    || trip10.getName().equals(trip5.getName())|| trip10.getName().equals(trip6.getName())|| trip10.getName().equals(trip7.getName())
                                    || trip10.getName().equals(trip8.getName())|| trip10.getName().equals(trip9.getName())|| trip10.getName().equals(trip1.getName())){
                                System.out.println("you can't book an another travel!!!");
                                break;
                            }
                            System.out.println("booked TRAVEL10 :");
                            System.out.println("pls enter your name again :");
                            name.add(input.nextLine()+" have travel10 ticket");
                            for (Object o : set10) {
                                System.out.println(o + " : ");
                                System.out.println(teravel10.get(o));
                            }
                            continue;
                        default:
                            System.out.println("there isn't this bus!!!");
                            break;
                    }
                    teravel1.put("name",trip1.getName());
                    teravel2.put("name",trip2.getName());
                    teravel3.put("name",trip3.getName());
                    teravel4.put("name",trip4.getName());
                    teravel5.put("name",trip5.getName());
                    teravel6.put("name",trip6.getName());
                    teravel7.put("name",trip7.getName());
                    teravel8.put("name",trip8.getName());
                    teravel9.put("name",trip9.getName());
                    teravel10.put("name",trip10.getName());

                    break;
                case 2:
                    System.out.println("pasenger's name : ");
                    for(Object s : name){
                        System.out.println(s);
                    }
                    System.out.println("pls enter your name and ticket: ");
                    String z=input.nextLine();
                    name.remove(input.nextLine());
                    System.out.println("pasenger's name : ");
                    for(Object s : name){
                        System.out.println(s);
                    }
                    break;
                case 3:
                    break;
            }break;
        }


    }
}