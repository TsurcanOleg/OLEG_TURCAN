package SQL_homework_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDataBase {

    private static Connection instance = null;

    public ConnectionToDataBase() {
    }
    public static Connection getInstance (String jdbc, String UserName, String Password) throws SQLException {
        if (instance != null)
            return instance;
        return DriverManager.getConnection(jdbc, UserName, Password);
    }
    public static void closeConnection () throws SQLException {
        instance.close();
        instance = null;
    }
}
