package br.ufg.inf.servlets;

import br.ufg.inf.models.Carrinho;

import javax.print.attribute.IntegerSyntax;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CarrinhoServlet extends HttpServlet{

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
        RequestDispatcher view = req.getRequestDispatcher("/carrinho/new.html");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] produtos = req.getParameterValues("produtos");
        Carrinho carrinho = new Carrinho();

        for (String p : produtos) {
            int codigoProduto = Integer.parseInt(p);
            carrinho.addProduto(codigoProduto, 0);
        }
    }
}
