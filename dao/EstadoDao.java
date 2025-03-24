package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entidades.Estados;
import interfaces.iEstados;
import utils.conexaodb;

public class EstadoDao implements iEstados {

    @Override
    public boolean atualizar(Estados e) {
        return false;
    }

    @Override
    public List<Estados> consultar() {
        return null;
    }

    @Override
    public Estados consultarPorId(int id) {
        return null;
    }

    @Override
    public void excluir(int id) {
        
    }

    @Override
    public boolean salvar(Estados e) {
        String sql ="INSERT INTO estados (estado, uf) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexaodb.getConexao().prepareStatement(sql);
            ps.setString(1, e.getEstado());
            ps.setString(2, e.getUf());
            ps.execute();
            return true;

        } 
        catch (SQLException e1) {
            System.out.println("Erro: " + e1.toString());
        return false;
    }

}

}

