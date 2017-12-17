/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploMeu;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ExemploMeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String opcion;
        String actor;
        String actriz;
        String titulo;
        String autor;
        Formato formato;
        String duracion;
        String discografica;
        int anoLanzamento;
        String xenero;
        boolean i = true;
        //while( i==true){ // para facelo repetitivo podemos facelo co bucle while ou do while
        do {
            System.out.println("inserte un tipo de arquivo multimedia: Pelicula,Disco ou Single (calquera outra opcion saldra do programa)");
            opcion = sc1.nextLine();
            switch (opcion) {
                case "Pelicula":
                    // este case vamolo usar para por de exemplo de JOptionPane, no resto emprego o Scanner, tamen teremos aqui unha excepcion tratada

                    titulo = JOptionPane.showInputDialog("inserte o titulo");

                    autor = JOptionPane.showInputDialog("introduza o autor");
                    Formato[] formatos = {Formato.wav, Formato.mp3, Formato.midi, Formato.avi, Formato.mov, Formato.mpg, Formato.cdAudio, Formato.dvd};
                    formato = (Formato) (JOptionPane.showInputDialog(null, "seleccione un xenero ", "escolla", JOptionPane.QUESTION_MESSAGE, null, formatos, formatos[0]));
                    // formato = Formato.valueOf(sc.nextLine());

                    duracion = JOptionPane.showInputDialog("introduza a duracion");

                    actor = JOptionPane.showInputDialog("introduzca o actor principal");

                    actriz = JOptionPane.showInputDialog("introduzca a actriz principal");

                    try {

                        Pelicula pelicula1 = new Pelicula(actor, actriz, titulo, autor, formato, duracion);
                        System.out.println(pelicula1.toString());

                    } catch (ExcepcionNulos e) {
                        System.out.println("Non poden ser os dous actores nulos");
                    }
                    break;
                case "Disco":
                    System.out.println("inserte o nome do disco");
                    titulo = sc.nextLine();
                    System.out.println("inserte o nome do autor");
                    autor = sc.nextLine();
                    System.out.println("inserte o nome do formato");
                    formato = Formato.valueOf(sc.nextLine());
                    System.out.println("inserte a duracion do disco");
                    duracion = sc.nextLine();
                    System.out.println("inserte a discografica");
                    discografica = sc.nextLine();
                    System.out.println("inserte ano de lanzamento");
                    anoLanzamento = sc.nextInt();
                    Disco disco = new Disco(discografica, anoLanzamento, titulo, autor, formato, duracion);
                    System.out.println(disco.toString());
                    break;
                case "Single":
                    System.out.println("inserte o nome da canción");
                    titulo = sc.nextLine();
                    System.out.println("inserte o nome do autor");
                    autor = sc.nextLine();
                    System.out.println("inserte o nome do formato");
                    formato = Formato.valueOf(sc.nextLine());
                    System.out.println("inserte a duracion da cancion");
                    duracion = sc.nextLine();
                    System.out.println("ano de lanzamento");
                    anoLanzamento = sc.nextInt();
                    System.out.println("inserte o xenero");
                    xenero = sc.nextLine();
                    Single single = new Single(anoLanzamento, xenero, titulo, autor, formato, duracion);
                    System.out.println(single.toString());
                    break;
                default:
                    i = false;
            }
        } while (i == true);
    }

}
