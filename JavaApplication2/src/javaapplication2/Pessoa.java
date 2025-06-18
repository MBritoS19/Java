/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ALUNO
 */
public class Pessoa {
    public String nome;
    public double peso;
    public double altura;
    
    public void imprimeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: "+ this.peso);
        System.out.println("Altura: "+ this.altura);
    }
}
