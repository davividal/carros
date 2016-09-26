import java.sql.Connection;

public class MainRepository {
    protected Connection connection;
    protected RevendedoraConn db;

    public MainRepository(RevendedoraConn db) {
        this.db = db;
        this.connection = db.getConn();
    }
}
