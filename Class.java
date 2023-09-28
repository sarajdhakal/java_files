import java.sql.*;

public class Class {
    public static void main(String args[])
    {
        Connection connection= null;
        PreparedStatement preparedStatement=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/mydatabase";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO employees (id,name,age)" VALUES (?,?,?);
            preparedStatement =  connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "John Doe");
            preparedStatement.setInt(3, 30);
            
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0){
                System.out.println("Record inserted successfully.");
            }else {
                System.out.println("Failed to insert record. ");
            }
        }
        catch (ClassNotFoundException e)
         {
            e.printStackTrace();
        }
        finally {
            try {
                if (preparedStatement != null)
                {
                    preparedStatement.close();
                }
                if (connection != null)
                {
                    connection.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

}
