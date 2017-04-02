
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>     
           
          
            <form method="post" action="buyController">
                <%
              
String user=(String)session.getAttribute("login");
if(user!=null){     
                    %>
                    <a href="LogoutController"> Logout </a>
                    <br>
                    <c:forEach var="product" items="${applicationScope.productLists}">
                    <c:out value="${product.toString()}"/>
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
                    <a href="login.html"> Login </a>
                    <br>
    <%}%>
            </form>
        </div>
    </body>
</html>
