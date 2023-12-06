//package productcrudapp.controller;
//  import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
/////All Configuration @Bean -by the bean IOC/Spring container create the Object for class i am doing by using java class not xml
// //we can create bean 3 way 1 . xml, 2.@Component 3.@Bean
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.stereotype.Component;
//
//@Configuration
//@ComponentScan(basePackages="productcrudapp.dao")  //if we dont want to create @Bean For StudentDao class this scan annotation can load all the bean object for IOC container
//@Component
//public class JdbcConfig {
//	@Bean("ds")
//	public DataSource getDataSource() {
//		DriverManagerDataSource ds = new DriverManagerDataSource();
//		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		ds.setUrl("jdbc:mysql://localhost:3306/tab1");
//		ds.setUsername("root");
//	    ds.setPassword("root");
//	    return ds;
//	}
//	
//	@Bean("jdbcTemplate")
//	public JdbcTemplate getTemplate() {  //Because jdbcTemplate class internally implements to datasource class it receive data from only datasource
//		JdbcTemplate jdbcTemplate = new JdbcTemplate();
//		jdbcTemplate.setDataSource(getDataSource());
//		return jdbcTemplate;
//	}
//}
