package jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Listar {

    private final String SQL_SELECT = "SELECT id_usuario, nombre, email, clave FROM usuarios";
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public List<Usuario> listar() throws ClassNotFoundException, SQLException {
        List<Usuario> listado = new ArrayList<>();
        try {
            conn = new Conexion().conectar();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getShort("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setEmail(rs.getString("email"));
                usuario.setClave(rs.getString("clave"));
                listado.add(usuario);
            }
        } catch (SQLException sqle) {
            System.err.println(sqle.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                System.err.println(sqle.getMessage());
            }
        }
        return listado;
    }
}