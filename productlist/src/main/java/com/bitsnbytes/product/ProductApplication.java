package com.bitsnbytes.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //Initializer of Spring application
public class ProductApplication {

	public static void main(String[] args) {

//		ConfigurableApplicationContext context = SpringApplication.run(ProductlistApplication.class, args);
//		MyComponent myContext = context.getBean(MyComponent.class);
//		myContext.getMessage();

		ConfigurableApplicationContext myApp = SpringApplication.run(ProductApplication.class, args);
		MyApp app = myApp.getBean(MyApp.class);
		app.run();
	}

}
