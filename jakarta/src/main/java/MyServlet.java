import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {
        String q = req.getParameter("q");
        resp.getWriter().print("<html><body><h1>Hello world 2! " + q + "</h1></body></html>");
        resp.setStatus(200);
        req.getRequestDispatcher("SecondServlet.jsp").forward(req, resp);
    }
}
