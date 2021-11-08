package com.dh.odonto.model;

public class Dentista {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String numMatricula;

    public Dentista(Integer id, String nome, String sobrenome, String numMatricula) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numMatricula = numMatricula;
    }

    //Construtor sem ID
    public Dentista(String nome, String sobrenome, String numMatricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numMatricula = numMatricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return "Dentista " + id + ": " +
                "Nome: " + nome + '\'' +
                "Sobrenome: " + sobrenome + '\'' +
                "Numero de matricula: " + numMatricula;
    }
}
