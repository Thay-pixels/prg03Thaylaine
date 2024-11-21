/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.encapsulamento;

/**
 *
 * @author sunhe
 */

//Classe ControleRemoto que implementa a interface Controlador.
public class ControleRemoto implements Controlador{

    //Atributos do controle.
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Construtor para colocar status e volume inicial para o controle.
    public ControleRemoto() {
        this.setVolume(50);//Colocando volume inicial em 50.
        this.setLigado(false);//Colocando o status inicialmente desligado.
        this.setTocando(false);//Colocando o status inicialmente não tocando.
    }
    
    @Override
    public void ligar() {//Método para ligar o controle.
        this.setLigado(true);
        System.out.println("CONTROLE LIGADO!");
        System.out.println();
    }

    @Override
    public void desligar() {//Método para desligar o controle.
        this.setLigado(false);
        this.setTocando(false);
        System.out.println("Desligando contrrole...");
        System.out.println("CONTROLE DESLIGADO!");
        System.out.println();
    }

    @Override
    public void abrirMenu() {//Método para abrir o menu.
        if(this.isLigado()){
            System.out.println("Abrindo menu...");
            System.out.println("------------");
            System.out.println("[[[MENU]]]");
            System.out.println("MODO LIGADO: " + this.isLigado());
            System.out.println("STATUS TOCANDO: " + this.isTocando());
            System.out.println("VOLUME: " + this.getVolume());
        }else{
            System.out.println("O aparelho está desligado!");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {//Método para fechar o menu.
        System.out.println("Fechando menu...");
        System.out.println("MENU FECHADO!");
        System.out.println();
    }

    @Override
    public void maisVolume() {//Método para aumentar o volume.
        if(this.isLigado()){
            System.out.println("Aumentando volume...");
            this.setVolume(this.getVolume() + 10);
            System.out.println("VOLUME AUMENTADO!");
            System.out.println(""+ this.getVolume());

        }
        System.out.println();
    }

    @Override
    public void menosVolume() {//Método para diminuir o volume.
        if(this.isLigado()){
            System.out.println("Diminuindo volume...");
            this.setVolume(this.getVolume() - 10);
            System.out.println("VOLUME DIMINUÍDO!");
            System.out.println(""+ this.getVolume());

        }
        System.out.println();
    }

    @Override
    public void ligarMudo() {//Método para ligar o mudo.
        if(this.isLigado() && this.getVolume() > 0){
            System.out.println("Ativando modo mudo...");
            this.setVolume(0);
            System.out.println("MODO MUDO ATIVADO!");
        }
        System.out.println();
    }

    @Override
    public void desligarMudo() {//Método para desligar o mudo.
    if(this.isLigado() && this.getVolume() == 0){
            System.out.println("Desativando modo mudo...");
            this.setVolume(50);
            System.out.println("MODO MUDO DESATIVADO!");
        }
        System.out.println();
    }

    @Override
    public void play() {//Método para dar iniciar a reprodução.
        if(this.isLigado() && !this.isTocando()){
            System.out.println("Iniciando reprodução...");
            this.setTocando(true);
            System.out.println("REPRODUÇÃO INICIADA!");
        }else{
            System.out.println("Não foi possível dar play!");
        }
        System.out.println();
    }

    @Override
    public void pause() {//Método para pausar a reprodução.
        if(this.isLigado() && this.isTocando()){
            System.out.println("Pausando reprodução...");
            this.setTocando(false);
            System.out.println("REPRODUÇÃO PAUSADA!");
        }else{
            System.out.println("Não foi possível pausar!");
        }
        System.out.println();
    }

    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
        }else{
            System.out.println("Volume máximo atingido!");
        }
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Método principal para testar os métodos da classe Controlador.
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto controle = new ControleRemoto();//Criando um objeto do tipo ControleRemoto para testar os métodos.
        
        controle.ligar();
        controle.abrirMenu();
        controle.maisVolume();
        controle.menosVolume();
        controle.ligarMudo();
        controle.desligarMudo();
        controle.play();
        controle.pause();
        controle.fecharMenu();
        controle.desligar();
    }
    
}


