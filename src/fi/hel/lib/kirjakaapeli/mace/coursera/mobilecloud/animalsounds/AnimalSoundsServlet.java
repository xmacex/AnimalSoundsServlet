package fi.hel.lib.kirjakaapeli.mace.coursera.mobilecloud.animalsounds;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A little Java Servlet for generating animal sounds
 *
 * @author Mace Ojala <mace@kirjakaapeli.lib.hel.fi>
 */
public class AnimalSoundsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	String animal = req.getParameter("animal");

	// sorted, let's respond with a sound
	resp.setContentType("text/plain");
	if(animal == null) {
	    resp.getWriter().write("(the wind alone blows in the woods)");
	} else if(animal.equals("")) {
	    resp.getWriter().write("...hiding in the woods, an ancient mystery");
	} else if(animal.equals("badger")) {
	    resp.getWriter().write("urmph");
	} else if(animal.equals("moose")) {
	    resp.getWriter().write("mmmoooo");
	} else {
	    // just the wind in the woods
	    resp.getWriter().write("what does the " + animal + " say?");
	}
    }
}
