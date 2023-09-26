
package MODEL;

public class Leitor {
    private int id_leitor;
    private String nome;
    private String telefone;
    private String data_cadastro;
    private String email;
    private String cpf;
    
    public Leitor(){
        
    }

    public Leitor(int id_leitor, String nome, String telefone, String data_cadastro, String email, String cpf) {
        this.id_leitor = id_leitor;
        this.nome = nome;
        this.telefone = telefone;
        this.data_cadastro = data_cadastro;
        this.email = email;
        this.cpf = cpf;
    }


    public int getId_leitor() {
        return id_leitor;
    }

    public void setId_leitor(int id_leitor) {
        this.id_leitor = id_leitor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
