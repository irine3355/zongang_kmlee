<%@ page contentType="text/html; charset=UTF-8" %>
<%
application.setAttribute("num", 100);
session.setAttribute("num", 200);
request.setAttribute("num", 300);
pageContext.setAttribute("num", 400);

pageContext.setAttribute("max-num", 100);
%>

pageContext.num: ${pageScope.num}<br>
request.num : ${requestScope.num}<br>
application.num : ${applicationScope.num}<br>

max-num: ${pageScope'max-num'}<br>