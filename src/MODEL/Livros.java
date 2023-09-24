package MODEL;


public class Livros {
    private int id_livro;
    private String titulo_livro;
    private String autor_livro;
    private String data_cadastro;
    private int anoPublicacao;
    private String editora;
    private int bloco;
    
    public Livros(){
        
    }

    public Livros(int id_livro, String titulo_livro, String autor_livro, String data_cadastro, int anoPublicacao, String editora, int bloco) {
        this.id_livro = id_livro;
        this.titulo_livro = titulo_livro;
        this.autor_livro = autor_livro;
        this.data_cadastro = data_cadastro;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.bloco = bloco;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo_livro() {
        return titulo_livro;
    }

    public void setTitulo_livro(String titulo_livro) {
        this.titulo_livro = titulo_livro;
    }

    public String getAutor_livro() {
        return autor_livro;
    }

    public void setAutor_livro(String autor_livro) {
        this.autor_livro = autor_livro;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    
    
}
