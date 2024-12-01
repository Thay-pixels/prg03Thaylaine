/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.hierarquiaFormas;

/**
 *
 * @author sunhe
 */
public class Esfera extends Forma3D {
    
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double obterVolume() {
        return (4 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String toString() {
        return "A Esfera possui o seguinte raio = " + raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
}
