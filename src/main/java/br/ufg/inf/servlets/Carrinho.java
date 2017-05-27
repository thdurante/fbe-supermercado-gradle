package br.ufg.inf.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Carrinho extends HttpServlet{

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/carrinho/index.html");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] produtos = req.getParameterValues("produtos");
    }
}
