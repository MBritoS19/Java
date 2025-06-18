/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex02;

/**
 *
 * @author ALUNO
 */
public class A05ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length < 2)
            System.out.println("São necessarios dois argumentos: notas do aluno.");
        else
        {
            float nota1 = Float.parseFloat(args[0]);
            float nota2 = Float.parseFloat(args[1]);
            float media = (nota1 + nota2) / 2;
            String resultado = "Reprovado";
            if(media > 6.0)
                resultado = "Aprovado";
            System.out.println("Média: " + media + "\nResultado: " + resultado);
        }
            
    }
    
}
