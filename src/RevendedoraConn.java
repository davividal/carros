import javax.servlet.ServletContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RevendedoraConn {
    private static RevendedoraConn instance;
    private Connection conn;

    public static RevendedoraConn getInstance(ServletContext context) {
        if (null == instance) {
            instance = new RevendedoraConn(context);
        }

        return instance;
    }

    private RevendedoraConn(ServletContext context) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revendedora", "revendedora", "revendedora");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }
}
