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

        String sql = "INSERT INTO livros (titulo, autor, genero , data_cadastro, ano_publicacao, editora, sessao) VALUES (?,?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, livros.getTitulo());
            preparedStatement.setString(2, livros.getAutor());
            preparedStatement.setString(3, livros.getGenero());
            preparedStatement.setString(4, livros.getData_cadastro());
            preparedStatement.setInt(5, livros.getAnoPublicacao());
            preparedStatement.setString(6, livros.getEditora());
            preparedStatement.setString(7, livros.getSessao());

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
                livros.setTitulo(resultSet.getString("titulo"));
                livros.setAutor(resultSet.getString("autor"));
                livros.setGenero(resultSet.getString("genero"));
                livros.setData_cadastro(resultSet.getString("data_cadastro"));
                livros.setAnoPublicacao(resultSet.getInt("ano_publicacao"));
                livros.setEditora(resultSet.getString("editora"));
                livros.setSessao(resultSet.getString("sessao"));

                todosLivros.add(livros);
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

        return todosLivros;
    }

    public void AtualizarLivros(Livros livros) {
        String sql = "UPDATE livros SET titulo = ?, autor = ?, genero = ? ,data_cadastro=?, ano_publicacao=?, editora=?, sessao=? WHERE id_livro=?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, livros.getTitulo());
            preparedStatement.setString(2, livros.getAutor());
            preparedStatement.setString(3, livros.getGenero());
            preparedStatement.setString(4, livros.getData_cadastro());
            preparedStatement.setInt(5, livros.getAnoPublicacao());
            preparedStatement.setString(6, livros.getEditora());
            preparedStatement.setString(7, livros.getSessao());

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
