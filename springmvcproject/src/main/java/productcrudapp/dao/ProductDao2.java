//package productcrudapp.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import productcrudapp.model.Product;
//
//@Component
//public class ProductDao2{
//    
//	@Autowired          //we can use @Autowierd above setter method/constructor/datamembers. by the help of @Autowired we can get Object of jdbcTemplate class 
//	private JdbcTemplate jdbcTemplate;   //using this JdbcTemplate Class we write all methods
//	
//	@Transactional
//	public void insert(Product product) {  //this method come from my studenDao Interface
//        //insert query
//        String q = "insert into product (name,description,price) values(?,?,?,?)";
//        this.jdbcTemplate.update(q,product.getName(), product.getDescription(),product.getPrice());
//	}
//	
//	@Transactional
//	public void change(Product product) {
//		//update query
//		String q = "update product set name=?,description=? price=? where id=?";
//	    this.jdbcTemplate.update(q,product.getName(), product.getDescription(),product.getPrice(),product.getId());
//	}
//	
//	public void delete(int productId) {
//		//delete query
//		String q = "delete from product where id=?";
//		this.jdbcTemplate.update(q,productId);
//		
//	}
//
//	public Product getProduct(int productId) {
//		//select single student data
//		String query = "select * from product where id=?";
//		RowMapper<Product> rowMapper = new RowMapperImpl();  //we access our interaface by implementing(new RowMapperImpl()) Class Object
//		Product student = this.jdbcTemplate.queryForObject(query,rowMapper, productId);
//		return student;
//		
//	}
//	
//	public List<Product> getAllProduct() {
//		//selecting Multiple student
//		String query = "select * from product";
//		RowMapper<Product> rowMapper = new RowMapperImpl();  //we access our interaface by implementing(new RowMapperImpl()) Class Object
//		List<Product> student = this.jdbcTemplate.query(query,rowMapper);
//		return student;
//	}
//	
//}
