//package productcrudapp.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import org.springframework.jdbc.core.RowMapper;
//import productcrudapp.model.Product;
//
//public class RowMapperImpl implements RowMapper<Product> {
//
//	@Override
//	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//		Product student = new Product();
//		student.setId(rs.getInt(1));
//	    student.setName(rs.getString(2));
//	    student.setDescription(rs.getString(3));
//	    student.setPrice(rs.getInt(4));
//		return student;
//	}
//}
