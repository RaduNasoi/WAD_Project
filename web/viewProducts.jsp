
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body style="    background-image: url(http://www.cafeitalia.com.au/Content/images/background/restaurant.jpg);
    background-size: cover;">
        <div>     
           
          <a href="LogoutController" id="log_out"> Logout </a><br />
            <form method="post" action="buyController" class="view_products_b">
                <%
              
String user=(String)session.getAttribute("username");
if(user!=null){     
                    %>
                    
                    
                    <c:forEach var="product" items="${applicationScope.productLists}">
                    <c:out value="${product.toString()}" />
                    <input type="text" name="quantity_${product.getID()}" value="" placeholder="Quantity" /><br />
                    <af:outputText  value="${msg.TCW_SELECT_PART_ANALYSIS}" />
                   
                </c:forEach>
                
                <input type="submit" id="sumbit_go_menu" name="commit" value="Buy"/>

                <%}

else{

%>
 
 <c:forEach var="product" items="${applicationScope.productLists}">
                    <c:out value="${product.toString()}"/>
                    <af:outputText value="${msg.TCW_SELECT_PART_ANALYSIS}" />
                    <br />
                </c:forEach>
                    <a href="login.jsp" id="view_not_connected"> Login </a>
                    <br>
    <%}%>
            </form>
           
        </div>
            
    </body>
</html>
