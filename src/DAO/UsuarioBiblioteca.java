package DAO;

import MODEL.Usuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class UsuarioBiblioteca {

    Connection connection;

    public ResultSet autenticacaoUsuario(Usuarios users) throws Exception {
        connection = CONEXAO.Conexao.createConnectionMySQL();

        try {
            String sql = "SELECT * FROM usuarios WHERE nome_usuario =? and senha_usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, users.getNome_usurario());
            preparedStatement.setString(2, users.getSenha_usuario());
            
            ResultSet resultSet = preparedStatement.executeQuery();
  
            return resultSet;

        } catch (SQLException exception) {
            System.out.println("Erro " + exception);
            return null;
        }
    }
    
    
}
