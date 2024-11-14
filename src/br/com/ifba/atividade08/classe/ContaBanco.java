/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classe;

/**
 *
 * @author sunhe
 */
public class ContaBanco {
    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //Método construtor ´para setar o status inicial da conta.
    public ContaBanco(String numConta, String dono){
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0.0;
        this.status = false;
    }

    public String getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Método para abrir a conta.
    public void abrirConta(String tipo){
        if(this.isStatus()){
            System.out.println("A conta já está aberta!");
        }else{
            this.setTipo(tipo);
            this.setStatus(true);
            if(tipo.equals("cp")){//Verificação para conta poupança.
                this.setSaldo(150.0);
            }else if (tipo.equals("cc")){//Verificação para conta corrente.
                this.setSaldo(50.0);
            }
            System.out.println("A conta foi aberta com sucesso!");
            System.out.println("- Titular: " + this.getDono());
            System.out.println("- Tipo: " + this.getTipo());
            System.out.println("- Número da conta: " + this.getNumConta());
            System.out.println("-> SALDO INICIAL: " + this.getSaldo());
            System.out.println();
        }
    }
    
    //Método para fechar a conta.
    private void fecharConta(){
        if(this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("A conta foi fechada com sucesso!");
            System.out.println();
        }else{
            System.out.println("Não foi possível fechar a conta! O saldo não é igual a zero.");
            System.out.println();
        }
    }
    
    //Método para depositar valor(es) na conta.
    private void depositar(double valor){
        if(this.isStatus()){
            if(valor > 0){
                this.setSaldo(this.getSaldo() + valor);
                System.out.println("Depósito de R$" + valor + " foi realizado com sucesso!");
                System.out.println("-> SALDO ATUAL: R$" + this.getSaldo());
                System.out.println();
            }else{
                System.out.println("Erro ao depositar! O valor é inválido para depósito.");
                System.out.println();
            }
        }else{
            System.out.println("Não foi possível depositar! A conta está fechada.");
            System.out.println();
        }
    }
    
    //Método para sacar valor.
    private void sacar(double valor){
        if(this.isStatus()){
            if(valor <= this.getSaldo() && valor > 0){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque de R$" + valor + " foi realizado com sucesso!");
                System.out.println("-> SALDO ATUAL: R$" + this.getSaldo());
                System.out.println();
            }else if(valor > this.getSaldo()){
                System.out.println("Erro ao sacar! Saldo insuficiente para saque!");
                System.out.println();
            }else{
                System.out.println("Erro ao sacar! Valor inválido para saque!");
                System.out.println();
            }
        }else{
            System.out.println("Erro ao sacar! A conta está fechada.");
            System.out.println();
        }
    }
    
    //Método para pagar mensalidade.
    public void pagarMensal(){
        if(this.isStatus()){
            double mensalidade = (this.getTipo().equals("cc")) ? 12.0 : 20.0;
            if(this.getSaldo() >= mensalidade){
                this.setSaldo(this.getSaldo() - mensalidade);
                System.out.println("A mensalidade de R$" + mensalidade + " foi paga.");
                System.out.println("-> SALDO ATUAL: R$" + this.getSaldo());
                System.out.println();
            }else{
                System.out.println("Erro ao pagar mensalidade! O saldo da conta é insuficiente.");
                System.out.println();
            }
        }else{
            System.out.println("Erro ao pagar mensalidade! A conta está fechada.");
            System.out.println();
        }
    }
    
    //Método para testar as operações de abertura de conta, saque e etc.
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco conta1 = new ContaBanco("1234", "Percy");
        conta1.abrirConta("cc");
        conta1.depositar(150);
        conta1.sacar(50);
        conta1.pagarMensal();
        conta1.fecharConta();
    }
}

