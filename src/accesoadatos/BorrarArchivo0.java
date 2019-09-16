/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import java.io.File;

/**
 *
 * @author usuario
 */
public class BorrarArchivo0 {
    public static void BorrarArchivo(){
       
        try{
          File f = new File("C:\\Users\\usuario\\Desktop\\ArchivoDVY.txt");
          if(f.exists()){
              f.delete();
          }
        }catch(Exception e){
           
        }
    }
    public static void main(String[] args) {
       BorrarArchivo();
    }
}
