/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author sunhe
 */

//Método que possui todas as operações para fatorial.
public class Fatorial {
    
    int numero = 0;
    int fatorial = 1;
    String formula = "";
    
    //Método que calcula o fatorial.
    public void setValor(int num){
        numero = num;
        int fat = 1;
        String form = "";
        for(int a = num; a > 1; a--){
            fat *= a;
            form += a + " x ";
        }
        form += "1 = ";
        fatorial = fat;
        formula = form;
    }
    
    //Método que retorna somente o valor do fatorial.
    public int getFatorial(){
        return fatorial;
    }
    
    //Método que retorna apenas a fórmula do fatorial.
    public String getFormula(){
        return formula;
    }
}
