package taxi.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static final Properties connectionProp;
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static {
        try (InputStream input = ConnectionUtil.class.getResourceAsStream("/db.properties")) {
            connectionProp = new Properties();
            connectionProp.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Unable to read database connection properties file");
        }

        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(connectionProp.getProperty("db.url"),
                    connectionProp);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
