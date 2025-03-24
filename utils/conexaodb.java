package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaodb {

    private static Connection conexao = null;
    public static Connection getConexao() {

        try {
            conexao = DriverManager.getConnection(
                
            "jdbc:postgresql://localhost:5432/Dbaula1", 
            "postgres", 
            "1408");
            
        } catch (SQLException e) {

            System.out.println("Erro ao conectar com o banco de dados: " + e.toString());
           
    
        }

        return conexao;
    }

}
