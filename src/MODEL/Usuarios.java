/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author dudu
 */
public class Usuarios {
    private int id_usuario;
    private String nome_usurario;
    private String senha_usuario;
    
    public Usuarios(){
        
    }

    public Usuarios(int id_usuario, String nome_usurario, String senha_usuario) {
        this.id_usuario = id_usuario;
        this.nome_usurario = nome_usurario;
        this.senha_usuario = senha_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usurario() {
        return nome_usurario;
    }

    public void setNome_usurario(String nome_usurario) {
        this.nome_usurario = nome_usurario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
    
    
    
    
}
