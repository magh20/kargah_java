import java.util.List;

public class T1 extends Thread {
    private List<Entity> entities;
    public T1(List<Entity> entities) {
        this.entities = entities;
    }
    @Override
    public void run() {
        for (Entity e: entities) {
            try {
                Service.getInstance().save(e);
            } catch (Exception ex) {
                System.out.println("failed to save " + ex.getMessage());
            }
        }
    }
}