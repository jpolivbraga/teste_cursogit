package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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


        List<Estados> estados = new ArrayList<Estados>();
        try{
            PreparedStatement ps = conexaodb.getConexao().prepareStatement("SELECT * FROM estados");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Estados estado = new Estados();
                estado.setId(rs.getInt("id"));
                estado.setEstado(rs.getString("estado"));
                estado.setUf(rs.getString("uf"));
                estados.add(estado);
            }
        } catch
            (SQLException e) {
            System.out.println("Erro: " + e.toString());
        }
        return estados;
    }
    

    @Override
    public Estados consultarPorId(int id) {
        Estados estado = new Estados();
        try {
            PreparedStatement ps = conexaodb.getConexao().prepareStatement("SELECT * FROM estados WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                estado.setId(rs.getInt("id"));
                estado.setEstado(rs.getString("estado"));
                estado.setUf(rs.getString("uf"));
                return estado;
            }
                    
        } catch (SQLException e) {
            System.out.println("Erro: " + e.toString());
        }

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

    








