import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id=0;
        while (true) {
            List<Entity> e1 = new ArrayList<>();
            List<Entity> e2 = new ArrayList<>();
            for (int i=1; i<7 ; i++) {
                id++;
                Entity entity = new Entity().setId(id);
                e1.add(getInfo(entity,i,scanner));
            }
            for (int i=7; i<13 ; i++) {
                id++;
                Entity entity = new Entity().setId(id);
                e2.add(getInfo(entity,i,scanner));
            }
            T1 t1 = new T1(e1);
            T2 t2 = new T2(e2);
            t1.start();
            t2.start();
            try {
                Thread.sleep(78000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static Entity getInfo(Entity entity, int i, Scanner scanner) {
        System.out.printf("Enter "+i+"th Car's Model: ");
        entity.setModel(scanner.next());
        System.out.printf("Pelak: ");
        entity.setPelak(scanner.next());
        System.out.printf("Takhalof: ");
        entity.setTakhalof(scanner.next());
        return entity;
    }
}