package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ProductDAO implements DAO {
	//DB Connection 
	private Connection conn;
	//preperdStatement 클래스를 사용하여 객체 생성후 사용
	private PreparedStatement pst;
	//query문을 저장하기 위한 변수
	private String query ="";
	
	public ProductDAO() {
		DatabaseConnector dbc = DatabaseConnector.getInstance();
		conn = dbc.getConnection();
	}
	
	//sql 구문 시작

	@Override
	public int insert(Product product) {
		//pname, price, madeby
		query = "insert into product(pname, price, madeby) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			/*pst.set자료형(순번(?),값)*/
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setString(3, product.getMadeby());
			//executeUpdate() 값이 업데이트 되어야 하는 상황
			//executeQuery( select 경우 => DB의 값이 변하지 않는 상황
			//결과를 리턴(insert의 결과 : 1 or 0)
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert error.");
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public List<Product> selectList(){
		System.out.println("dao 진입 성공.");
		query = "select * from product order by pno desc";
		List<Product> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				list.add(new Product (rs.getInt("pno"),
						rs.getString("pname"),
						rs.getString("regdate")));
			}
			return list;
			
		} catch (SQLException e) {
			System.out.println("selectList error.");
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	public Product selectOne(int pno) {
		System.out.println("dao 진입 성공.");
		query = "select * from product where pno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new Product(rs.getInt("pno"),
						rs.getString("pname"),
						rs.getInt("price"),
						rs.getString("regdate"),
						rs.getString("madeby"));
			}
			
			
		} catch (SQLException e) {
			System.out.println("selectOne error");
			e.printStackTrace();
		}
		return null;
	}

	

	@Override
	public int edit(Product product) {
		System.out.println("dao 진입 성공");
		query = "update product set pname=?, price=?, regdate=now(), madeby=? where pno =?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setString(3, product.getMadeby());
			pst.setInt(4, product.getPno());
			
			return pst.executeUpdate(); /*enter 하는것과 같은것*/
			
		} catch (SQLException e) {
			System.out.println("update error.");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int removeOne(int pno) {
		System.out.println("dao 진입 성공");
		query = "delete from product where pno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			
			return pst.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println("remove error.");
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	
	
	

}
