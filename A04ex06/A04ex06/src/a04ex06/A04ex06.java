/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04ex06;

import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class A04ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String larguraS = JOptionPane.showInputDialog(null, "Digite a largura da parede: ");
        float largura = Float.parseFloat(larguraS);
        String alturaS = JOptionPane.showInputDialog(null, "Digite a altura da parede: ");
        float altura = Float.parseFloat(alturaS);
        float tijolos = (largura * altura) * 20;
        String tamanho;
        if(altura > 3.5)
            tamanho = "Alta";
        else if(altura < 3.0)
            tamanho = "Baixa";
        else
            tamanho = "Media";
        
        JOptionPane.showMessageDialog(null, "Para construir a parede vamos precisar de: " + tijolos + " tijolos, além disso a parede vai ficar " + tamanho, "Matheus", 1);
    }
    
}
