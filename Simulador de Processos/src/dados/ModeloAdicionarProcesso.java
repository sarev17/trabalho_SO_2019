/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author andre
 */
public class ModeloAdicionarProcesso {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ciclos
     */
    public int getCiclos() {
        return ciclos;
    }

    /**
     * @param ciclos the ciclos to set
     */
    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    /**
     * @return the tempoChegada
     */
    public int getTempoChegada() {
        return tempoChegada;
    }

    /**
     * @param tempoChegada the tempoChegada to set
     */
    public void setTempoChegada(int tempoChegada) {
        this.tempoChegada = tempoChegada;
    }

    /**
     * @return the prioridade
     */
    public int getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    private int id;
    private int ciclos;
    private int tempoChegada;
    private int prioridade;
    private String nome;
    
    
}
