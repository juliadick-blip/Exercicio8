/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author Julia
 */
public class Exercicio8 {

   public static void main(String[] args) {

        
        int A,B,X;
        
        A= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        B= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        X= A+B;
        
        JOptionPane.showMessageDialog(null, X);
   }
}
