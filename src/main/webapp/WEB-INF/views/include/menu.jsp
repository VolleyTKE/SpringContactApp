<%-- 
    Document   : menu
    Created on : Jul 20, 2018, 3:02:57 PM
    Author     : ccarr
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>

<s:url var="url_logout" value="/logout"/>

<c:if test="${sessionScope.userId==null}">
    <s:url var="url_reg_form" value="/reg_form/"/>
    <a href="#">Home</a> | <a href="#">Login</a> | <a href="${url_reg_form}">Register</a> | <a href="#">About</a>    
</c:if>

<c:if test="${sessionScope.userId!=null && sessionScope.role==1}">
    <a href="#">Home</a> | <a href="#">User List</a> | <a href="${url_logout}">Logout</a> | <a href="#">Help</a>    
</c:if>
    
<c:if test="${sessionScope.userId!=null && sessionScope.role==2}">
    <a href="#">Home</a> | <a href="#">add Contact</a> | <a href="#">contactlist</a> | <a href="#">Help</a> | <a href="${url_logout}">logout</a>    
</c:if>