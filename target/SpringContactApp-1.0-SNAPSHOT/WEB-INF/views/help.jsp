<%-- 
    Document   : help
    Created on : Jul 28, 2018, 11:05:36 PM
    Author     : chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Spring ags import --%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HELP PAGE</title>
        
        <%-- You should never use href directly 
        <link href="static/css/style.css" rel="stylesheet" type="text/css"/>
        --%>
        <s:url var="url_css" value="/static/css/style.css"/>
        <link href="${url_css}" rel="stylesheet" type="text/css"/>
        
    </head>
    <s:url var="url_bg" value="/static/images/javabg.jpg"/>
                 
    <s:url var="url_home" value="/user/dashboard"/>
    <body background="${url_bg}" >
        <h1>Hello, Welcome to the help page!</h1>
        <h3><a href="${url_home}">Home</a></h3>
    
        <p>
            I'd like to mention several things here.
        </p>
        <ol>
            <li>You can find the github for my version of this project 
                <a href="https://github.com/VolleyTKE/SpringContactApp" >HERE!</a></li>
            <li>I didn't create this project. I cloned the original tutorial 
                <a href="https://github.com/VikramThakur8/SpringContactApp">HERE!</a></li>
            <li>As I worked through this project, I add some of my own embellishments and will add more.
                per my <a href="https://github.com/VolleyTKE/SpringContactApp/issues" >Issues github page</a></li>
            <li>Below, I expose a github ReST API that shows you current issues for this project</li>
        </ol>
        
        <h2>Actual Help</h2>
        <ul>FAQ
            <li>No this isn't secure, its an example test app.</li>
            <li>If you're a new user register, then sign in. Start adding contacts.</li>
            <li>If you're lucky, or message me on github, I'll make you an admin.</li>
            <li>Don't forget to log out. It's not secure!</li>
        </ul>
            
    </body>
</html>
