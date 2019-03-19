/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Casa {
    private String cor;
    private ArrayList<Porta> portinha;
    private int quantPortas;
    private int portasAbertas;

    public int getPortasAbertas() {
        return portasAbertas;
    }

    public void setPortasAbertas(int portasAbertas) {
        this.portasAbertas = portasAbertas;
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public void numPortasAberta(){
        
        for(int i=0; i<portinha.size(); i++){
            
            if(portinha.get(i).isStatus()== true){
                this.portasAbertas++; 
            }
        }
    }
    public void numPortas(){
         this.quantPortas=portinha.size();
    }
    
    public void addPortas(Porta porta){
        portinha.add(porta);
        
    }
    
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public ArrayList<Porta> getPortinha() {
        return portinha;
    }

    public void setPortinha(ArrayList<Porta> portinha) {
        this.portinha = portinha;
    }
    
    public Casa(){
        portinha=new ArrayList<>();
    }
    
}
