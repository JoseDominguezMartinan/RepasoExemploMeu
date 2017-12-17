/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploMeu;

/**
 *
 * @author jose
 */
public class Single extends Multimedia {
    private int AnoLanzamento;
    private String xenero;

    public Single(int AnoLanzamento, String xenero, String titulo, String autor, Formato formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.AnoLanzamento = AnoLanzamento;
        this.xenero = xenero;
    }

    public int getAnoLanzamento() {
        return AnoLanzamento;
    }

    public void setAnoLanzamento(int AnoLanzamento) {
        this.AnoLanzamento = AnoLanzamento;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    @Override
    public String toString() {
        return "Single{" + "AnoLanzamento=" + AnoLanzamento + ", xenero=" + xenero + '}';
    }
    
    
    
}
