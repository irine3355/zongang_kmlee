<%@ page contentType="text/html; charset=UTF-8" %>
<form mothod="POST" action='login_ps.jsp'>
이메일 : <input type='text' name='email'><br>
비밀번호 : <input type='password' name='password'><br>
<button type= 'submit'>로그인</button></form>
<%
//스크립틀릿
int num1=100;
int num2=200;
out.write("result="+(num1+num2));
System.out.println(request);

%>

<%!
String name="이이름";
%>
