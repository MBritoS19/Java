/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ALUNO
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa leo;
        leo = new Pessoa();
        
        leo.nome = "Leonardo Yuri Gomes";
        leo.peso = 150;
        leo.altura = 1.45;
        
        leo.imprimeDados();
        
        Pessoa vini = new Pessoa();
        
        vini.nome = "Vinicius";
        vini.peso = 160;
        vini.altura = 1.25;
        
        vini.imprimeDados();
        
        Carro onix = new Carro();
        onix.nome = "Onix";
        onix.montador = "Chevrolet";
        onix.cor = "Prata";
        onix.ano = 2023;
        
        System.out.println(onix.getNome());
        System.out.println(onix.getMontador());
        onix.imprimeDados();  
    }
    
}
