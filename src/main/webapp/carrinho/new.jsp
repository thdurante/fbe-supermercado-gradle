<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<% request.getAttribute("produtos"); %>

<!DOCTYPE html>
<html>
<head>
    <title>Carrinho de compra</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div class="row">
    <div class="col-xs-6 col-xs-offset-3">
        <h3 class="text-center">Carrinho</h3>
    </div>
</div>
<div class="row">
    <div class="col-xs-6 col-xs-offset-3">
        <form method="post">
            <c:forEach var="produto" items="${produtos}">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="produtos" value="${produto.getCodigo()}">
                        ${produto.getNome()}
                        <span class="label label-primary">R$${produto.getPreco()}</span>
                    </label>
                </div>
            </c:forEach>

            <button type="submit" class="btn btn-primary btn-block">Adicionar ao Carrinho</button>
        </form>
    </div>
</div>
</body>
</html>