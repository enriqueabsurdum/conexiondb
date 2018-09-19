package jdbc.main;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Listar dao = new Listar();
        List<Usuario> usuarios = dao.listar();
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
