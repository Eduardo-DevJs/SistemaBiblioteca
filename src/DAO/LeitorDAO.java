package DAO;

import MODEL.Leitor;
import VIEW.MensagensDeSucesso.LivroCadastroSucesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LeitorDAO {

    public void cadastrarLeitor(Leitor leitor) {
        String sql = "INSERT INTO leitores (nome, cpf ,telefone, data_cadastro, email) VALUES (?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, leitor.getNome());
            preparedStatement.setString(2, leitor.getCpf());
            preparedStatement.setString(3, leitor.getTelefone());
            preparedStatement.setString(4, leitor.getData_cadastro());
            preparedStatement.setString(5, leitor.getEmail());

            preparedStatement.execute();


        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }

    public List<Leitor> mostraLeitores() {
        String sql = "SELECT * FROM leitores";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ArrayList<Leitor> leitores = new ArrayList<Leitor>();

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Leitor leitor = new Leitor();

                leitor.setNome(resultSet.getString("nome"));
                leitor.setCpf(resultSet.getString("cpf"));
                leitor.setTelefone(resultSet.getString("telefone"));
                leitor.setData_cadastro(resultSet.getString("data_cadastro"));
                leitor.setEmail(resultSet.getString("email"));

                leitores.add(leitor);
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        
        return leitores;

    }
}
