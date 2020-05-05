import java.util.Scanner;

public class Storage {
    private String name, weight, price, type, receiver;
    private enum TYPE {ELECTRIC, FOOD, MEDICINE}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setProduct() throws StorageException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String temp = scanner.nextLine();
        if (temp.isEmpty())
            throw new StorageException("Product name can't be empty!");
        else
            setName(temp);

        System.out.print("Weight: ");
        temp = scanner.nextLine();
        if (temp.isEmpty())
            throw new StorageException("Product weight can't be empty!");
        else
            setWeight(temp);

        System.out.print("Price: ");
        temp = scanner.nextLine();
        if (temp.isEmpty())
            throw new StorageException("Product price can't be empty!");
        else
            setPrice(temp);

        System.out.print("Type (1 for Electric, 2 for Food, 3 for Medicine): ");
        temp = scanner.nextLine();
        if (temp.isEmpty())
            throw new StorageException("Product type can't be empty!");
        else
            switch (temp) {
                case "1":
                    setType(TYPE.ELECTRIC.toString());
                    break;
                case "2":
                    setType(TYPE.FOOD.toString());
                    break;
                case "3":
                    setType(TYPE.MEDICINE.toString());
                    break;
            }
    }
    public void getProduct() throws StorageException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product Receiver: ");
        String temp = scanner.nextLine();
        if (temp.isEmpty())
            throw new StorageException("Product receiver can't be empty!");
        else
            setReceiver(temp);

        setProduct();
    }
}