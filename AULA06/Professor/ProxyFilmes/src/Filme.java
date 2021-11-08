public class Filme {
    // Info sobre o filme
    private String nome;
    private String pais;
    private String link;

    //Construtor de Filmes

    public Filme(String nome, String pais, String link) {
        this.nome = nome;
        this.pais = pais;
        this.link = link;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public String getLink() {
        return link;
    }
}
