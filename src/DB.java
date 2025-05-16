import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection connect() throws Exception {
        String url = "jdbc:sqlite:user.db";
        return DriverManager.getConnection(url);
    }
}
