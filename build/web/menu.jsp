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
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div>     
           
           <a href="LogoutController" id="log_out"> Logout </a>
            <form method="post" action="buyController" style="padding-left: 20px; width: 600px;" class="new_menu_b">
                <%
              
String user=(String)session.getAttribute("username");

if(user!=null){     
                    %>
                   
                    <br>
                   
                       
                    <p style="font-size: 18px; color: #880000;" id="test_b">Name  </p>
                   <p style="font-size: 18px;color: #880000;" id="test_b">Weight </p>
                   <p style="font-size: 18px;color: #880000;" id="test_b"> Price </p>
                   <p style="font-size: 18px;color: #880000;" id="test_b"> Quantity</p>
                    <c:forEach var="product" items="${applicationScope.productLists}">
                    <p id="test_b"><c:out value="${product.getName()}  "/></p>
                    <p id="test_b"> <c:out value="   ${product.getWeight()} "/></p>
                    <p id="test_b">  <c:out value=" ${product.getPrice()}"/></p>
                    <input type="text" name="quantity_${product.getID()}" value=""  placeholder="Quantity" /><br>
                    <af:outputText value="${msg.TCW_SELECT_PART_ANALYSIS}" />
                    
                </c:forEach>
                
                <input type="submit" name="commit" id="menu_go_b" value="Buy"/>

                <%}

else{

%>
 
 <c:forEach var="product" items="${applicationScope.productLists}">
                    <c:out value="${product.toString()}"/>
                    <af:outputText value="${msg.TCW_SELECT_PART_ANALYSIS}" />
                    <br />
                </c:forEach>
                    <a href="login.jsp"> Login </a>
                    <br>
    <%}%>
            </form>
        </div>
    </body>
</html>
