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
public class Edificio {
    private String cor;
    
    private int quantPortas;
    private int quantAndares;
    private ArrayList<Porta> portola;
    private ArrayList<String> nomeAndares;
    private int portasAbertas;

    public int getPortasAbertas() {
        return portasAbertas;
    }

    public void setPortasAbertas(int portasAbertas) {
        this.portasAbertas = portasAbertas;
    }

    public int getQuantAndares() {
        return quantAndares;
    }

    public void setQuantAndares(int quantAndares) {
        this.quantAndares = nomeAndares.size();
    }

    public ArrayList<String> getNomeAndares() {
        return nomeAndares;
    }

    public void setNomeAndares(ArrayList<String> nomeAndares) {
        this.nomeAndares = nomeAndares;
    }

   
    
    public Edificio(){
        portola= new ArrayList<>();
        nomeAndares=new ArrayList<>();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

   

    public int getQuantPortas() {
        return quantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public ArrayList<Porta> getPortola() {
        return portola;
    }

    public void setPortola(ArrayList<Porta> portola) {
        this.portola = portola;
    }
     public void addPortas(Porta porta){
        portola.add(porta);
        
    }
     public void addAndar(String andar){
         nomeAndares.add(andar);
     }
      public void numAndares(){
         this.quantAndares=nomeAndares.size();
    }
    public void numPortas(){
         this.quantPortas=portola.size();
    }
     public void numPortasAberta(){
        
        for(int i=0; i<portola.size(); i++){
            
            if(portola.get(i).isStatus()== true){
                this.portasAbertas++; 
            }
        }
    }
}
