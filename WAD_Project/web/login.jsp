<%-- 
    Document   : login
    Created on : Apr 3, 2017, 3:08:12 AM
    Author     : Radu95
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<head>
  <meta charset="utf-8">
  <title>Login Form</title>
  <link rel="stylesheet" href="css/style.css">
  </head>
<body>
  <section class="container">
    <div class="login">
      <h1>Login to Web App</h1>
      <form method="post" action="loginController">
        <p><input type="text" name="login" value="" placeholder="Username or Email"></p>
        <p><input type="password" name="password" value="" placeholder="Password"></p>
        <p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="Login"></p>
      </form>
     <a href='viewProducts.jsp'> View Products without registration </a>
    </div>
</body>
</html>