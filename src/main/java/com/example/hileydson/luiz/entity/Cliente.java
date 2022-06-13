package com.example.hileydson.luiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @Column(name = "cliente_id", nullable = false)
    private Long id;

    @Column(name = "cliente_nome", nullable = false)
    private String nome;

    public Cliente() {}

    public Cliente(String nome){
        this.nome = nome;
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
}
