package module5.todolist.servlets;

import module5.todolist.models.AbstractTask;
import module5.todolist.models.Person;
import module5.todolist.store.PersonCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * create person
 */
public class PersonCreateServlet extends HttpServlet {

    final AtomicInteger ids = new AtomicInteger();

    private final PersonCache PERSON_CACHE = PersonCache.getInstance();

    @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        this.PERSON_CACHE.add(new Person(this.ids.incrementAndGet(), req.getParameter("nameOfPerson"),
                new AbstractTask(req.getParameter("nameOfTask"), req.getParameter("abilityOfTask"), req.getParameter("taskStatus"),
                        req.getParameter("descriptionOfTask"))));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/person/view"));
    }
}
