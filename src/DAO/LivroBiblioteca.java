package DAO;

import MODEL.Livros;
import VIEW.MensagensDeSucesso.LivroCadastroSucesso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class LivroBiblioteca {

    public void create(Livros livros) {

        String sql = "INSERT INTO livros (titulo, autor, genero , data_cadastro, ano_publicacao, editora, id_bloco) VALUES (?,?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, livros.getTitulo_livro());
            preparedStatement.setString(2, livros.getAutor_livro());
            preparedStatement.setString(3, livros.getGenero());
            preparedStatement.setString(4, livros.getData_cadastro());
            preparedStatement.setInt(5, livros.getAnoPublicacao());
            preparedStatement.setString(6, livros.getEditora());
            preparedStatement.setInt(7, livros.getBloco());

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }

    public List<Livros> mostrarLivros() {
        String sql = "SELECT * FROM livros";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<Livros> todosLivros = new ArrayList<Livros>();

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Livros livros = new Livros();

                livros.setId_livro(resultSet.getInt("id_livro"));
                livros.setTitulo_livro(resultSet.getString("titulo"));
                livros.setAutor_livro(resultSet.getString("autor"));
                livros.setGenero(resultSet.getString("genero"));
                livros.setData_cadastro(resultSet.getString("data_cadastro"));
                livros.setAnoPublicacao(resultSet.getInt("ano_publicacao"));
                livros.setEditora(resultSet.getString("editora"));
                livros.setBloco(resultSet.getInt("id_bloco"));

                todosLivros.add(livros);
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

        return todosLivros;
    }

    public void AtualizarLivros(Livros livros) {
        String sql = "UPDATE livros SET titulo = ?, autor = ?, genero = ? ,data_cadastro=?, ano_publicacao=?, editora=?, id_bloco=? WHERE id_livro=?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, livros.getTitulo_livro());
            preparedStatement.setString(2, livros.getAutor_livro());
            preparedStatement.setString(3, livros.getGenero());
            preparedStatement.setString(4, livros.getData_cadastro());
            preparedStatement.setInt(5, livros.getAnoPublicacao());
            preparedStatement.setString(6, livros.getEditora());
            preparedStatement.setInt(7, livros.getBloco());

            preparedStatement.setInt(8, livros.getId_livro());

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro:  " + e);
        }
    }

    public void DeletarLivro(int id) {
        String sql = "DELETE FROM livros WHERE id_livro =?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }
}
