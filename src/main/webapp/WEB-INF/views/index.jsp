<%-- 
    Document   : index
    Created on : Jul 19, 2018, 5:13:32 PM
    Author     : ccarr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Spring ags import --%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login - Contact App</title>
        
        <%-- You should never use href directly 
        <link href="static/css/style.css" rel="stylesheet" type="text/css"/>
        --%>
        <s:url var="url_css" value="/static/css/style.css"/>
        <link href="${url_css}" rel="stylesheet" type="text/css"/>
        
    </head>
    
    <s:url var="url_bg" value="/static/images/javabg.jpg"/>
    <body background="${url_bg}" >
        <table border="1" width="80%" align="center" >
            <tr>
                <td height="80px">
                    <%-- Header --%>
                    <h1>Contact App - Testing</h1>
                    <jsp:include page="include/header.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="25px">
                    <%-- Menu --%>
                    <jsp:include page="include/menu.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="350px" valign="top">
                    <%-- Page Content --%>
                    <h1>User Login</h1>
                    TODO -HTML Form
                </td>
            </tr>
            <tr>
                <td height ="25px">
                    <jsp:include page="include/footer.jsp" />
                    <%-- Footer --%>
                </td>
            </tr>
            
            
        </table>
    </body>
</html>
