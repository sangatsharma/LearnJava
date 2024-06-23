package OOP.database;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) throws Exception {
        Class.forName("com.sql.cj/jdbc.Driver");
        String url="jdbc:mysql://localhost:3600/dbname";
        String user = "root";
        String pw = "";
        String row;
        Connection conn=DriverManager.getConnection(url, user, pw);
        Statement statement=conn.createStatement();
        String query="select * from test";
        ResultSet result=statement.executeQuery(query);
        while(result.next()){
           row=result.getInt("id") +" "+ result.getString(2)+" "+ result.getInt(3);
           if(row.contains("name")){
            System.out.println(row);
           }
            
        }

    }
}
