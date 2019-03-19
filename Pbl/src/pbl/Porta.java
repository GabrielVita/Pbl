/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

/**
 *
 * @author aluno
 */
public class Porta {
    private boolean status;
    private String cor;
    private double dimensaox;
    private double dimensaoz;
    private double dimensaoy;

    
    public void abre(){
        if(this.status== false){
            this.status = true;
        }
    }
    
    public void fecha(){
        if(this.status== true){
            this.status = false;
        }
    }
    
    public void pinta(String corsinha){
        this.cor= corsinha;
    }
    public Porta(){
        this.status=false;
    }
    
    
    
    
    
    
    
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaox() {
        return dimensaox;
    }

    public void setDimensaox(double dimensaox) {
        this.dimensaox = dimensaox;
    }

    public double getDimensaoz() {
        return dimensaoz;
    }

    public void setDimensaoz(double dimensaoz) {
        this.dimensaoz = dimensaoz;
    }

    public double getDimensaoy() {
        return dimensaoy;
    }

    public void setDimensaoy(double dimensaoy) {
        this.dimensaoy = dimensaoy;
    }
    
    
}
