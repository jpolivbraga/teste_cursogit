import dao.EstadoDao;
import entidades.Estados;
import utils.conexaodb;

public class App {
    public static void main(String[] args) throws Exception {

        if(conexaodb.getConexao() != null){
            System.out.println("Conexão realizada com sucesso!");
    }

    Estados e = new Estados("Rio Grande do Norte", "RN");
    EstadoDao ed = new EstadoDao();

    if(ed.salvar(e)){
        System.out.println("Registro salvo com sucesso!");
}
    }
}

