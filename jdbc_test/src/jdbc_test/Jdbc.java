package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
	public static void main(String[] args) {
		try{
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://192.168.1.20:5432/talentify", "postgres","4a626021-e55a");
		//jdbc:postgresql://business.talentify.in:5432/talentify
		System.out.println("success");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
