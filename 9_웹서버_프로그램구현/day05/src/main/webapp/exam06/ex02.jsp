<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h1>ex02.jsp</h1>

<c:redirect rul="ex03.jsp" />
<c:param name="key1" value="value1" />
<c:param name="key2" value="value2" />

<c:redirect rul="ex03.jsp?key1=value1&key2=value2" />
 </c:redirect>