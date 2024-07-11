package org.example.variablejsp;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="servletProfil", value="/servletpros")
public class ServletProfil extends HttpServlet {

 private List<Personne> personnes;


    @Override
    public void init() throws ServletException {
       Personne personne1 = new Personne("Charles", "End",22);
       Personne personne2 = new Personne("Steve", "Between",32);
       Personne personne3 = new Personne("Charlie", "Start",27);
       personnes = new ArrayList<Personne>();
       personnes.add(personne1);
       personnes.add(personne2);
       personnes.add(personne3);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personnes", personnes);
        req.getRequestDispatcher("profil.jsp").forward(req, resp);

    }
}
