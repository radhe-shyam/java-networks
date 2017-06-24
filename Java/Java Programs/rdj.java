import java.sql.*;
class rdj {


    public static void main(String[] args) throws Exception {
        //Class.forName("Sun.jdbc.odbc.JdbcOdbcDriver");
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:rdjdbc");
       // Statement select = con.createStatement();
       // ResultSet rs = select.executeQuery("Select * from radhe");
      //  while(rs.next())
      //      System.out.println(rs.getNString("name"));
        
              
        // TODO code application logic here
    }
}