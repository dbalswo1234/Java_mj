package money;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BankDAO {
	
	//db셋팅
	public boolean connect() throws ClassNotFoundException, SQLException {
		boolean result = false;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		result = true;
		
		return result;
	}
	
	public Connection con() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}

	public void insert(BankDTO dto) throws Exception, SQLException {   //삽입 메서드 
		
		if(connect()) {                //connection이 true이면 if문 실행
			Connection c = con();     //con()메서드를 이용해 반환받은 Connection타입 con의 주소값을 할당할 c
 			String sql = "insert into staff values (?,?,?,?)";
 			PreparedStatement ps = c.prepareStatement(sql);
 			
 			ps.setString(1, dto.getId());
 			ps.setString(2, dto.getName());
 			ps.setInt(3, dto.getAge());
 			ps.setString(4, dto.getTel());
 			ps.executeUpdate();
 			ps.close();
		} 
		
		
	}//insert()종료
	
	public BankDTO selectStaff(String id) throws ClassNotFoundException, SQLException {  //id를 통한 검색 메서드
		BankDTO dto2= null;
		
			Connection c2 = con();
			String sql = "select * from staff where id=?";
			PreparedStatement ps = c2.prepareStatement(sql);
			ps.setString(1, id);  //문자열의 sql문을 실행해서 첫번째의 ?에 id값을 넣음
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto2 = new BankDTO();
				dto2.setId(rs.getString(1));
				dto2.setName(rs.getString(2));
				dto2.setAge(rs.getInt(3));
				dto2.setTel(rs.getString(4));
			} 
		
		return dto2;
	}
	
	
	public void delete(BankDTO dto) throws ClassNotFoundException, SQLException {  //id를 이용해 delete하는 메서드
		
			Connection c3 = con();
			String sql = "delete from staff where id=? ";
			PreparedStatement ps = c3.prepareStatement(sql);
			ps.setString(1, dto.getId());  //dto객체로부터 id값을 가져와 1번째 물음표에 id값 대입
			ps.executeUpdate();
			ps.close();
		
	}
	
	
	
	public ArrayList<BankDTO> selectAll() throws ClassNotFoundException, SQLException{  //전체 검색 메서드이고, ArrayList에 담아 dto를 리턴할 예정
		Connection con4 = con();
		String sql = "select * from staff";
		PreparedStatement ps = con4.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		BankDTO dto2 = null;
		ArrayList<BankDTO> list = new ArrayList<>();
		while(rs.next()) {  //레코드별로 데이터가 있으면 가져오고 , 없으면 false를 반환하여 while문 종료
			 dto2 = new BankDTO();
			 dto2.setId(rs.getString(1));
			 dto2.setName(rs.getString(2));
			 dto2.setAge(rs.getInt(3));
			 dto2.setTel(rs.getString(4));
			 list.add(dto2);
		}
		ps.close();
		return list;
	}
	
	
	public void updateSet(BankDTO dto) throws ClassNotFoundException, SQLException {  //id를 이용해 전화번호만 수정하는 메서드
		Connection c4 = con();
		String sql = "update staff set tel=?  where id =?";
		PreparedStatement ps = c4.prepareStatement(sql);
		ps.setString(1, dto.getTel());
		ps.setString(2, dto.getId());  
		
		ps.executeUpdate();
		ps.close();
	}
	
	
	
	
	
} //클래스 종료
