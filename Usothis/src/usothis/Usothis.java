
package usothis;


public class Usothis {

    
    public static void main(String[] args) {
        Persona persona1 = new Persona("santiago","Mrv");
        System.out.println("pers" + persona1);
    
    
    }
    
    
  
    
    
}

class Imprimir {
    
    public  void imprimir (Persona persona){
        
         System.out.println("imprimimos persona desde el metodo imprimir" + persona); 
         System.out.println("imprimimos persona con uso this" + this); 
    }
    
}

