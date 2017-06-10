<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<% request.getAttribute("produtosAdicionados"); %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div class="row">
  <div class="col-xs-6 col-xs-offset-3">
    <h3 class="text-center">Supermercado Web</h3>
  </div>
</div>
<div class="row">
  <div class="col-xs-4 col-xs-offset-4">
    <c:if test="${produtosAdicionados != null && produtosAdicionados.size() > 0}">
      <div style="margin-bottom: 8px;">
          <div class="alert alert-success">
            <p>Produto(s) adicionado(s) ao carrinho: </p>
            <ul>
              <c:forEach var="produto" items="${produtosAdicionados}">
                <li>
                    ${produto.getNome()}
                </li>
              </c:forEach>
            </ul>
          </div>
      </div>
    </c:if>
    <div style="margin-bottom: 8px;">
        <a href="/produto/new.html" class="btn btn-primary btn-block"><i class="fa fa-diamond"> Produto</i></a>
    </div>
    <div style="margin-bottom: 8px;">
        <a href="/endereco/new.html" class="btn btn-primary btn-block"><i class="fa fa-map"> Endereço</i></a>
    </div>
    <div style="margin-bottom: 8px;">
        <a href="/carrinho" class="btn btn-primary btn-block"><i class="fa fa-shopping-cart"> Carrinho</i></a>
    </div>
  </div>
</div>
</body>
</html>