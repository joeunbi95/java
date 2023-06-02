package JDBC;

import java.util.List;

public interface DAO {

	int insert(Product product);

	List<Product> selectList();

	Product selectOne(int pno);

	int edit(Product product);

	int removeOne(int pno);
	
	
}
