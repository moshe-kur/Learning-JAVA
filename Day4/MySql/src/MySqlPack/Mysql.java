package MySqlPack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Mysql {
    private String url;
    private String username;
    private String password;
    private Connection connection;

    public Mysql(String username, String password, String database) {
        this.url = "jdbc:mysql://localhost:3306/"+database;
        this.username = username;
        this.password = password;
        this.connection = null;
    }
    public Mysql( String database) {
        this.url = "jdbc:mysql://localhost:3306/"+database;
        this.username = "newuser";
        this.password = "User1234";
        this.connection = null;
    }

    public void connecting() throws SQLException {
        this.connection = DriverManager.getConnection(this.url,this.username,this.password);
    }
    public void closeConnection() throws SQLException {
        if (this.connection!=null){
            this.connection.close();
        }
    }
    public ResultSet executeQuery(String query) throws SQLException {

        Statement statement = this.connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        return result;
    }




    public void saveToFile(String lines,String fileName) throws  IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName+".txt"));
        writer.write(lines);
        writer.close();
    }

   //Make generic list by parameter class type
    //complicated
    public <T> List<T> saveToGenericList(ResultSet resultSet, Class<T> tClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        List<T> tList = new ArrayList<T>();
        while (resultSet.next()){
            T instance = tClass.getDeclaredConstructor().newInstance();

            for (Field field : tClass.getDeclaredFields()) {
                field.setAccessible(true);
                String fieldName = field.getName();
                Object value = resultSet.getObject(fieldName);
                field.set(instance, value);
                //System.out.print(fieldName+": "+value+", ");
            }
            tList.add(instance);
            //System.out.println();

        }

        return tList;
    }

}
