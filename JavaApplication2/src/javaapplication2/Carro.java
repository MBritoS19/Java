/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ALUNO
 */
public class Carro {
    String nome;
    String cor;
    String montador;
    int ano;

    public String getNome() {
        return nome;
    }

    public String getMontador() {
        return montador;
    }
    
    public void imprimeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Montadora: " + this.montador);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
    }
}
