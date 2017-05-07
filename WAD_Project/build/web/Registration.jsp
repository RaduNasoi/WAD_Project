<%-- 
    Document   : index
    Created on : Apr 3, 2017, 1:54:12 AM
    Author     : Radu95
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <link rel="stylesheet" href="style.css" type="text/css"/>
        <title>Registration</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        
        
        <div id="content">
        <div class="header">
<!--            <img src="./img/companyLogo.jpg" style="width:100px"  />-->
            <span class="header-text">Xin Yang</span>
        </div>
        <nav>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="login.jsp">Login</a></li>
            </ul>
        </nav>
            <h1>Registration form</h1>   
            <form method="post" action="RegistrationController"> 
                <div class="form-element">
                    <label for="name">Name</label>
                    <input type="text" name="name" id="name" size="40">
                </div>
                <div class="form-element">
                    <label for="username">Username</label>
                    <input type="text" name="username" id="username">
                </div>
                <div class="form-element">
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password">
                </div>
                <div class="form-element">
                    <label for="rPassword">Repeat password</label>
                    <input type="password" name ="rpassword" id="rPassword">
                </div>
                
                <button  type=button onclick="getLocation()">Adress</button>
                <p name = "demo" id="demo"></p>
                <p name ="demo2" id="demo2"></p>
                <script>
                var lat = document.getElementById("demo");
                var lng = document.getElementById("demo2");
                function getLocation() {
                    if (navigator.geolocation) {
                        navigator.geolocation.getCurrentPosition(showPosition);
                    } else { 
                        x.innerHTML = "Geolocation is not supported by this browser.";
                    }
                }

                function showPosition(position) {
                    document.getElementById("hiddenField").value=position.coords.latitude + " " + position.coords.longitude;
                 
                }
                </script>
                 <input name ="hidden" type="hidden" id="hiddenField"/>
              
<!--                <div class="form-element">
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email">
                </div>
                <div class="form-element">
                    <label for="gender">Gender</label>
                    Male<input type="radio" name="gender" value="male"> 
                    Female<input type="radio" name="gender" value="female"> 
                </div>
                <div class="form-element">
                    <label for="tel">Telephone</label>
                    <input type="tel" name="tel" id="tel">
                </div>
                <div class="form-element">
                    <label for="country">Country</label>
                    <select name="country" id="country">
                        <option>Romania</option>
                        <option>Italy</option>
                        <option>France</option>
                        <option>Germany</option>
                    </select>
                </div>
                <div class="form-element">
                    <label for="spam">Subscribe to maillist</label>
                    <input type="checkbox" name="spam" id="spam"> 
                </div> -->
                  <div class="form-element">
                      <input type="submit" value="Submit">
                   
                </div> 
                      
                    
            </form>
            
        </div>
    </body>
</html>
