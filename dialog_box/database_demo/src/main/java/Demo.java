import java.sql.*;

public class Demo {
    
    public static void main(String[] args) throws SQLException {
    
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        
        String user = "";
        String pass = "";
        
        try {
            //1. Get a connection to the database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sign_in", user, pass);
            //2. Create a statement
            myStmt = myConn.createStatement();
            //3. Execute SQL query
            myRs = myStmt.executeQuery("select * from employees");
            //4. Process the result set
            while (myRs.next()){
                System.out.println(myRs.getString("username") + ", " + myRs.getString("password"));
                                }
            } catch (Exception exc){
            exc.printStackTrace();
            }
    }
}
















