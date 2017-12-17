/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploMeu;

/**
 *Escribe una clase Película que herede de la clase Multimedia anterior. La clase Película tiene, además de los atributos heredados, un actor principal y una actriz principal. Se permite que uno de los dos sea nulo,
 * pero no los dos. La clase debe tener dos métodos para obtener los nuevos atributos y debe sobreescribir el método toString() para reflejar la nueva información.
 * @author jose
 */
public class Pelicula extends Multimedia {
   private String actorPrincipal;
   private String actrizPrincipal;

 
    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, Formato formato, String duracion) throws ExcepcionNulos {
        super(titulo, autor, formato, duracion);
        
        if (actorPrincipal==null && actrizPrincipal==null)
            
         throw new ExcepcionNulos();  
         
           
            
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
        
        
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString()+"Pelicula{" + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + '}';
    }

    
    
  
    
   
   
}
