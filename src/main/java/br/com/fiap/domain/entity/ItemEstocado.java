package br.com.fiap.domain.entity;

import java.time.LocalDateTime;

public class ItemEstocado {

    private Long id;

    private Deposito deposito;

    private Produto produto;

    private LocalDateTime entrada;

    private LocalDateTime saida;

    private String numSerie;

    public ItemEstocado() {
    }

    public ItemEstocado(Long id, Deposito deposito, Produto produto, LocalDateTime entrada, LocalDateTime saida, String numSerie) {
        this.id = id;
        this.deposito = deposito;
        this.produto = produto;
        this.entrada = entrada;
        this.saida = saida;
        this.numSerie = numSerie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }


    @Override
    public String toString() {
        return "ItemEstocado{" +
                "id=" + id +
                ", deposito=" + deposito +
                ", produto=" + produto +
                ", entrada=" + entrada +
                ", saida=" + saida +
                ", numSerie='" + numSerie + '\'' +
                '}';
    }
}
