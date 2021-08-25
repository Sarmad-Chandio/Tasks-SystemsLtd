package com.systems.aspect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systems.jdbc.DbConnection;
import com.systems.payment.PaymentService;

@RestController
public class DemoRestController {
	
	@Value("${email}")
	String email;

	@Value("${content}")
	String content;
	
	
	
	@Autowired
	PaymentService p;

	
	@GetMapping("/email")
	public String sendingEmail() throws ClassNotFoundException, SQLException {
		System.out.print("called");
		DbConnection connection=new DbConnection();
		Connection con=connection.getConnection();
		PreparedStatement stmt=con.prepareStatement("update email set email=?, message=? where id=1 ");  
		stmt.setString(1, email);
		stmt.setString(2, content);
		int row=stmt.executeUpdate();
		String db_connection="";
		if(row>=1) {
			db_connection=db_connection+" databse connection Successfull";
		}else {
			db_connection+=" failed";
		}
		p.makePayment();
		//System.out.println("");
		return email + "<br>" + content+"<br>"+"<br>"+"STATUS: After pyment complition ,email send Succesfull"+" , "+db_connection;
	}

}