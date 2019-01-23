<%@page import="product.ProductDAO"%>
<%@page import="product.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String pid = request.getParameter("id");
	
		ProductDTO dto = new ProductDTO();
		ProductDAO dao = new ProductDAO();
		
		dao.delete(pid);
		
		
	%>
	
	<hr>
	<h2>삭제 완료!!</h2>
</body>
</html>