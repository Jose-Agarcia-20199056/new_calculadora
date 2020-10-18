package pkgnew.calculadora;

/**
 *
 * @author ginag
 */
public class aritmetica { // nombre de la clase
    
public  int suma(int num1,int num2){ // metodo suma
        
  return(num1+num2); // retorno de la operacion suma
  
} 
public  int resta(int num1,int num2){ // metodo resta
        
  return(num1-num2);// retorno de la operacion resta 
}
 public  int multiplicacion(int num1,int num2){ // metodo multiplicacion
        
  return(num1*num2);// retorno de la operacion multiplicacion
}
 public  int division(int num1,int num2){ // metodo division
        
  return(num1/num2); // retorno de la operacion divison 
}
 public double potencia(int num1,int num2){ // metodopotencia
        
  return(Math.pow(num1,num2)); // retorno de la operacion potencia 
}

    
}