/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.votacao;

/**
 * Classe para calcular valores da Votação
 * @author Matheus Eloy
 */
public class VotosCalculo {

    /**
     * Calcula percentual de votos Validos
     * @return 
     */
    public static float calculaPercentualValidos(Votos votos) {
        float PercValidos = (votos.getValidos() * 100) / votos.getTotalEleitores();

        return PercValidos;
    }

    /**
     * Calcula percentual de votos Brancos
     * @return 
     */
    public static float calculaPercentualBrancos(Votos votos) {
        float PercBrancos = (votos.getVotosBrancos()* 100) / votos.getTotalEleitores();

        return PercBrancos;
    }

    /**
     * Calcula percentual de votos Nulos
     * @return 
     */
    public static float calculaPercentualNulos(Votos votos) {
        float PercNulos = (votos.getNulos() * 100) / votos.getTotalEleitores();

        return PercNulos;
    }
}
