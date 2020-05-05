import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}

            System.out.println("\nMenu:");
            System.out.println("1 - Add Electric Product");
            System.out.println("2 - Add Food or Medicine");
            System.out.println("3 - Send Product");
            System.out.println("4 - Exit");

            switch (scanner.nextInt()) {
                case 1:
                case 2:
                    try {
                        storage.setProduct();
                        break;
                    } catch (StorageException e) {
                        e.printStackTrace();
                        break;
                    }
                case 3:
                    try {
                        storage.getProduct();
                        break;
                    } catch (StorageException e) {
                        e.printStackTrace();
                        break;
                    }
                case 4:
                    System.exit(0);
            }
        }
    }
}
