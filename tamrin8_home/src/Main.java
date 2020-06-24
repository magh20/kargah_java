import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (true) {
            System.out.printf("\nMenu:\n1\tSubmit Product\n2\tCustoms Percentage\n3\tExit\n");
            switch (scanner.nextInt()) {
                case 1:
                    Entity entity = new Entity();
                    entity.setId(++i);
                    System.out.printf("Enter Name: ");
                    entity.setName(scanner.next());
                    System.out.printf("Price: ");
                    entity.setPrice(scanner.next());
                    System.out.printf("Choose Category (1 Domestic, 2 Foreign): ");
                    switch (scanner.nextInt()) {
                        case 1:
                            entity.setCategory("d");
                            break;
                        case 2:
                            entity.setCategory("f");
                            break;
                    }
                    try {
                        Service.getInstance().save(entity);
                    } catch (Exception e) {
                        System.out.println("failed to save " + e.getMessage());
                    }
                    break;
                case 2:
                    String cat = "";
                    System.out.printf("Enter ID: ");
                    try {
                        cat = Service.getInstance().report().get(scanner.nextInt()-1).getCategory();
                    } catch (Exception e) {
                        System.out.println("failed to report " + e.getMessage());
                    }
                    switch (cat) {
                        case "d":
                            System.out.println("Customs Percentage: 10%");
                            break;
                        case "f":
                            System.out.println("Customs Percentage: 50%");
                            break;
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}