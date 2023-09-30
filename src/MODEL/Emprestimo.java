
package MODEL;

public class Emprestimo {
    private int id_emprestimo;
    private String nome_leitor;
    private String nome_livro;
    private String data_emprestimo;
    private String data_devolucao;
    private int id_leitor;
    private int id_livro;
    
    public Emprestimo(){
        
    }

    public Emprestimo(int id_emprestimo, String nome_leitor, String nome_livro, String data_emprestimo, String data_devolucao, int id_leitor, int id_livro) {
        this.id_emprestimo = id_emprestimo;
        this.nome_leitor = nome_leitor;
        this.nome_livro = nome_livro;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
        this.id_leitor = id_leitor;
        this.id_livro = id_livro;
    }

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public String getNome_leitor() {
        return nome_leitor;
    }

    public void setNome_leitor(String nome_leitor) {
        this.nome_leitor = nome_leitor;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public int getId_leitor() {
        return id_leitor;
    }

    public void setId_leitor(int id_leitor) {
        this.id_leitor = id_leitor;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }
    
    
}
