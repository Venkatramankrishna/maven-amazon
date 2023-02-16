package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyclass {
	
	public static Properties p ;
	
	
			public Propertyclass() throws IOException {
				File f = new File("C:\\Users\\ELCOT\\eclipse-workspace-selenium\\maven-amazon\\src\\main\\java\\com\\properties\\File.properties");
				FileInputStream fis = new FileInputStream(f);
				p=new Properties();
				p.load(fis);
				}
			public String getUrl() {
				String url = p.getProperty("url");
				return url;

			}
			public String getUsername() {
				String user = p.getProperty("username");
				return user;

			}
			public String getPassword() {
				String pass = p.getProperty("password");
				return pass;

			}
			public String getPhone() {
				String ph = p.getProperty("phone");
				return ph;
				
			}
	
	

}
