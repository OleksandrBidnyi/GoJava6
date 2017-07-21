package module5.todolist.servlets;

import module5.todolist.models.AbstractTask;
import module5.todolist.models.Person;
import module5.todolist.store.PersonCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * edit person
 */
public class PersonEditServlet extends HttpServlet {

    private static final PersonCache PERSON_CACHE = PersonCache.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.setAttribute("person", this.PERSON_CACHE.get(Integer.valueOf(req.getParameter("id"))));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/person/EditPerson.jsp");
        dispatcher.forward(req, resp);
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        this.PERSON_CACHE.edit(new Person(Integer.valueOf(req.getParameter("id")), req.getParameter("nameOfPerson"),
                new AbstractTask(req.getParameter("nameOfTask"), req.getParameter("abilityOfTask"), req.getParameter("taskStatus"),
                        req.getParameter("descriptionOfTask"))));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/person/view"));

    }
}
