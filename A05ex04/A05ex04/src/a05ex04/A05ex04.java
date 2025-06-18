/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex04;

/**
 *
 * @author ALUNO
 */
public class A05ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length < 2)
            System.out.println("Sao necessarios quatro argumentos: notas do aluno, numero de aulas e numero de faltas.");
        else
        {
            float nota1 = Float.parseFloat(args[0]);
            float nota2 = Float.parseFloat(args[1]);
            float aulas = Float.parseFloat(args[2]);
            float faltas = Float.parseFloat(args[3]);
            float media = (nota1 + nota2) / 2;
            float frequencia = ((aulas - faltas) / aulas) * 100;
            String resultado = "Reprovado";
            if(media >= 6.0 && frequencia >= 75.0)
                resultado = "Aprovado";
            System.out.println("Media: " + media + "\nFequencia: " + frequencia + "%\nResultado: " + resultado);
        }  
    }
    
}
