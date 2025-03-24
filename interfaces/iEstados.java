package interfaces;

import java.util.List;

import entidades.Estados;

public interface iEstados {

    boolean salvar(Estados e);
    boolean atualizar(Estados e);
    void excluir(int id);
    List<Estados> consultar();
    Estados consultarPorId(int id);

}
