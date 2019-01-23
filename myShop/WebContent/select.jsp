<%@page import="java.util.ArrayList"%>
<%@page import="product.ProductDAO"%>
<%@page import="product.ProductDTO"%>
<%@page import="com.sun.xml.internal.txw2.Document"%>
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
		String id = request.getParameter("id");
	
		ProductDTO dto = new ProductDTO();
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> list = new ArrayList();
		
		dto = dao.select(id);
	%>
	
	상품id: &nbsp;<%= dto.getId() %><br>
	상품제목: &nbsp;<%= dto.getpTitle() %><br>
	상품설명: &nbsp;<%= dto.getpContent() %><br>
	상품가격: &nbsp;<%= dto.getPrice() %><br>
</body>
</html>