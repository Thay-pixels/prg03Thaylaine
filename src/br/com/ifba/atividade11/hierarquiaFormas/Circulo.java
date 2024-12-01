/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.hierarquiaFormas;

/**
 *
 * @author sunhe
 */
public class Circulo extends Forma2D {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "O círculo tem o seguinte raoi: = " + raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
   
    
}