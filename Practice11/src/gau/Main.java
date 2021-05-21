package gau;

import com.sun.tools.jconsole.JConsoleContext;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String url = "jdbc:mysql://localhost:3306/gaujava2021";
        try {
            Connection con = DriverManager.getConnection(url, "root", "");
//            Statement st = con.createStatement();
//            String insert = "INSERT INTO users(name, lastname, age) " +
//                             "VALUES ('Nika', 'Vasadze', 24)";
//            st.executeUpdate(insert);
//            String preInsert = "INSERT INTO users(name, lastname, age) " +
//                    "VALUES (?, ?, ?)";
//            PreparedStatement statement = con.prepareStatement(preInsert);
//            statement.setString(1, "Nato");
//            statement.setString(2, "Sixarulidze");
//            statement.setInt(3, 45);
//            statement.executeUpdate();
            Statement selectSt = con.createStatement();
            String select = "SELECT * FROM users";
            ResultSet result = selectSt.executeQuery(select);
            System.out.println(result.next());
            System.out.println(result.getString("name"));
            System.out.println(result.getString("lastname"));
            System.out.println(result.getInt("age"));
            while(result.next()) {
                System.out.println(result.getString("name"));
                System.out.println(result.getString("lastname"));
                System.out.println(result.getInt("age"));
            }
            System.out.println(result.next());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
