package jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    public static Connection getConexion() {
        Connection conexion = null;
        Properties props = new Properties();
        props.put("DB_DRIVER_CLASS", "com.mysql.jdbc.Driver");
        props.put("DB_URL", "jdbc:mysql://localhost:3306/jdbc_conexion_03");
        props.put("DB_USERNAME", "root");
        props.put("DB_PASSWORD", "");

        try {
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));
            conexion = DriverManager.getConnection(
                    props.getProperty("DB_URL"),
                    props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD")
            );
            System.out.println("¡Conexión exitosa!");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: fracaso la conexión.\n" + e.getMessage());
        }
        return conexion;
    }
}
