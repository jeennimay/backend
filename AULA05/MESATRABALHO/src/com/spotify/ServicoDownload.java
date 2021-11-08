package com.spotify;

public class ServicoDownload implements IServicoDownload{

    @Override
    public void download(Usuario usuario) {
        System.out.println("Baixando música...");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Download realizado com sucesso!");

    }
}
