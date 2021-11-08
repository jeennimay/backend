public class Serie implements ISerie{

    private String nome;
    private String link;

    public Serie(String nome, String link) {
        this.nome = nome;
        this.link = "www" + nome + ".com";
    }

    public String getNome() {
        return nome;
    }

    public String getLink() {
        return link;
    }

    @Override
    public Serie getSerie(String nomeSerie) throws SerieNaoHabilitadaException {
        return link;
    }
}

