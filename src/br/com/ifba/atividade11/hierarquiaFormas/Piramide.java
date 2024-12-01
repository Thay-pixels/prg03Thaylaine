/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.hierarquiaFormas;

/**
 *
 * @author sunhe
 */
public class Piramide extends Forma3D {
    
    private double base;
    private double altura;
    private double alturaLateral;

    public Piramide(double base, double altura, double alturaLateral) {
        this.base = base;
        this.altura = altura;
        this.alturaLateral = alturaLateral;
    }

    @Override
    public double obterArea() {
        double areaBase = base * base;
        double areaLateral = 4 * (base * alturaLateral / 2);
        return areaBase + areaLateral;
    }

    @Override
    public double obterVolume() {
        return (base * base * altura) / 3;
    }

    @Override
    public String toString() {
        return "A Pirâmide possui base = " + base + ", altura = " + altura + " e a  altura lateral = " + alturaLateral;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getAlturaLateral() {
        return alturaLateral;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAlturaLateral(double alturaLateral) {
        this.alturaLateral = alturaLateral;
    }
    
}
