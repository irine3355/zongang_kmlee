<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectivWitespaces="true" %>
<%@ tag import="org.choongang.member.MemberUtil" %>
<% if (MemberUtil.isLogin(request)) { %>
<jsp:doBody />
<% } %>
