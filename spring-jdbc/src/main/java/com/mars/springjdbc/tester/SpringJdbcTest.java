package com.mars.springjdbc.tester;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mars.springjdbc.config.AppConfig;
import com.mars.springjdbc.dao.CustomerDAO;
import com.mars.springjdbc.model.Customer;

public class SpringJdbcTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		CustomerDAO customerDao = context.getBean(CustomerDAO.class);
		
		
		
		
//		Customer cust = new Customer ("Brian","Baldwin city",3010,100,123);
		
//		customerDao.createCustomer(cust);
		
//		System.out.println("Customer Added!!!!");
		
		
		
		
//		Customer cust = new Customer();
		
//		cust.setCustomer_id(2006);
		
//		cust.setCustomername("Bonnie");
		
//		cust.setCity("Wetmore");
		
//		cust.setGrade(200);
		
//		cust.setSalesman_id(4020);
		
//		customerDao.updateCustomer(cust);
		
//		System.out.println("Customer Successfully Updated !!!!");
		
		
		
		
//		int result =customerDao.deleteCustomer(3008);
		
//		System.out.println("Deleted " + result +"!!1");
		
		
	
		
		List<Customer> customer = customerDao.getAllCustomers();
		for(Customer c : customer)
		{
			System.out.println(c);
		}
		
		((AnnotationConfigApplicationContext) context).close();
	}

}
