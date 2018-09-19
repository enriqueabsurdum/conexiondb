package jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection conectar() {
        Connection conexion = null;
        String cfn = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jdbc_conexion_04";
        String user = "root";
        String password = "";

        try {
            Class.forName(cfn);
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("¡Conexión exitosa!");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: fracaso la conexión.\n" + ex.getMessage());
        }
        return conexion;
    }
}