<%-- 
    Document   : PurchaseView
    Created on : Mar 27, 2017, 1:33:23 AM
    Author     : Radu95
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
               
        <h1>History: </h1>
        <form action="viewProducts.jsp"><input type="submit" name="commit" id="product_view_form" value="Back"/></form>

                    
                    <br>
                    <c:forEach var="purchase" items="${requestScope.purchaseList}">
                    <p style="color: green; margin: 1px;"><c:out value="${purchase.toString()}"/></p>
                    <af:outputText value="${msg.TCW_SELECT_PART_ANALYSIS}" />
                   
                </c:forEach>

  
 <a href="LogoutController" id="log_out" style="margin-top: 10px; display: block;"> Logout </a>
    </body>
</html>
