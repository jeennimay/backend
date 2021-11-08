package com.spotify;

public class Spotify {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("mayumi.koga@gmail.com", "Premium");
        IServicoDownload download = new ProxyDownload();
        download.download(usuario);

        System.out.println("\n\n\n\n");
        Usuario usuario1 = new Usuario("email@email.com", "Free");
        download.download(usuario1);

    }
}
