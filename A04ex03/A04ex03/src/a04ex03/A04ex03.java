/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04ex03;

/**
 *
 * @author ALUNO
 */
public class A04ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float Num1 = Float.parseFloat(args[0]);
        float Num2 = Float.parseFloat(args[1]);
        float Divisao = Num1 % Num2;
        float Produto = Num1 * Num2;
        float Media = (Num1 + Num2) / 2;
        float Potencia = (float) Math.pow(Num1, Num2);
        
        System.out.println("O resto da divisão dos dois valores e: " + Divisao);
        System.out.println("O produto dos dois valores e: " + Produto);
        System.out.println("A media dos dois valores e: " + Media);
        System.out.println("A potencia dos dois valores e: " + Potencia);
    }
    
}
