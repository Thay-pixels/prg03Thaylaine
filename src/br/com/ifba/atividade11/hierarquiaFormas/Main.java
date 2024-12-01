/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.hierarquiaFormas;

/**
 *
 * @author sunhe
 */
public class Main {
    
     public static void main(String[] args) {
         
        //Array de formas.
        Forma[] formas = new Forma[6];
        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(3, 6);
        formas[3] = new Esfera(3);
        formas[4] = new Cubo(2);
        formas[5] = new Piramide(4, 5, 6);

        for(Forma forma : formas){
            System.out.println(forma.toString());

            if (forma instanceof Forma2D) {
                System.out.println("Área: " + ((Forma2D) forma).obterArea());
            } else if (forma instanceof Forma3D) {
                System.out.println("Área: " + ((Forma3D) forma).obterArea());
                System.out.println("Volume: " + ((Forma3D) forma).obterVolume());
            }

            System.out.println();
        }
    }
     
}
