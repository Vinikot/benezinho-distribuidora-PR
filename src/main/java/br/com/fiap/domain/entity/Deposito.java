package br.com.fiap.domain.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "TB_DEPOSITO")
public class Deposito {

    @Id
    @SequenceGenerator(name = "SQ_DEPOSITO", sequenceName = "SQ_DEPOSITO", allocationSize = 1,initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DEPOSITO")
    private Long id;

    @Column(name = "NM_DEPOSITO")
    private String nome;

    public Deposito(){
    }



}
