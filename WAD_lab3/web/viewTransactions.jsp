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
        <title>JSP Page</title>
    </head>
    <body>
        <a href="PurchaseController">History of transactions</a>
        <h3>Your total payment is: ${requestScope.totalprice} RON, you bought ${requestScope.totalQuantity} Gadgets.   </h3>
    </body>
</html>
