import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=0;
        try {
            Service.getInstance().save(new Entity().setId(++i).setName("Tombak").setPrice("500000").setCategory("Persian"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Santour").setPrice("1000000").setCategory("Persian"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Setar").setPrice("1500000").setCategory("Persian"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Tar").setPrice("2000000").setCategory("Persian"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Tanbour").setPrice("2500000").setCategory("Persian"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Piano").setPrice("10000000").setCategory("Foreign"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Guitar").setPrice("5000000").setCategory("Foreign"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Electric Guitar").setPrice("5000000").setCategory("Foreign"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Drum Kit").setPrice("15000000").setCategory("Foreign"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Synthesizer").setPrice("7500000").setCategory("Foreign"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("AUX Cable").setPrice("200000").setCategory("Accessory"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Guitar Pedal").setPrice("300000").setCategory("Accessory"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Amplifier").setPrice("500000").setCategory("Accessory"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("Speakers").setPrice("5000000").setCategory("Accessory"));
            Thread.sleep( 10);
            Service.getInstance().save(new Entity().setId(++i).setName("AUX Extender").setPrice("100000").setCategory("Accessory"));
        } catch (Exception e) {
            System.out.println("failed to save " + e.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("\nMenu:\n1\tShow Categories\n2\tShow Products\n3\tAdd New Product\n4\tEdit Product Info\n5\tRemove Product\n6\tExit\n");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.printf("\n1\tPersian\n2\tForeign\n3\tAccessories\n");
                    break;
                case 2:
                    try {
                        List<Entity> entityList = Service.getInstance().report();
                        for (Entity entity : entityList) {
                            System.out.println(entity.getId()+"\t"+entity.getName()+"\t"+entity.getPrice()+"\t"+entity.getCategory());
                        }
                    } catch (Exception e) {
                        System.out.println("failed to report " + e.getMessage());
                    }
                    break;
                case 3:
                    Entity entity = new Entity();
                    entity.setId(++i);
                    System.out.printf("Enter Name: ");
                    entity.setName(scanner.next());
                    System.out.printf("Price: ");
                    entity.setPrice(scanner.next());
                    System.out.printf("Category (Persian, Foreign, Accessory): ");
                    entity.setCategory(scanner.next());
                    try {
                        Service.getInstance().save(entity);
                    } catch (Exception e) {
                        System.out.println("failed to save " + e.getMessage());
                    }
                    break;
                case 4:
                    entity = new Entity();
                    System.out.printf("Enter ID: ");
                    entity.setId(scanner.nextInt());
                    System.out.printf("Enter New Name: ");
                    entity.setName(scanner.next());
                    System.out.printf("New Price: ");
                    entity.setPrice(scanner.next());
                    System.out.printf("New Category (Persian, Foreign, Accessory): ");
                    entity.setCategory(scanner.next());
                    try {
                        Service.getInstance().edit(entity);
                    } catch (Exception e){
                        System.out.println ("failed to edit " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.printf("Enter ID: ");
                    try {
                        Service.getInstance().remove(scanner.nextInt());
                    } catch (Exception e){
                        System.out.println ("failed to remove " + e.getMessage());
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}