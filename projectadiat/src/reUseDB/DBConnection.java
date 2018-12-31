package reUseDB;

import java.sql.*;

public class DBConnection {

    public static Connection connectmysql() throws ClassNotFoundException , SQLException {
        String url = "jdbc:mysql://localhost:3306/salma?useSSL=false&allowPublicKeyRetrieval=true";

        String username = "root";

        String password = "abcd";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connect = DriverManager.getConnection(url,username,password);

        return connect;


    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String query = "select * from customers";

        Statement statement = connectmysql().createStatement();

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("id") + " | " + resultSet.getString("name") + " | " + resultSet.getString("level"));

        }



        }

    }

