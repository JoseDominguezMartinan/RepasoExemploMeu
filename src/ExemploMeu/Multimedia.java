/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploMeu;

/**
 *
 * scribe una clase Multimedia para almacenar información de los objetos de tipo multimedia (películas, discos, mp3,mp4…). Esta clase contiene título, autor, formato, y duración como atributos. El formato puede ser uno de
 * los siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. El valor de todos los atributos se pasa por parámetro en el momento de crear el objeto. Esta clase tiene además, un método para devolver cada uno de los
 * atributos y un método toString() que devuelve la información del objeto. Por último, un método equals() que recibe un objeto de tipo Multimedia y devuelve true en caso de que el título y el autor sean iguales y false
 * en caso contrario.
 * @author jose
 */

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private String duracion;
    
   
    public Multimedia(String titulo,String autor,Formato formato,String duracion){
        this.titulo=titulo;
        this.autor=autor;
        this.formato=formato;
        this.duracion=duracion;
                
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public Formato getFormato(){
        return formato;
    }
    public String getDuracion(){
        return duracion;
    }
    @Override
    public String toString(){
        return "titulo "+titulo+"autor "+autor+"formato "+formato+"duracion "+duracion;
    }
    public boolean equals(Multimedia m){
        return titulo.equals(m.getTitulo())&&autor.equals(m.getAutor());
    }
}

