<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="board.entities.BoardData" %>
<jsp:useBean id="item" class="board.entities.BoardData" scope="request"/>
<jsp:setProperty name="item" property="*" />

<%--
<jsp:setProperty name="item" setProperty="subject"  />
<jsp:setProperty name="item" setProperty="content"  />
<jsp:setProperty name="item" setProperty="poster"  />
--%>

제목:
내용:
작성자: