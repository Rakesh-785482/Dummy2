//package productcrudapp.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.view.RedirectView;
//                         
//import productcrudapp.dao.ProductDao2;
//import productcrudapp.model.Product;
//
//@Controller
//public class MainController2 {
//
//	@Autowired
//	private ProductDao2 productDao;
//
//	@RequestMapping("/")
//	public String home(Model m) {
//		List<Product> products = productDao.getAllProduct(); // At first productDao class give all data to home()
//		m.addAttribute("products", products); // All prodct data give to index page
//		return "index";
//	}
//	
//	@RequestMapping("/add-product")
//	public String addProduct(Model m) {
//		m.addAttribute("title", "Add Product"); // this is dynamic content for my jsp title
//		return "add_product_form";
//	}
//	
//	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
//	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
//		System.out.println(product);
//		productDao.insert(product);  //if data is not there createProduct() will work else update()
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl(request.getContextPath() + "/"); // when data will enter in form instead of it remove all
//																// name it keep my base root name
//		return redirectView;
//	}
//	
//	@RequestMapping("/delete/{productId}") //// delete/1 - i can use on url,1 - is come from browser not db
//	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
//		this.productDao.delete(productId);
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl(request.getContextPath() + "/"); // when data will enter in form instead of it remove all
//																// name it keep my base root name
//		return redirectView;
//	}
//	
//	@RequestMapping("/update/{productId}") //// delete/1 - i can use on url,1 - is come from browser not db
//	public String updateProduct(@PathVariable("productId") int productId,  Model model) {
//		Product product = this.productDao.getProduct(productId);
//        model.addAttribute("product",product);															// name it keep my base root name
//		return "update_form";
//	}
//}
