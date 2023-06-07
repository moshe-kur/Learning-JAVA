import MySqlPack.Mysql;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
