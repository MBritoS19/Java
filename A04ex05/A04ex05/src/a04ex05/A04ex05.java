/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04ex05;

import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class A04ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String larguraS = JOptionPane.showInputDialog(null, "Digite a largura da parede: ");
        float largura = Float.parseFloat(larguraS);
        String alturaS = JOptionPane.showInputDialog(null, "Digite a altura da parede: ");
        float altura = Float.parseFloat(alturaS);
        float tijolos = (largura * altura) * 20;
        JOptionPane.showMessageDialog(null, "Para construir a parede vamos precisar de: " + tijolos + " tijolos", "Matheus", 1);

    }
    
}
