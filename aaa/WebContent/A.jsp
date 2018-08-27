<%@ include file="B.jsp"  %>
<%@ page language="java" %>
<%@ page import="java.util.*"  %>
<%@ page info="my first jsp page"  %>
<%@ page contentType="text/html" %>
<%@ page extends="com.A1" %>

<jsp:include page="Ah.jsp"/>
<jsp:forward page="Ah.jsp"/> 
<jsp:param value="abs" name="param1"/>
<jsp:useBean id="h1" class=com.HaveFour/>
<%! int j=10; %>
<%! public static void test(){} %>
<% String s1="ravi"; %>
<%=s1%>
<%=j%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="#" >
User Id    <input type="text" name="userId" "></br></br>
Password      <input type="password" name="password" ";></br></br>
<input type="submit" name="submit" value="Login" >
</form>
</body>
</html>