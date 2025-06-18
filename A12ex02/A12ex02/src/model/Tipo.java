/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author jpescola
 */
@Entity
public class Tipo implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    @OneToMany(mappedBy = "tipo", fetch = FetchType.LAZY)
    private List<Cadastro> cadastro;

    public Tipo() {
    }

    public Tipo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cadastro> getCadastro() {
        return cadastro;
    }

    public void setCadastro(List<Cadastro> cadastro) {
        this.cadastro = cadastro;
    }

}
