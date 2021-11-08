package com.rodrigo;

public class Proxy implements IDownload{

    private ServicoDownload servico = new ServicoDownload();
    private Usuario usuario;

    public Proxy(Usuario usuario){
        this.usuario = usuario;
    }

    @Override
    public String download(String musica) {
        if (usuario.isPremium()){
            System.out.println(usuario.nome + ", o download de " + musica + " está completo");
            return servico.download(musica);
        }
        else{
            System.out.println(usuario.nome + ", download de músicas são para usuários premiums, experimente o Spotify Premium por um mês gratis!");
            return null;
        }
    }
}
