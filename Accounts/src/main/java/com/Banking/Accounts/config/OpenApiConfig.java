package com.Banking.Accounts.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfig {

	
	@Value("${bezkoder.openapi.dev-url}")
	  private String devUrl;

	  @Value("${bezkoder.openapi.prod-url}")
	  private String prodUrl;

	  @Bean
	  public OpenAPI myOpenAPI() {
	    Server devServer = new Server();
	    devServer.setUrl(devUrl);
	    devServer.setDescription("Server URL in Development environment");

	    Server prodServer = new Server();
	    prodServer.setUrl(prodUrl);
	    prodServer.setDescription("Server URL in Production environment");

	    Contact contact = new Contact();
	    contact.setEmail("myMail@gmail.com");
	    contact.setName("MyBankingApp");
	    contact.setUrl("https://www.MyBankingApp.com");

	    //License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/my/");

	    Info info = new Info()
	        .title("Banking Enterprize API")
	        .version("1.0")
	        .contact(contact)
	        .description("This API exposes endpoints to manage Accounts.")
	        	.termsOfService("https://www.MyBankingApp.com/terms");
	      //  .license(mitLicense);

	    return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
	  }
}
