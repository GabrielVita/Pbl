/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Pbl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Casa casa1= new Casa();
        int r;
        Porta porta1= new Porta();
        casa1.setCor(JOptionPane.showInputDialog(null,"A cor da casa"));
        while(JOptionPane.showConfirmDialog(null,"Gostaria de criar uma porta?") == 0){
             porta1= new Porta();
            porta1.pinta(JOptionPane.showInputDialog(null,"Qual cor é a porta"));
            porta1.setDimensaox(Double.parseDouble(JOptionPane.showInputDialog(null,"Dimensão x da porta")));
            porta1.setDimensaoy(Double.parseDouble(JOptionPane.showInputDialog(null,"Dimensão y da porta")));
            porta1.setDimensaoz(Double.parseDouble(JOptionPane.showInputDialog(null,"Dimensão z da porta")));
            r=(Integer.parseInt(JOptionPane.showInputDialog(null,"Voce gostaria de abrir a porta?\n1-sim\n2-não")));
            if(r==1){
            porta1.abre();
            }
            
            casa1.addPortas(porta1);
            
        }
        casa1.numPortasAberta();
        casa1.numPortas();
        int b=0;
        while(b<casa1.getPortinha().size()){
            JOptionPane.showMessageDialog(null,"Cor da casa:\n" + casa1.getCor()+ "\n____________________\n" + "Quantidade de portas:\n" + casa1.getQuantPortas()+ "\n________________________\n" + "\nQuantidade de portas abertas:\n" + casa1.getPortasAbertas() + "\ncor da porta:\n" + casa1.getPortinha().get(b).getCor() ) ;
        b++;
        }
        
        
    }
    
}
