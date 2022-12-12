import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "admin";

        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();

        String tableName = "\"test\".\"Person\"";

        String insertName = "Mihai Popescu";
        int insertAge = 25;

        String insertPersonQuery = "insert into "+tableName+" values('{"+insertName+"}',"+insertAge+")";

        statement.execute(insertPersonQuery);

    }
}

