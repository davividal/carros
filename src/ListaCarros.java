import model.Carro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/lista-carros")
public class ListaCarros extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Carro> carros = null;
        try {
            carros = new CarroRepository(RevendedoraConn.getInstance(this.getServletContext())).findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("listaCarros", carros);
        req.getRequestDispatcher("/lista-carros.jsp").forward(req, resp);
    }
}
