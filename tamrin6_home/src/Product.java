import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name, price;
    List<String> owners = new ArrayList<>();

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }
}