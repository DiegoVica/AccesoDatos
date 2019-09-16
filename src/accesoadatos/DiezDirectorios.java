/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import java.io.File;
import java.util.Scanner;



/**
 *
 * @author usuario
 */
public class DiezDirectorios {
    
     public static void main(String[] args) {
         Scanner t = new Scanner(System.in);
         System.out.println("Introduzca el nombre : ");
         String n = t.next();
      
       
       try{
          for(int i = 1; i<11; i++){
               File dir = new File("C:\\Users\\usuario\\Desktop\\"+n+""+i);
              dir.mkdir();
          }
       }catch(Exception e){
           
       }
       finally{
           t.close();
       }
    }
}
