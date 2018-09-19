package jdbc.main;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            Listar dao = new Listar();
            List<Usuario> usuarios = dao.listar();
            for (Usuario u : usuarios) {
                System.out.println(u);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
