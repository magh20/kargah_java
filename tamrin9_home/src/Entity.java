public class Entity {
    private int id, capacity;
    private String name, teacher, requirements;
    public int getId() {
        return id;
    }
    public Entity setId(int id) {
        this.id = id;
        return this;
    }
    public int getCapacity() {
        return capacity;
    }
    public Entity setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getName() {
        return name;
    }
    public Entity setName(String name) {
        this.name = name;
        return this;
    }
    public String getTeacher() {
        return teacher;
    }
    public Entity setTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }
    public String getRequirements() {
        return requirements;
    }
    public Entity setRequirements(String requirements) {
        this.requirements = requirements;
        return this;
    }
}
