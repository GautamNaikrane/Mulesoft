package net.codejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLite {
	public static void main(String[] args) {
		String jdbcUrl="jdbc:sqlite:/Movies.db";
		Connection connection =DriverManager.getConnection(jdbcUrl);
		
	String sql="create table Movies (Name varchar(60),Actor varchar(25),Actress varchar(25),Director varchar(25),Year_of_release int)";    
	Statement statement = connection.createStatement();
	statement.executeUpdate(sql);
	//Movie 1
	String sql1="insert into Movies values('Jerry Maguire','Tom Cruise','Renee Zelweger','Cameron Crowe','1996')";    
	statement.executeUpdate(sql1);
	//Movie 2
	String sql2="insert into Movies values('Forrest Gump','Tom Hanks','Robin Wright','Robert Zemeckis','1994')";    
	statement.executeUpdate(sql2);
	//Movie 3
	String sql3="insert into Movies values('Silver Linings Playbook','Bradley Cooper','Jennifer Lawerence','David O. Russell','2012')";    
	statement.executeUpdate(sql3);
	
	//Movie 4
	String sql4="insert into Movies values('Pulp Fiction','Samuel Jackson','Uma Thurman','Quentin Tarantino','1994')";    
	
	statement.executeUpdate(sql4);
	
	//Movie 5
	String sql5="insert into Movies values('Elf','Will Ferrell','Zoey Deschanel','Jon Favreau','2003')";    
	statement.executeUpdate(sql5);
	
	//Movie 6
	String sql6="insert into Movies values('Father of the Bride','Steve Martin','KImberly Williams','Charles Shyer','1991')";    
	statement.executeUpdate(sql6);
	
	//selecting
	String sql7="select rowid, * from Movies ";
	ResultSet result = statement.executeQuery(sql7);
	while(result.next()) {
		String Name=result.getString("Name");
		String Actor=result.getString("Actor");
		String Actress=result.getString("Actress");
		String Director=result.getString("Director");
		String Year_of_release=result.getString("Year_of_release");
		
		System.out.println(Name+" | "+Actor+" | "+Actress+" | "+Director+" | "+Year_of_release);
		
	}

    //selecting with condition
    String sql8="select rowid, * from Movies where Name='Tom Hanks'";
	ResultSet result2 = statement.executeQuery(sql8);
	while(result2.next()) {
		String Name=result2.getString("Name");
		String Actor=result2.getString("Actor");
		String Actress=result2.getString("Actress");
		String Director=result2.getString("Director");
		String Year_of_release=result2.getString("Year_of_release");
		
		System.out.println(Name+" | "+Actor+" | "+Actress+" | "+Director+" | "+Year_of_release);
		
	}
	
	}

}