
package DAO;
import MODEL.Emprestimo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


public class EmprestimoBiblioteca {
    public void createEmprestimo(Emprestimo emprestimo){
       String sql = "INSERT INTO emprestimos (nome_livro, nome_leitor,data_emprestimo, data_devolucao, id_livro, id_leitor) VALUES (?,?,?,?,?,?)";
       
       Connection connection = null;
       PreparedStatement preparedStatement = null;
       
        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, emprestimo.getNome_livro());
            preparedStatement.setString(2, emprestimo.getNome_leitor());
            preparedStatement.setString(3, emprestimo.getData_emprestimo());
            preparedStatement.setString(4, emprestimo.getData_devolucao());
            preparedStatement.setInt(5, emprestimo.getId_livro());
            preparedStatement.setInt(6, emprestimo.getId_leitor());
            
            preparedStatement.execute();
            
            
        } catch (Exception e) {
            System.out.println("Erro emprestimo: " + e);
        }
    }    
    
    public List<Emprestimo> mostraEmprestimos(){
        String sql = "SELECT * FROM emprestimos";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        ArrayList<Emprestimo> Todosemprestimos = new ArrayList<>();
        
        
        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                Emprestimo emprestimo = new Emprestimo();
                
                emprestimo.setId_emprestimo(resultSet.getInt("id_emprestimo"));
                emprestimo.setNome_livro(resultSet.getString("nome_livro"));
                emprestimo.setNome_leitor(resultSet.getString("nome_leitor"));
                emprestimo.setData_emprestimo(resultSet.getString("data_emprestimo"));
                emprestimo.setData_devolucao(resultSet.getString("data_devolucao"));
                emprestimo.setId_leitor(resultSet.getInt("id_leitor"));
                emprestimo.setId_livro(resultSet.getInt("id_livro"));
                
                Todosemprestimos.add(emprestimo);
            }
         
            
        } catch (Exception e) {
            System.out.println("Erro mostrar emprestimos: " + e);
        }
        
        return Todosemprestimos;
    }
}
