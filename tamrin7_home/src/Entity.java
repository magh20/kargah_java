public class Entity {
    private int id;
    private String name, price, category;
    public int getId() {
        return id;
    }
    public Entity setId(int id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }
    public Entity setName(String name) {
        this.name = name;
        return this;
    }
    public String getPrice() {
        return price;
    }
    public Entity setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getCategory() {
        return category;
    }
    public Entity setCategory(String category) {
        this.category = category;
        return this;
    }
}