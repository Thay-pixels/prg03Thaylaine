/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.hierarquiaFormas;

/**
 *
 * @author sunhe
 */
public class Cubo extends Forma3D {
    
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return 6 * lado * lado;
    }

    @Override
    public double obterVolume() {
        return lado * lado * lado;
    }

    @Override
    public String toString() {
        return "O Cubo possui o seguinte lado = " + lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
