<%-- 
    Document   : viewTransactions
    Created on : Mar 20, 2017, 2:37:49 AM
    Author     : Radu95
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="PurchaseController" id="link"> &larr; History of transactions</a>
        <h3 style="font-size: 25px; text-align: center; color: green;">Your total payment is: ${requestScope.totalprice} RON, you bought ${requestScope.totalQuantity} products.  </h3>
        <h5 style="text-align: center; color: #880000"> <it>* In this price we included the transport fee for your area</it></h5>
    </body>
</html>
