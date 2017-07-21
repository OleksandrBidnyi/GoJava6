package module5.todolist.servlets;

import module5.todolist.store.PersonCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * view person
 */
public class PersonViewServlet extends HttpServlet {

    private final PersonCache PERSON_CACHE = PersonCache.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.setAttribute("persons", this.PERSON_CACHE.values());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/person/PersonView.jsp");
        dispatcher.forward(req, resp);
    }
}
