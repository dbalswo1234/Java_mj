<%@page import="javax.swing.JOptionPane"%>
<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		String id = JOptionPane.showInputDialog(null, "상품id를 입력하세요.");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int price = Integer.parseInt(request.getParameter("price"));
		
		
		ProductDTO dto = new ProductDTO();
		
		dto.setId(id);
		dto.setpTitle(title);
		dto.setpContent(content);
		dto.setPrice(price);
		
		ProductDAO dao = new ProductDAO(); 
		dao.update(dto);
	%>
	
	수정된 id: <%= dto.getId() %><br>
	수정된 상품제목: <%= dto.getpTitle() %><br>
	수정된 상품설명: <%= dto.getpContent() %><br>
	수정된 상품가격: <%= dto.getPrice() %><br>
</body>
</html>