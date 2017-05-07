<%-- 
    Document   : menu
    Created on : Apr 3, 2017, 3:54:08 AM
    Author     : Radu95
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<<<<<<< HEAD
        <link rel="stylesheet" href="style.css">
=======
>>>>>>> 60ec931fe0292a9faa61ef4c99663e8ddeaf9743
        <title>JSP Page</title>
    </head>
    <body>
        <div>     
           
          
            <form method="post" action="buyController">
                <%
              
<<<<<<< HEAD
String user=(String)session.getAttribute("username");

=======
String user=(String)session.getAttribute("login");
>>>>>>> 60ec931fe0292a9faa61ef4c99663e8ddeaf9743
if(user!=null){     
                    %>
                    <a href="LogoutController"> Logout </a>
                    <br>
<<<<<<< HEAD
                    <p>Name || Weight || Price || Quantity<p>
                    <br>
                    <c:forEach var="product" items="${applicationScope.productLists}">
                    <c:out value="${product.getName()}   ${product.getWeight()} ${product.getPrice()}"/>
=======
                    <c:forEach var="product" items="${applicationScope.productLists}">
                    <c:out value="${product.toString()}"/>
>>>>>>> 60ec931fe0292a9faa61ef4c99663e8ddeaf9743
                    <input type="text" name="quantity_${product.getID()}" value="" placeholder="Quantity" />
                    <af:outputText value="${msg.TCW_SELECT_PART_ANALYSIS}" />
                    <br />
                </c:forEach>
                
                <input type="submit" name="commit" value="Buy"/>

                <%}

else{

%>
 
 <c:forEach var="product" items="${applicationScope.productLists}">
                    <c:out value="${product.toString()}"/>
                    <af:outputText value="${msg.TCW_SELECT_PART_ANALYSIS}" />
                    <br />
                </c:forEach>
<<<<<<< HEAD
                    <a href="login.jsp"> Login </a>
=======
                    <a href="login.html"> Login </a>
>>>>>>> 60ec931fe0292a9faa61ef4c99663e8ddeaf9743
                    <br>
    <%}%>
            </form>
        </div>
    </body>
</html>
