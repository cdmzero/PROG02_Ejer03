
/**
 * 
 * PROG02_Tarea
 * Clase para probar los diferentes tipos de variables vistas en UT2
 * @author jfunez
 * 
 */
public class PROG02_Ejer03 {

    /**
     * Clase general 
     */
    
   
  
    
    public static void main(String[] args) {
        // Lo que se ejecutara siempre viene aqui
        
        boolean married     = true;
        final  int valMax   = 999999;
        byte    dWeek       = 1;
        int     nDayYear    = 300;
        String  sex         = "H";
        long  miliseseconds = 129833280000L ;
        double   totBill     = 13.4;
        long worldPeople    = 6775235741L;
        
        
        final String message =  " \nEl valor de la variable casado es " + married + "\n"
                + "El valor de la variable MAXIMO es " + valMax + "\n"
                + "El valor de la variable diasem es " + dWeek + "\n"
                + "El valor de la variable diaanual es " + nDayYear + "\n"
                + "El valor de la variable miliseg es " + miliseseconds + "\n"
                + "El valor de la variable totalfactura es " + totBill +"\n"
                + "El valor de la variable poblacion es " + worldPeople +  "\n"
                + "El valor de la variable sexo es "+ sex + "\n"; 
          
                                    
      System.out.print(message);
      
      System.out.println(message);
      
      System.out.printf(message);
      
      
                                    
    } //Cerramos la clase main                     
                                    
          
        
            
  
    
} //Cerramos la clase general
