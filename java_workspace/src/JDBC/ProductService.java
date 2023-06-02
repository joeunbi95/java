package JDBC;

import java.util.List;

public class ProductService implements Service {
	
	//Service => DAO 요청
	private DAO dao;
	
	public ProductService() {
		dao = new ProductDAO();
	}

	@Override
	public int register(Product product) {
		//실제 DAO에 요청 처리 로직
		System.out.println("register service 진입.");
		//dao에게 insert요청 후 결과를 controller로 리턴
		return dao.insert(product);
	}
	
	@Override
	public List<Product> list(){
		
		System.out.println("list service 진입.");
		
		return dao.selectList();
	}

	@Override
	public Product detail(int pno) {

		System.out.println("detail service 진입.");
		
		return dao.selectOne(pno);
	}


	@Override
	public int edit(Product product) {
		
		System.out.println("edit service 진입.");
		
		return dao.edit(product);
	}

	@Override
	public int remove(int pno) {
		
		System.out.println("remove service 진입.");
		
		return dao.removeOne(pno);
	}


}
