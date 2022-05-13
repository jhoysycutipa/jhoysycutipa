/**
 * tarea31
 */
import java.util.Scanner;
public class tarea11 {
static Scanner it=new Scanner(System.in);   
public static void main(String[] args) {
   //3.11
   //declarar variables     
    double a;
     int tiempo;
     String mensaje;
    //datos de entrada 
    System.out.println("ingrese la cantidad de años");
    tiempo=it.nextInt();
    //proceso
    if (tiempo>5) {
    a=1000;
    mensaje="usted recibira $"+a;
    }else if (tiempo>4) {a=500;
    mensaje="usted recibira $"+a;
    }else if (tiempo>3) {a=400;
    mensaje="usted recibira $"+a;
    }else if (tiempo>2) {a=300;
    mensaje="usted recibira $"+a;
  } else  {a=100;
    mensaje="usted recibira $"+a;
}
//datos de salida
System.out.println(mensaje);
}
    
}