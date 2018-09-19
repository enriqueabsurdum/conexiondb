package jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public final static String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public final static String DB_URL = "jdbc:mysql://localhost:3306/jdbc_conexion_02";
    public final static String DB_USERNAME = "root";
    public final static String DB_PASSWORD = "";

    public static Connection getConexion() throws ClassNotFoundException, SQLException {
        Connection conexion;
        Class.forName(DB_DRIVER_CLASS);
        conexion = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        System.out.println("¡Conexión exitosa!");
        return conexion;
    }
}
