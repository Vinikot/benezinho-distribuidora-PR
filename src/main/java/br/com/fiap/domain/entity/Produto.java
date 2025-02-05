package br.com.fiap.domain.entity;

import java.math.BigDecimal;

public class Produto {

    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal valor;

    public Produto(Long id, String nome, String descricao, BigDecimal valor) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setValor(valor);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", valor=" + getValor() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
