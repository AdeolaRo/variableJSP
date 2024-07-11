package org.example.variablejsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "variableServlet", value = "/variables")
public class VariableServlet extends HttpServlet {
    private String prenom;
    private String nom;
    private List<String> prenoms;

    @Override
    public void init() throws ServletException {
        prenom = "Ana";
        nom = "chitou";
        prenoms = new ArrayList<String>();
        prenoms.add("Margaux");
        prenoms.add("Lucie");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("leprenom", prenom);
        req.setAttribute("lenom", nom);
        req.setAttribute("prenoms", prenoms);
        req.getRequestDispatcher("variables.jsp").forward(req, resp);

    }

}
