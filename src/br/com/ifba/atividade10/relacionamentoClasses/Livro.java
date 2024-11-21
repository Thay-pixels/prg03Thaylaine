/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.relacionamentoClasses;
/**
 *
 * @author sunhe
 */
public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;    

    //Construtor para preencher informações iniciais do livro.
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.paginaAtual = 0;
        this.aberto = false;
    }
    
    @Override
    public void abrir() {
        if(!this.isAberto()){
            this.setAberto(true);
            System.out.println("Livro foi aberto com sucesso!");
        }
        System.out.println();
    }

    @Override
    public void fechar() {
        if(this.isAberto()){
            this.setAberto(false);
            System.out.println("Livro foi fechado com sucesso!");
        }
        System.out.println();
    }

    @Override
    public void folhear(int pag) {
         if(this.isAberto() && pag >= 0 && pag <= this.totalPaginas){
            this.paginaAtual = pag;
            System.out.println("Folheando livro...");
            System.out.println("Pagina número " + this.getPaginaAtual());
        }else{
             System.out.println("Não foi possivel folhear este livro.");
         }
        System.out.println();
    }

    @Override
    public void avancarPagina() {
        if(this.isAberto() && this.paginaAtual < this.totalPaginas){
            this.paginaAtual++;
            System.out.println("Avançando página...");
            System.out.println("Pagina número " + this.getPaginaAtual());
        }
        System.out.println();
    }

    @Override
    public void voltarPagina() {
        if(this.isAberto() && this.paginaAtual > 0){
            this.paginaAtual--;
            System.out.println("Voltando página...");
            System.out.println("Pagina número " + this.getPaginaAtual());
        }
        System.out.println();
    }
    
    //Método para exibir os detalhes do livro.
    public void detalhes(){
        System.out.println("----LIVRO----");
        System.out.println("TÍTULO: " + this.getTitulo());
        System.out.println("AUTOR: " + this.getAutor());
        System.out.println("TOTAL PAGS: " + this.getTotalPaginas());
        System.out.println("LEITOR ATUAL: " + this.getLeitor());
        System.out.println("STATUS ABERTO: " + this.isAberto());
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public String getLeitor() {
        return leitor.getNome();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //Método principal para testar os métodos da classe Livro.
    public static void main(String[] args) {
        //Criando um objeto Pessoa.
        Pessoa pessoa1 = new Pessoa("Percy", 20, "Masculino");

        //Criando um objeto Livro.
        Livro livro1 = new Livro("Grego Antigo", "Olimpianos", 10, pessoa1);

        livro1.abrir();
        livro1.detalhes();
        livro1.folhear(2);
        livro1.avancarPagina();
        livro1.voltarPagina();
        livro1.fechar();

    }
    
}
