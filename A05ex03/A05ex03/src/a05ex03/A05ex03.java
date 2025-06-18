/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex03;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class A05ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite a primeira nota: ");
        float nota1 = new Scanner(System.in).nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = new Scanner(System.in).nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println("Digite a fequencia do aluno: ");
        float frequencia = new Scanner(System.in).nextFloat();
        String resultado = "Reprovado";
        if(media >= 6.0 && frequencia >= 75.0)
            resultado = "Aprovado";
        System.out.println("Media: " + media + "\nFequencia: " + frequencia + "%\nResultado: " + resultado);
    }
    
}
