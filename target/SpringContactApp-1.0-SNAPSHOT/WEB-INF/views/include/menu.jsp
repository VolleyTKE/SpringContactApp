<%-- 
    Document   : menu
    Created on : Jul 20, 2018, 3:02:57 PM
    Author     : ccarr
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>

<s:url var="url_logout" value="/logout"/>

<c:if test="${sessionScope.userId==null}">
    <s:url var="url_home" value="/index"/>
    <s:url var="url_reg_form" value="/reg_form/"/>
    <a href="${url_home}">Home</a> | <a href="${url_home}"Login</a> | <a href="${url_reg_form}">Register</a> | <a href="#">About</a>    
</c:if>

<c:if test="${sessionScope.userId!=null && sessionScope.role == 1}">
    <%-- Admin is logged in : Admin Menu --%>    
    <%--Notice secondary use of s:url --%>
    <a href="<s:url value="/admin/dashboard"/>">Home</a> | <a href="<s:url value="/admin/users"/>">User List</a> | <a href="${url_logout}">Logout</a>  
</c:if>
    
<c:if test="${sessionScope.userId!=null && sessionScope.role==2}">
    <%-- General User is logged in : User Menu --%>
    <s:url var="url_uhome" value="/user/dashboard"/>
    <s:url var="url_cform" value="/user/contact_form"/>
    <s:url var="url_clist" value="/user/clist"/>
    <a href="${url_uhome}">Home</a> | <a href="${url_cform}">add Contact</a> | <a href="${url_clist}">contact list</a> | <a href="#">Help</a> | <a href="${url_logout}">logout</a>    
</c:if>