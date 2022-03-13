
package libreríahotel;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LibreríaHotel {

  
    public static void main(String[] args) {
        
        
        
    }
    public static boolean isNumeric(String cadena){
           try{
               Integer.parseInt(cadena);
               return true;
           }
           catch(NumberFormatException e){
               return false;
           }
        }
    
    public static void abrirArchivo(String archivo){

        try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(new File(archivo));

        }catch (IOException ex) {

            System.out.println(ex);

        }

    }
    
    public static int BuscarCadena (String archivo, String cadena){
        File file=new File(archivo);
        int lineasTotales=0;
        try{
            // comprobar la existencia del Archivo
        if(file.exists()){
            //Abrir Lectura del archivo
            BufferedReader lecturaArchivo = new BufferedReader(new FileReader(archivo));
            
            //Encontrar la linea
            String linea;
            
            while ((linea=lecturaArchivo.readLine())!=null){
                lineasTotales++;
                
                String[] palabras = linea.split(" ");
                
                for (int i=0;i<palabras.length;i++)
                    if(palabras[i].equals(cadena)){
                        System.out.println(lineasTotales);
                        
                    }
            }
        }
        }
         catch(Exception e){
             System.out.println(e.getMessage());
         }  
        
        return lineasTotales;
    }
    
//    public static void Borrado()
//    
}
