import MySqlPack.Mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {

            String dataBase ="test";
            Mysql db = new Mysql("root","root",dataBase);
            db.connecting();
            String query;
            ResultSet result;
            query= "SELECT * FROM users";
            result= db.executeQuery(query);
            while (result.next()) {
                int studentId = result.getInt(1);
                String lastName = result.getString(2);
                int email = result.getInt(3);


            }
                db.closeConnection();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
