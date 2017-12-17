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
public class Disco extends Multimedia {
    private String discografica;
    private int anoLanzamento;

    public Disco(String discografica, int anoLanzamento, String titulo, String autor, Formato formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.discografica = discografica;
        this.anoLanzamento = anoLanzamento;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getAnoLanzamento() {
        return anoLanzamento;
    }

    public void setAnoLanzamento(int anoLanzamento) {
        this.anoLanzamento = anoLanzamento;
    }

    @Override
    public String toString() {
        return "Disco{" + "discografica=" + discografica + ", anoLanzamento=" + anoLanzamento + '}';
    }
    
    
    
}
