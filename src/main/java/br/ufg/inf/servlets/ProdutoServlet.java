package br.ufg.inf.servlets;

import br.ufg.inf.models.Estoque;
import br.ufg.inf.models.Produto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProdutoServlet extends HttpServlet {

    private Estoque estoque;

    @Override
    public void init() throws ServletException {
        super.init();
        this.estoque = new Estoque();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/produto/new.html");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        int codigo = Integer.parseInt(req.getParameter("codigo"));
        Double preco = Double.parseDouble(req.getParameter("preco"));

        Produto produto = new Produto(codigo, nome, preco);
        this.estoque.adicionaProduto(produto);

        resp.sendRedirect("/produto/new.html");
    }
}
