import model.Carro;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CarroRepository extends MainRepository {
    public CarroRepository(RevendedoraConn db) {
        super(db);
    }

    public ArrayList<Carro> findAll() throws SQLException {
        ArrayList<Carro> carros = new ArrayList<>();

        Statement stat = db.getConn().createStatement();

        ResultSet rs = null;
        rs = stat.executeQuery("select * from carro;");

        while (rs.next()) {
            carros.add(new Carro(rs.getInt("id"), rs.getString("nome"), rs.getInt("ano")));
        }

        rs.close();

        return carros;
    }
}
