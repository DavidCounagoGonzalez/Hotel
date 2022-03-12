
package libreríahotel;

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
    
}
