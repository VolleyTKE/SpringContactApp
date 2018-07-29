<%-- 
    Document   : hello
    Created on : Jul 13, 2018, 10:52:30 AM
    Author     : ccarr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1" width="80%" align="center" >
            <tr>
                <td height="80px">
                    <%-- Header --%>
                    <jsp:include page="menu.jsp"/>
                </td>
            </tr>
        </table>
        <h1>Hello World!</h1>
        <p>This is the hello.jsp in the test controller</p>
    </body>
</html>
