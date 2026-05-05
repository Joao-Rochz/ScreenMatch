package br.com.alura.screenmatch.modelos;

public class Titulo {

    //ATRIBUTOS
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    //MÉTODOS (AÇÃO)

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;  // TotalDeAvaliacao agora está como private, e se chama agora getTotalDeAvaliacao
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de Lançamento " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double obterMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
