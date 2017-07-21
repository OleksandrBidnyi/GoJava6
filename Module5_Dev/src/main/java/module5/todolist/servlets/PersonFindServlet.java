package module5.todolist.servlets;

import module5.todolist.store.PersonCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * find
 */
public class PersonFindServlet extends HttpServlet {

    private final PersonCache PERSON_CACHE = PersonCache.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        if (req.getParameter("nameOfPerson") != null || req.getParameter("nameOfTask") != null)
        req.setAttribute("findedPersons", this.PERSON_CACHE.finded(req.getParameter("nameOfPerson"), req.getParameter("nameOfTask")));
        req.getRequestDispatcher("/views/person/FindPerson.jsp").forward(req, resp);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        doGet(req, resp);
    }
}