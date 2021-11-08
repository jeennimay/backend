package com.spotify;

public class ProxyDownload implements IServicoDownload{

    @Override
    public void download(Usuario usuario) {

        if(usuario.getTipo().equalsIgnoreCase("Premium")){
            ServicoDownload servico = new ServicoDownload();
            servico.download(usuario);
        }
        else {
            System.out.println("Experimente o Spotify Premium e ganhe 1 mês grátis!");
        }
    }
}
