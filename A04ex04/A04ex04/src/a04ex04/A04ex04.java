/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04ex04;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class A04ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Digite a largura da parede: ");
        float largura = new Scanner(System.in).nextFloat();
        System.out.print("Digite a altura da parede: ");
        float altura = new Scanner(System.in).nextFloat();
        float tijolos = (largura * altura) * 20;
        System.out.println("Para construir a parede vamos precisar de: " + tijolos + " tijolos");
    }
    
}
