// write a java program for connecting with mysql database and insert a record of the student
import java.sql.*;
public class Ex186 {
    public static void main(String[] args)throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false&serverTimezone=UTC", "root", "Pratap9999@");
        Statement st=con.createStatement();
        int flag=st.executeUpdate("insert into Student value(1001,'pratap',5000)");
        if (flag==0) {
            System.out.println("failed to store the information of student");
        }
        
            else
            System.out.println("sucessfully record is instred");
            con.close();
        

    }
}
