package MODEL;


public class Livros {
    private int id_livro;
    private String titulo;
    private String autor;
    private String genero;
    private String data_cadastro;
    private int anoPublicacao;
    private String editora;
    private String sessao;
    
    public Livros(){
        
    }

    public Livros(int id_livro, String titulo, String autor, String genero, String data_cadastro, int anoPublicacao, String editora, String sessao) {
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.data_cadastro = data_cadastro;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.sessao = sessao;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }
    
    

  
    
}
