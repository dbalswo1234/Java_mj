<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="product.ProductDAO"%>
<%@page import="product.ProductDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ProductDTO dto = null;
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> list = new ArrayList();
		
		list = dao.seletAll();
	
		for(int i=0; i<list.size(); i++){
			dto = new ProductDTO();
			dto = list.get(i);
	%>
	
	<hr> 
	====전체 검색리스트==== 
	
	상품id: &nbsp;<%= dto.getId() %><br>
	상품제목: &nbsp;<%= dto.getpTitle( )%><br>
	상품설명: &nbsp;<%= dto.getpContent() %><br>
	상품가격: &nbsp;<%= dto.getPrice() %><br>
	<hr>
	<br>
	<%
		}
	%>
</body>
</html>