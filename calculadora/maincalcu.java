package pkgnew.calculadora;
import java.util.Scanner;
/**
 *
 * @author ginag
 */
public class NewCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // continuacion de calculadora
        Scanner entrada = new Scanner (System.in);//calse que detecta la entrada por teclado
        int select =0;// declaracion e iniciacion de variable
        aritmetica ari = new aritmetica();// nombrando la clase arimetica para ser invocada
        geometria geo = new geometria();// nombrando la clase geometria para ser invocada
    
        do{ // bucle do while principal ya que repetira el menu principal
         // menu principal por pantalla 
       System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
       System.out.println("^^^seleccione una opcion^^^");
       System.out.println("1- Calculo aritmetico");
       System.out.println("2- Calculo geometrico");
       System.out.println("0- salida");
       System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
       select = entrada.nextInt();// variable que guaradara la entrada por teclado
         
         // condicional que mostrar un error si escriben un numero diferente al del menu
        if(select>2){
            
         System.out.println("ERROR Digite un numero del menu");
                 
        }// este switch motrara los menu correspodinete segun la seleccion del usuario
        switch(select){
           
            case 1 :// menu aritmetico 
        {   //declaracion e iniciacion de variable
            int select1=0;
            do{ // bucle do while que repetira el menu arimentico hasta que el usuario salga
                
                System.out.println("^^^Menu Aritmetico^^^");
                System.out.println("^^^seleccione una opcion^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("01-Suma");
                System.out.println("02-Resta");
                System.out.println("03-Multiplicacion");
                System.out.println("04-Division");
                System.out.println("05-potencia");
                System.out.println("00-Menu anterior");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
                select1 = entrada.nextInt();// variable que  guardara la seleccion del usuario
                
                
                        
            // este switch  motrar por pantalla la operacion y el resultado que  seleccina el usuario        
                switch (select1) {
                    case 01:
                        {
                            int n1,n2 = 0; // declaracion de variables  e iniciacion
                            // salida por pantalal de los datos y resultado de la operacion seleccionada
                            System.out.println("^^Usted a elegido la suma^^");
                            System.out.println("Digite el primer numero");
                            n1= entrada.nextInt();
                            System.out.println("Digite el segundo numero");
                            n2= entrada.nextInt();
                            System.out.println("El resultado de la suma:"+ ari.suma(n1,n2));
                            break;
                        }
                    case 02:
                        {
                            int n1,n2 = 0;// declaracion de variables  e iniciacion
                            // salida por pantalal de los datos y resultado de la operacion seleccionada
                            System.out.println("^^Usted a elegido la resta^^");
                            System.out.println("Digite el primer numero");
                            n1= entrada.nextInt();
                            System.out.println("Digite el segundo numero");
                            n2= entrada.nextInt();
                            System.out.println("El resultado de la resta:"+ ari.resta(n1,n2));
                            break;
                        }
                    case 3:
                        {
                            int n1,n2 = 0;// declaracion de variables  e iniciacion
                            // salida por pantalal de los datos y resultado de la operacion seleccionada
                            System.out.println("^^Usted a elegido la multiplicacion^^");
                            System.out.println("Digite el primer numero");
                            n1= entrada.nextInt();
                            System.out.println("Digite el segundo numero");
                            n2= entrada.nextInt();
                            System.out.println("El resultado de la multiplicacion es :"+ ari.multiplicacion(n1,n2));
                            break;
                        }
                        
                    case 4:
                        {
                            int n1,n2 = 0;// declaracion de variables  e iniciacion
                             // salida por pantalal de los datos y resultado de la operacion seleccionada
                            System.out.println("^^Usted a elegido la division^^");
                            System.out.println("Digite el primer numero");
                            n1= entrada.nextInt();
                            System.out.println("Digite el segundo numero");
                            n2= entrada.nextInt();
                            System.out.println("El resultado de la divison es :"+ ari.division(n1,n2));
                            break;
                        }
                        case 5:
                            {
                            int n1,n2 = 0;// declaracion de variables  e iniciacion
                            // salida por pantalal de los datos y resultado de la operacion seleccionada
                            System.out.println("^^Usted a elegido la potencia^^");
                            System.out.println("Digite el valor de la base ");
                            n1= entrada.nextInt();
                            System.out.println("Digite elvalor del  exponente");
                            n2= entrada.nextInt();
                            System.out.println("Resultado de la potencia es :"+ ari.potencia(n1,n2));
                            break;
                        }
                            
                    default:// este default indicara al usuario que escribio un numero incorrecto del menu
                        System.out.println("ERROR Digite un numero del menu");
                        break;
                        
                   
                }
            }while(select1!=00);
            break;
        } 
        
         case 2 :{ // menu geometrico 
            int select1=0;// declaracion de variable e iniciacion 
            do{// bucle do while que repetira el menu arimentico hasta que el usuario salga
                
                System.out.println("^^^Menu geometrico^^^");
                System.out.println("^^^seleccione una opcion^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("01-Cuadrado");
                System.out.println("02-Rectangulo");
                System.out.println("03-Triangulo");
                System.out.println("04-circulo");
                System.out.println("00-Menu anterior");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
                select1 = entrada.nextInt();// variable que  guardara la seleccion del usuario
                
                switch (select1) { // este switch  motrar por pantalla la operacion y el resultado que  seleccina el usuario   
                    case 01:
                        {
                            double n1,n2 = 0;// declaracion de variables  e iniciacion
                            // salida por pantalal de los datos y resultado de la operacion seleccionada
                            System.out.println("^^Usted a elegido el cuadrado^^");
                            System.out.println("Escriba el valor del lado A");
                            n1= entrada.nextInt();
                            System.out.println("Escriba el valor del lado B");
                            n2= entrada.nextInt();
                            System.out.println("El Area del cuadrado es :"+ geo.Cuadrado(n1,n2));
                            break;
                        }
                    case 02:
                        {
                            int n1,n2 = 0;// declaracion de variables  e iniciacion
                            // salida por pantalal de los datos y resultado de la operacion seleccionada
                            System.out.println("^^Usted a elegido el Rectangulo^^");
                            System.out.println("Digite el valor de la base");
                            n1= entrada.nextInt();
                            System.out.println("Digite el valor de la altura");
                            n2= entrada.nextInt();
                            System.out.println("El Area del rectagulo es :"+ geo.Rectangulo(n1,n2));
                            break;
                        }
                    case 3:
                        {
                            double n1,n2 = 0;// declaracion de variables  e iniciacion
                            // salida por pantalal de los datos y resultado de la operacion seleccionada
                            System.out.println("^^Usted El Triangulo^^");
                            System.out.println("Digite el valor de la base");
                            n1= entrada.nextInt();
                            System.out.println("Digite el valor de la altura");
                            n2= entrada.nextInt();
                            System.out.println("El Area del Triangulo es  :"+ geo.Triangulo(n1,n2));
                            break;
                        }
                        
                    case 4:
                        {
                            double radio = 0; int exp = 2;// declaracion de variables  e iniciacion
                            // salida por pantalal de los datos y resultado de la operacion seleccionada
                            System.out.println("^^Usted El Circulo^^");
                            System.out.println("Digite el valor del radio");
                            radio= entrada.nextDouble();
                            
                            System.out.println("El Area del circulo es :"+ geo.Circulo(radio,exp));
                            break;
                        }
                        
                    default:// este default indicara al usuario que escribio un numero incorrecto del menu
                        System.out.println("ERROR Digite un numero del menu");
                        break;
                        
                   
                }
            }while(select1!=00);
            break;
        } 
        }
            
             
               
            
        
        }while(select!=0);
    }
                               // programa de jose garcia inicializado: 14/10/20 finalizado: 17/10/20
          
}
