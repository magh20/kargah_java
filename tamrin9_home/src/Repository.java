import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379");
        connection.setAutoCommit(false);
    }
    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into courses (id, name, teacher, capacity, requirements) values (?,?,?,?,?)");
        preparedStatement.setInt(1, entity.getId());
        preparedStatement.setString(2, entity.getName());
        preparedStatement.setString(3, entity.getTeacher());
        preparedStatement.setInt(4, entity.getCapacity());
        preparedStatement.setString(5, entity.getRequirements());
        preparedStatement.executeUpdate();
    }
    public List<Entity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from courses");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Entity> entityList = new ArrayList<>();
        while (resultSet.next()) {
            Entity entity = new Entity();
            entity.setId(resultSet.getInt("id"));
            entity.setName(resultSet.getString("name"));
            entity.setTeacher(resultSet.getString("teacher"));
            entity.setCapacity(resultSet.getInt("capacity"));
            entity.setRequirements(resultSet.getString("requirements"));
            entityList.add(entity);
        }
        return entityList;
    }
    public void commit() throws Exception {
        connection.commit ();
    }
    public void rollback() throws Exception {
        connection.rollback ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}