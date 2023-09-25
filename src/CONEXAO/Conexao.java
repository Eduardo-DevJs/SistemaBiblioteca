/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author dudu
 */
public class Conexao {

    private static final String DATABASE = "jdbc:mysql://localhost:3306/bd_biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "root123";

    public static Connection createConnectionMySQL() throws Exception {
        Connection connection = DriverManager.getConnection(DATABASE, USER, PASSWORD);

        return connection;
    }

    public static void main(String[] args) throws Exception {
        Connection connection = createConnectionMySQL();
        
        if(connection != null){
            JOptionPane.showMessageDialog(null, "Conexao obtida com sucesso!");
            connection.close();
        }
    }

}
