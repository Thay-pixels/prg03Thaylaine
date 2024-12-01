/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.hierarquiaFormas;

/**
 *
 * @author sunhe
 */
public abstract class Forma3D extends Forma {
    
    //Método abstrato para calcular a área da superfície.
    public abstract double obterArea();

    //Método abstrato para calcular o volume.
    public abstract double obterVolume();
    
    /*@Override
    public void exibirDetalhes() {
        System.out.println(this.toString());
        //System.out.println("Área: " + obterArea());
        //System.out.println("Volume: " + obterVolume());
    }*/
    
}