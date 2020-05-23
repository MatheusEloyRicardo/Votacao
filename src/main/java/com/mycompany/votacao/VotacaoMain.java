/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.votacao;

/**
 * Classe Main
 * @author Matheus Eloy
 */
public class VotacaoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Votos Votos = new Votos();

        //Seta Valores manualmente
        Votos.setTotalEleitores(1000);
        Votos.setValidos(800);
        Votos.setVotosBrancos(150);
        Votos.setNulos(50);

        // Retorna Calculo Percentual de Votos Validos
        System.out.println("Percentual de Votos Validos - " + VotosCalculo.calculaPercentualValidos(Votos) + "%");

        // Retorna Calculo Percentual de Votos Brancos
        System.out.println("Percentual de Votos Brancos - " + VotosCalculo.calculaPercentualBrancos(Votos) + "%");

        // Retorna Calculo Percentual de Votos Nulos
        System.out.println("Percentual de Votos Nulos - " + VotosCalculo.calculaPercentualNulos(Votos) + "%");
    }
}
