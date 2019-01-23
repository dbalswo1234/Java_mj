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
		 String id = request.getParameter("id");
		String title = request.getParameter("pTitle");
		String content = request.getParameter("pContent");
		int price = Integer.parseInt(request.getParameter("price"));   //파라메터로 넘어온 가격의 값을 int로 변환
		
		ProductDTO dto = new ProductDTO();
		ProductDAO dao = new ProductDAO();
		
		dto.setId(id);
		dto.setpTitle(title);
		dto.setpContent(content);
		dto.setPrice(price);
		
		dao.insert(dto);
		out.print("dto에 담아 보냅니다.");
	%>
	<br>
	<%= id %><br>
	<%= price %>
</body>
</html>