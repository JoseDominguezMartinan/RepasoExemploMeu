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
public class ExcepcionNulos extends Exception {

    public ExcepcionNulos() {
        super("non poden ser os dous actores nulos");
    }

    
    public ExcepcionNulos(String message) {
        super(message);
    }
    
}
