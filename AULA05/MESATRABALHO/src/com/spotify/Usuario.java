package com.spotify;

public class Usuario {
    private String email;
    private String tipo;

    public Usuario(String email, String tipo) {
        this.email = email;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
