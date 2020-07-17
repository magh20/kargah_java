public class Entity {
    private int id;
    private String model, pelak, takhalof;

    public int getId() {
        return id;
    }

    public Entity setId(int id) {
        this.id = id;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Entity setModel(String model) {
        this.model = model;
        return this;
    }

    public String getPelak() {
        return pelak;
    }

    public Entity setPelak(String pelak) {
        this.pelak = pelak;
        return this;
    }

    public String getTakhalof() {
        return takhalof;
    }

    public Entity setTakhalof(String takhalof) {
        this.takhalof = takhalof;
        return this;
    }
}
