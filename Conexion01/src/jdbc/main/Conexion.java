package jdbc.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    public static Connection getConexion() {
        Properties props = new Properties();
        FileInputStream fis;
        Connection conexion = null;
        try {
            fis = new FileInputStream("src/jdbc/main/db.properties");
            props.load(fis);
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));
            conexion = DriverManager.getConnection(
                    props.getProperty("DB_URL"),
                    props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD"));
            System.out.println("¡Conexión exitosa!");
        } catch (SQLException | ClassNotFoundException | IOException e) {
            System.err.println("Error: fracaso la conexión.\n" + e.getMessage());
        }
        return conexion;
    }
}
