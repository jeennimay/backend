package com.rodrigo;

public class Usuario {
    String nome;
    private boolean isPremium = false;
    private IDownload downloader;

    public Usuario(String nome, Boolean isPremium) {
        this.nome = nome;
        this.isPremium = isPremium;
        downloader = new Proxy(this);
    }

    public void salvarMusicaOffline(String musica){
        downloader.download(musica);
    }

    public boolean isPremium() {
        return isPremium;
    }
}
