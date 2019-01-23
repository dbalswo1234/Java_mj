package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import product.DBConnectionMgr;

public class ProductDAO {
	
	Connection con;
	DBConnectionMgr pool;
	
	public  ProductDAO() {
		pool = DBConnectionMgr.getInstance();
	}  //DBConnectionMgr.java에서 만든 pool객체
	
	
	public void insert(ProductDTO dto) throws Exception {
		con = pool.getConnection();
		
		String sql = "insert into product values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getpTitle());
		ps.setString(3, dto.getpContent());
		ps.setInt(4, dto.getPrice());
		
		ps.executeUpdate();
		System.out.println("SQL문 실행");
		ps.close();
		System.out.println("ps종료");
		
	}
	
	public ProductDTO select(String input) throws Exception{
		con = pool.getConnection();
		
		String sql = "select * from product where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, input);  //input값으로 sql문의 id에 대입
		
		ResultSet rs = ps.executeQuery();
		ProductDTO dto = null;
		
		while(rs.next()) {
			dto = new ProductDTO();
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			int price = rs.getInt(4);
			
			dto.setId(id);
			dto.setpTitle(title);
			dto.setpContent(content);
			dto.setPrice(price);
			
		}
		ps.close();
		
		return dto;
	}
	
	public ArrayList<ProductDTO> seletAll() throws Exception{
		
		con = pool.getConnection();
		
		String sql = "select * from product";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<ProductDTO> list = new ArrayList<>();
		ProductDTO dto = null;
		
		while(rs.next()) {
			dto = new ProductDTO();
			
			dto.setId(rs.getString(1));
			dto.setpTitle(rs.getString(2));
			dto.setpContent(rs.getString(3));
			dto.setPrice(rs.getInt(4));
			
			list.add(dto);
		}
		ps.close();
		
		return list;
	}
	
	
	public void delete(String input) throws Exception {
		
		con = pool.getConnection();
		
		String sql = "delete from product where id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, input);
		
		ps.executeUpdate();
		System.out.println("삭제완료");
		ps.close();
	}
	
	
	
	
	
	public void update(ProductDTO dto) throws Exception {
		con = pool.getConnection();
		
		//3. SQL문 객체화
		String sql = "update product set pTitle=?, pContent=?, price=? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(4, dto.getId());
		ps.setString(1, dto.getpTitle());
		ps.setString(2, dto.getpContent());
		ps.setInt(3, dto.getPrice());
		
		ps.executeUpdate();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // 	Class종료

