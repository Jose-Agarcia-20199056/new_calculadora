package pkgnew.calculadora;

/**
 *
 * @author ginag
 */
public class geometria { // nombre de la clase
    
    public  double Cuadrado(double lad1,double lad2){ // Metodo del cuadrado
    
    return(lad1*lad2);// retorno de la operacion del  cuadrado       
    }
    
    public int Rectangulo(int base,int altura){ // Metodo del Rectangulo
        
       return(base*altura); // retorno de la operacion del Rectangulo 
        
    }
     public double Triangulo(double base,double altura){ // Metodo del Triangulo
        
       return(base*altura)/2;// retorno de la operacion del Triangulo 
        
    }
     public double Circulo(double radio, int exp){ // Metodo del Circulo 
        
       return((Math.PI)*Math.pow(radio,exp));// retorno de la operacion del Circulo
     }
} 