package br.ufg.inf.servlets;

import br.ufg.inf.models.Carrinho;
import br.ufg.inf.models.Estoque;
import br.ufg.inf.models.Produto;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

public class CarrinhoServlet extends HttpServlet{

    private Estoque estoque;

    @Override
    public void init() throws ServletException {
        super.init();
        this.estoque = new Estoque();
        carregarProdutosTeste();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/carrinho/new.jsp");
        req.setAttribute("produtos", this.estoque.getProdutos());
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/");
        String[] idsProdutos = req.getParameterValues("produtos");
        ArrayList<Produto> produtos = new ArrayList<>();
        Carrinho carrinho = new Carrinho();

        if (idsProdutos == null) {
            view.forward(req, resp);
        }

        for (String p : idsProdutos) {
            int codigoProduto = Integer.parseInt(p);
            Produto produto = estoque.buscaProdutoPeloCodigo(codigoProduto);
            produtos.add(produto);
            carrinho.addProduto(produto, 0);
            req.getSession().setAttribute("carrinho", carrinho);
        }

        req.setAttribute("produtosAdicionados", produtos);
        view.forward(req, resp);
    }

    private void carregarProdutosTeste() {
        this.estoque.adicionaProduto(new Produto(1, "Banana", 12));
        this.estoque.adicionaProduto(new Produto(2, "Maçã", 2.3));
        this.estoque.adicionaProduto(new Produto(3, "Morango", 21.20));
        this.estoque.adicionaProduto(new Produto(4, "Abacaxi", 5.67));
    }
}
