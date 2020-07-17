import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Service.getInstance().save(new Entity().setId(1).setName("Programming").setTeacher("Zamanifar").setCapacity(30).setRequirements(" "));
            Service.getInstance().save(new Entity().setId(2).setName("Programming Workshop").setTeacher("Zamanifar").setCapacity(30).setRequirements("Programming"));
            Service.getInstance().save(new Entity().setId(3).setName("Math 1").setTeacher("Mosleh").setCapacity(40).setRequirements(" "));
            Service.getInstance().save(new Entity().setId(4).setName("Physics 1").setTeacher("Charkhchi").setCapacity(30).setRequirements(" "));
            Service.getInstance().save(new Entity().setId(5).setName("Andishe Eslami").setTeacher("Hadadi").setCapacity(50).setRequirements(" "));
            Service.getInstance().save(new Entity().setId(6).setName("Persian").setTeacher("Raaei").setCapacity(40).setRequirements(" "));
            Service.getInstance().save(new Entity().setId(7).setName("Advanced Programming").setTeacher("Minofam").setCapacity(20).setRequirements("Programming, Programming Workshop"));
            Service.getInstance().save(new Entity().setId(8).setName("Advanced Programming Workshop").setTeacher("Farshchi").setCapacity(20).setRequirements("Programming, Programming Workshop, Advanced Programming"));
            Service.getInstance().save(new Entity().setId(9).setName("Math 2").setTeacher("Hosseini").setCapacity(40).setRequirements("Math 1, Physics 1"));
            Service.getInstance().save(new Entity().setId(10).setName("Physics 2").setTeacher("Shadrokh").setCapacity(30).setRequirements("Physics 1"));
            Service.getInstance().save(new Entity().setId(11).setName("Enqelab").setTeacher("Nabi Zade").setCapacity(50).setRequirements(" "));
            Service.getInstance().save(new Entity().setId(12).setName("General English").setTeacher("Nasrollahi").setCapacity(40).setRequirements("Pre English"));
        } catch (Exception e) {
            System.out.println("failed to save " + e.getMessage());
        }
        View view = new View();
    }
}