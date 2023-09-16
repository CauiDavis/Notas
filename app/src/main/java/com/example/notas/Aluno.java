package com.example.notas;

public class Aluno {
    private String Nome;
    private String N1,N2,N3;

    public  Aluno(String nome, String n1, String n2, String n3){
        Nome = nome;
        N1 = n1;
        N2 = n2;
        N3 = n3;
    }
    public String getNome() {
        return Nome;
    }

    public String getN1() {
        return N1;
    }

    public String getN2() {
        return N2;
    }

    public String getN3() {
        return N3;
    }

    @Override
    public String toString() {
        return "Nome: " + Nome + " Nota 1: " + N1 + " Nota 2: " + N2 + " Nota 3: " + N3;
    }
}
