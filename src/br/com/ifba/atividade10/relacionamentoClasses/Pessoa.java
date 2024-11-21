/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.relacionamentoClasses;

/**
 *
 * @author sunhe
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    //Construtor para inicializar os atributos do objeto pessoa1.
    public Pessoa(String nome, int idade, String sexo){
        this.setNome(nome);
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Método para Pessoa fazer aniversário.
    public void fazerAniversario(){
        this.idade++;
        System.out.println("O leitor fez aniversário!");
    }
    
    //Método para testar classe Pessoa.
    public static void main(String[] args) {
        //Criando um objeto Pessoa.
        Pessoa pessoa1 = new Pessoa("Percy", 20, "Masculino");

        //Demonstrando o método fazerAniversario.
        pessoa1.fazerAniversario();
        
    }

}
