/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author usuario
 */

public class CrearArchivo0 {
   
    public static void CrearArchivo(){
    File f = new File("C:\\Users\\usuario\\Desktop\\ArchivoDVY.txt");
    try{
      f.createNewFile();
    }catch(Exception e){
       
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CrearArchivo();
    }
    
}
