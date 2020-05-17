public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Power Cable","1000");
        Product product2 = new Product("Socket","1500");
        Product product3 = new Product("Light Switch","2000");

        App app = new App(product1, product2, product3);
        app.setVisible(true);
    }
}