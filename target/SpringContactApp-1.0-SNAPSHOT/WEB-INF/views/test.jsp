<%-- 
    Document   : test
    Created on : Jul 26, 2018, 1:54:12 PM
    Author     : ccarr
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <s:url var="url_jqlib" value="/static/js/jquery-3.3.1.min.js" />
        <script src="${url_jqlib}"></script>
        <script>
            $(document).ready(function(){
                //alert('JQuery is ready and integrated');
                $("#id_gettime").click(function(){
                    //alert('Button clicked...');
                    $.ajax({
                        url : 'get_time',
                        success : function (data){
                            $("#id_time").html(data);
                        }
                    });
                });
            });
        </script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ajax Test Page</h1>
        <p>ajax</p>
        
        <button id="id_gettime">Get server time</button><br/>
        <p id="id_time"></p>
    </body>
</html>
