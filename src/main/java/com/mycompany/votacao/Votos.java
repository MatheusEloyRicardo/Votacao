/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.votacao;

/**
 * Classe para setar e buscar valores
 * @author Matheus Eloy
 */
public class Votos {
    private int totalEleitores;
    private int validos;
    private int votosBrancos;
    private int nulos;
    
    /**
     * Construtora
     * @return 
     */
    public Votos() {}
    
    /**
     * Construtora setando valores
     * @return 
     */
    public Votos(int totalEleitores, int validos, int votosBrancos, int nulos) {
        this.totalEleitores = totalEleitores;
        this.validos = validos;
        this.votosBrancos = votosBrancos;
        this.nulos = nulos;
    }

    public int getTotalEleitores() {
        return totalEleitores;
    }

    public void setTotalEleitores(int totalEleitores) {
        this.totalEleitores = totalEleitores;
    }

    public int getValidos() {
        return validos;
    }

    public void setValidos(int validos) {
        this.validos = validos;
    }

    public int getVotosBrancos() {
        return votosBrancos;
    }

    public void setVotosBrancos(int votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    public int getNulos() {
        return nulos;
    }

    public void setNulos(int nulos) {
        this.nulos = nulos;
    }
}
