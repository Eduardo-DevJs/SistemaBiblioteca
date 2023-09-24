package DAO;

import MODEL.Livros;
import VIEW.CadastroLivroSucesso.livroCadastroSucesso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class LivroBiblioteca {

    public void create(Livros livros) {

        String sql = "INSERT INTO livros (titulo, autor, data_cadastro, ano_publicacao, editora, id_bloco) VALUES (?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, livros.getTitulo_livro());
            preparedStatement.setString(2, livros.getAutor_livro());
            preparedStatement.setString(3, livros.getData_cadastro());
            preparedStatement.setInt(4, livros.getAnoPublicacao());
            preparedStatement.setString(5, livros.getEditora());
            preparedStatement.setInt(6, livros.getBloco());
            
            preparedStatement.execute();
            

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }
}
