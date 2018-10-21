
<%--
    Document   : clist
    Created on : Jul 24, 2018, 4:00:40 PM
    Author     : ccarr
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact List - Contact Application </title>
        <s:url var="url_css" value="/static/css/style.css"/>
        <link href="${url_css}" rel="stylesheet" type="text/css"/>

        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src ="${url_jqlib}"><\/script>')</script>

        <script>
            window.onload = function() {
                // alert('Window Loaded');

                var service = "http://localhost:8080/user/api/contact";
                $.ajax({
                    dataType: "json",
                    type: "GET",
                    url: service + "/getAllContacts",
                    success: success
                });

            }

            function success(e)
            {
                var drill="";
                $.each(e, function (index,value)
                {

                    drill += "<p>Drill Number: " + value.drill_id + "</p>";
                    drill += "<h2>Drill Name: " + value.name + "</h2>";
                    drill += "<p>Skill level: " + value.level_id + "</h2>";
                    drill += "<div style ='border-bottom: 1px solid black;'></div>";

                });
                $('#drills').html(drill);
            }

        </script>


    </head>
    <s:url var="url_bg" value="/static/images/javabg.jpg"/>
    <body background="${url_bg}">
        <table border="1" width="80%" align="center">
            <tr>
                <td height="80px">
                    <%-- Header --%>
                    TO DO: New front end to consume ReST API
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
                <td height="350px" valign="top" width="100%">
                    <%-- Page Content Area--%>
                    <h3>Contact List</h3>
                    <c:if test="${param.act eq 'sv'}">
                        <p class="success">Contact Saved Successfully</p>
                    </c:if>
                    <c:if test="${param.act eq 'del'}">
                        <p class="success">Contact Deleted Successfully</p>
                    </c:if>


                    <table width="100%">
                        <tr>
                            <td align="right" >
                                <form action="<s:url value="/user/contact_search"/>">
                                    <input type="text" name="freeText" value="${param.freeText}" placeholder="Enter Text To Search">
                                    <button>Find</button>
                                </form>
                            </td>                           
                        </tr>
                    </table>

                    <form action="<s:url value="/user/bulk_cdelete"/>">           
                        <button>Delete Selected Records</button> <br/><br/>
                        <table border="1" cellpadding="3"  width="100%">
                            <tr>
                                <th>SELECT</th>
                                <th>#</th>
                                <th>CID</th>
                                <th>NAME</th>
                                <th>PHONE</th>
                                <th>EMAIL</th>
                                <th>ADDRESS</th>
                                <th>REMARK</th>
                                <th>ACTION</th>
                            </tr>

                            <c:if test="${empty contactList}">
                                <tr>
                                    <td align="center" colspan="8" class="error">No Records Present</td>
                                </tr>
                            </c:if>

                            <c:forEach var="c" items="${contactList}" varStatus="st">
                                <tr>
                                    <td align="center"><input type="checkbox" name="cid" value="${c.contactId}"/></td>
                                    <td>${st.count}</td>
                                    <td>${c.contactId}</td>
                                    <td>${c.name}</td>
                                    <td>${c.phone}</td>
                                    <td>${c.email}</td>
                                    <td>${c.address}</td>
                                    <td>${c.remark}</td>    
                                    <s:url var="url_del" value="/user/del_contact">
                                        <s:param name="cid" value="${c.contactId}"/>
                                    </s:url>   
                                    <s:url var="url_edit" value="/user/edit_contact">
                                        <s:param name="cid" value="${c.contactId}"/>
                                    </s:url> 
                                    <td><a href="${url_edit}">Edit</a> | <a href="${url_del}">Delete</a></td>
                                </tr> 
                            </c:forEach>
                        </table>
                    </form>     
                </td>
            </tr>
            <tr>
                <td height="25px">
                    <%-- Footer --%>
                    <jsp:include page="include/footer.jsp"/>
                </td>
            </tr>
        </table>
    </body>
</html>
