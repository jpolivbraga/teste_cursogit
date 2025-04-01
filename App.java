import java.util.List;

import dao.EstadoDao;
import entidades.Estados;

public class App {
    public static void main(String[] args) throws Exception {

        EstadoDao ed = new EstadoDao();
        List<Estados> lista = ed.consultar();
        
        for (Estados estado : lista) {
            System.out.println(estado.toString());
        }


    }
}

