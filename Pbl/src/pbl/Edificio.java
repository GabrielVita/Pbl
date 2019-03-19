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
    private String nomeAndar;
    private int quantPortas;
    private ArrayList<Porta> portola;
    
    public Edificio(){
        portola= new ArrayList<>();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeAndar() {
        return nomeAndar;
    }

    public void setNomeAndar(String nomeAndar) {
        this.nomeAndar = nomeAndar;
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
    
}
